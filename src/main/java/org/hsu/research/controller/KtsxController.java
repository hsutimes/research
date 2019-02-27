package org.hsu.research.controller;

import org.hsu.research.entity.Ktsx;
import org.hsu.research.service.KtsxService;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author times
 * @file KtsxController.java
 * @time 2019/2/21
 */
@RestController
@CrossOrigin(origins = "*")
@RequestMapping(value = "/api", produces = "application/json")
public class KtsxController {
    @Autowired
    private KtsxService ktsxService;

    @GetMapping("/ktsxlist")
    public String getKtsxList() {
        List<Ktsx> ktsxList = ktsxService.getKtsxList();
        JSONObject obj = new JSONObject();
        JSONArray array = new JSONArray();
        for (Ktsx ktsx : ktsxList) {
            JSONObject o = new JSONObject();
            try {
                o.put("ktsxdm", ktsx.getKtsxdm());
                o.put("ktsx", ktsx.getKtsx());
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

    @GetMapping("/ktsx/{dm}")
    public String getKtsx(@PathVariable String dm) {
        JSONObject obj = new JSONObject();
        Ktsx ktsx;
        try {
            try {
                ktsx = ktsxService.getKtsxByDm(dm);
            } catch (RuntimeException e) {
                obj.put("status", false);
                obj.put("msg", e.getMessage());
                return obj.toString();
            }
            obj.put("status", true);
            JSONObject o = new JSONObject();
            o.put("ktsxdm", ktsx.getKtsxdm());
            o.put("ktsx", ktsx.getKtsx());
            obj.put("data", o);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return obj.toString();
    }
}
