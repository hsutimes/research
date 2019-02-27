package org.hsu.research.controller;

import org.hsu.research.entity.Ktjb;
import org.hsu.research.service.KtjbService;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author times
 * @file KtjbController.java
 * @time 2019/2/21
 */
@RestController
@CrossOrigin(origins = "*")
@RequestMapping(value = "/api", produces = "application/json")
public class KtjbController {
    @Autowired
    private KtjbService ktjbService;

    @GetMapping("/ktjblist")
    public String getKtjbList() {
        List<Ktjb> ktjbList = ktjbService.getKtjbList();
        JSONObject obj = new JSONObject();
        JSONArray array = new JSONArray();
        for (Ktjb ktjb : ktjbList) {
            JSONObject o = new JSONObject();
            try {
                o.put("ktjbdm", ktjb.getKtjbdm());
                o.put("ktjb", ktjb.getKtjb());
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

    @GetMapping("/ktjb/{dm}")
    public String getKtjb(@PathVariable String dm) {
        JSONObject obj = new JSONObject();
        Ktjb ktjb;
        try {
            try {
                ktjb = ktjbService.getKtjbByDm(dm);
            } catch (RuntimeException e) {
                obj.put("status", false);
                obj.put("msg", e.getMessage());
                return obj.toString();
            }
            obj.put("status", true);
            JSONObject o = new JSONObject();
            o.put("ktjbdm", ktjb.getKtjbdm());
            o.put("ktjb", ktjb.getKtjb());
            obj.put("data", o);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return obj.toString();
    }
}
