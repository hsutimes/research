package org.hsu.research.controller;

import org.hsu.research.entity.Xkfl;
import org.hsu.research.service.XkflService;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author times
 * @file XkflController.java
 * @time 2019/2/21
 */
@RestController
@CrossOrigin(origins = "*")
@RequestMapping(value = "/api", produces = "application/json")
public class XkflController {
    @Autowired
    private XkflService xkflService;

    @GetMapping("/xkfllist")
    public String getXkflList() {
        List<Xkfl> xkflList = xkflService.getXkflList();
        JSONObject obj = new JSONObject();
        JSONArray array = new JSONArray();
        for (Xkfl xkfl : xkflList) {
            JSONObject o = new JSONObject();
            try {
                o.put("xkfldm", xkfl.getXkfldm());
                o.put("xkfl", xkfl.getXkfl());
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

    @GetMapping("/xkfl/{dm}")
    public String getXkfl(@PathVariable String dm) {
        JSONObject obj = new JSONObject();
        Xkfl xkfl;
        try {
            try {
                xkfl = xkflService.getXkflByDm(dm);
            } catch (RuntimeException e) {
                obj.put("status", false);
                obj.put("msg", e.getMessage());
                return obj.toString();
            }
            obj.put("status", true);
            JSONObject o = new JSONObject();
            o.put("xkfldm", xkfl.getXkfldm());
            o.put("xkfl", xkfl.getXkfl());
            obj.put("data", o);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return obj.toString();
    }
}
