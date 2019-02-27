package org.hsu.research.controller;

import org.hsu.research.entity.User;
import org.hsu.research.service.impl.UserServiceImpl;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

/**
 * @author times
 * @file UserController.java
 * @time 2019/2/21
 */
@RestController
@CrossOrigin(origins = "*")
@RequestMapping(value = "/api", produces = "application/json")
public class UserController {

    @Autowired
    private UserServiceImpl userService;

    @GetMapping("/test")
    public String test() {
        JSONObject obj = null;
        try {
            obj = new JSONObject("{test:'test'}");
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return obj.toString();
    }

    /**
     * 登录验证
     * 因为@RequestBody中的参数只能读取一次，内部的流限制为只能读取一次,所以之后参数不能使用
     *
     * @param map
     * @return
     */
    @RequestMapping(value = "/login", method = RequestMethod.POST, produces = "application/json")
    public String login(@RequestBody Map<String, Object> map) {
        JSONObject obj = new JSONObject();
        String name = map.get("name").toString();
        String pw = map.get("pw").toString();
        int power = Integer.valueOf(map.get("power").toString());
        try {
            boolean bool = userService.login(name, pw, power);
            if (bool) {
                User user = userService.getUserByName(name);
                obj.put("status", true);
                obj.put("msg", "登录成功");
                obj.put("auth", new JSONObject(user.toString()));
            }
        } catch (RuntimeException e) {
            try {
                obj.put("status", false);
                obj.put("msg", e.getMessage());
            } catch (JSONException e1) {
                e1.printStackTrace();
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return obj.toString();
    }

    /**
     * 获取所有用户的信息
     *
     * @return
     */
    @RequestMapping(value = "/userlist", method = RequestMethod.GET, produces = "application/json")
    public String getUserList() {
        List<User> userList = userService.getUserList();
        JSONObject obj = new JSONObject();
        JSONArray array = new JSONArray();
        for (User user : userList) {
            JSONObject o = new JSONObject();
            try {
                o.put("id", user.getId());
                o.put("name", user.getName());
                o.put("power", user.getPower());
            } catch (JSONException e) {
                e.printStackTrace();
            }
            array.put(o);
        }
        try {
            obj.put("status", "true");
            obj.put("data", array);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return obj.toString();
    }

    @RequestMapping(value = "/user/{id}", method = RequestMethod.GET, produces = "application/json")
    public String getUserInfo(@PathVariable int id) {
        JSONObject obj = new JSONObject();
        User user;
        try {
            try {
                user = userService.getUserById(id);
            } catch (RuntimeException e) {
                obj.put("status", false);
                obj.put("msg", e.getMessage());
                return obj.toString();
            }
            obj.put("status", true);
            JSONObject o = new JSONObject();
            o.put("id", user.getId());
            o.put("name", user.getName());
            o.put("power", user.getPower());
            obj.put("data", o);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return obj.toString();
    }

    /**
     * 添加用户
     *
     * @param name
     * @param pw
     * @param power
     * @return
     */
    @PostMapping(value = "/add/user", produces = "application/json")
    public String addUser(@RequestParam String name, @RequestParam String pw, @RequestParam String power) {
        JSONObject obj = new JSONObject();
        User user = new User(name, pw, power);
        try {
            if (userService.addUser(user)) {
                obj.put("status", true);
                obj.put("msg", "添加成功");
            } else {
                obj.put("status", false);
                obj.put("msg", "添加失败");
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return obj.toString();
    }

    /**
     * 修改用户信息
     *
     * @param user
     * @return
     */
    @PostMapping(value = "/update/user", produces = "application/json")
    public String updateUser(@RequestBody User user) {
        JSONObject obj = new JSONObject();
        try {
            if (userService.modifyUser(user)) {
                obj.put("status", true);
                obj.put("msg", "修改成功");
            } else {
                obj.put("status", false);
                obj.put("msg", "修改失败");
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return obj.toString();
    }

    /**
     * 删除用户
     *
     * @param id
     * @return
     */
    @PostMapping(value = "/delete/user", produces = "application/json")
    public String deleteUser(@RequestParam int id) {
        JSONObject obj = new JSONObject();
        try {
            if (userService.deleteUser(id)) {
                obj.put("status", true);
                obj.put("msg", "删除成功");
            } else {
                obj.put("status", false);
                obj.put("msg", "删除失败");
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return obj.toString();
    }
}
