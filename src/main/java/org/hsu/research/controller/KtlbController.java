package org.hsu.research.controller;

import org.hsu.research.entity.Ktlb;
import org.hsu.research.service.KtlbService;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author times
 * @file KtlbController.java
 * @time 2019/2/21
 */
@RestController
@CrossOrigin(origins = "*")
@RequestMapping(value = "/api", produces = "application/json")
public class KtlbController {
    @Autowired
    private KtlbService ktlbService;

    @GetMapping("/ktlblist")
    public String getKtlbList() {
        List<Ktlb> ktlbList = ktlbService.getKtlbList();
        JSONObject obj = new JSONObject();
        JSONArray array = new JSONArray();
        for (Ktlb ktlb : ktlbList) {
            JSONObject o = new JSONObject();
            try {
                o.put("ktlbdm", ktlb.getKtlbdm());
                o.put("ktlb", ktlb.getKtlb());
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

    @GetMapping("/ktlb/{dm}")
    public String getKtlb(@PathVariable String dm) {
        JSONObject obj = new JSONObject();
        Ktlb ktlb;
        try {
            try {
                ktlb = ktlbService.getKtlbByDm(dm);
            } catch (RuntimeException e) {
                obj.put("status", false);
                obj.put("msg", e.getMessage());
                return obj.toString();
            }
            obj.put("status", true);
            JSONObject o = new JSONObject();
            o.put("ktlbdm", ktlb.getKtlbdm());
            o.put("ktlb", ktlb.getKtlb());
            obj.put("data", o);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return obj.toString();
    }
}
