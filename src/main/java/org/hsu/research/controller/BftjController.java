package org.hsu.research.controller;

import org.hsu.research.entity.Bftj;
import org.hsu.research.service.impl.BftjServiceImpl;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author times
 * @file BftjController.java
 * @time 2019/2/21
 */
@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api")
public class BftjController {
    @Autowired
    private BftjServiceImpl bftjService;

    @RequestMapping(value = "/bftjlist", method = RequestMethod.GET, produces = "application/json")
    public String getBftjList() {
        List<Bftj> bftjList = bftjService.getBftjList();
        JSONObject obj = new JSONObject();
        JSONArray array = new JSONArray();
        for (Bftj bftj : bftjList) {
            JSONObject o = new JSONObject();
            try {
                o.put("bftjdm", bftj.getBftjdm());
                o.put("bftj", bftj.getBftj());
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

    @RequestMapping(value = "/bftj/{dm}", method = RequestMethod.GET, produces = "application/json")
    public String getBftj(@PathVariable String dm) {
        JSONObject obj = new JSONObject();
        Bftj bftj;
        try {
            try {
                bftj = bftjService.getBftjByDm(dm);
            } catch (RuntimeException e) {
                obj.put("status", false);
                obj.put("msg", e.getMessage());
                return obj.toString();
            }
            obj.put("status", true);
            JSONObject o = new JSONObject();
            o.put("bftjdm", bftj.getBftjdm());
            o.put("bftj", bftj.getBftj());
            obj.put("data", o);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return obj.toString();
    }
}
