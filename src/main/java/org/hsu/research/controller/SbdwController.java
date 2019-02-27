package org.hsu.research.controller;

import org.hsu.research.entity.Sbdw;
import org.hsu.research.service.SbdwService;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author times
 * @file SbdwController.java
 * @time 2019/2/21
 */
@RestController
@CrossOrigin(origins = "*")
@RequestMapping(value = "/api", produces = "application/json")
public class SbdwController {
    @Autowired
    private SbdwService sbdwService;

    @GetMapping("/sbdwlist")
    public String getSbdwList() {
        List<Sbdw> sbdwList = sbdwService.getSbdwList();
        JSONObject obj = new JSONObject();
        JSONArray array = new JSONArray();
        for (Sbdw sbdw : sbdwList) {
            JSONObject o = new JSONObject();
            try {
                o.put("sbdwdm", sbdw.getSbdwdm());
                o.put("sbdw", sbdw.getSbdw());
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

    @GetMapping("/sbdw/{dm}")
    public String getSbdw(@PathVariable String dm) {
        JSONObject obj = new JSONObject();
        Sbdw sbdw;
        try {
            try {
                sbdw = sbdwService.getSbdwByDm(dm);
            } catch (RuntimeException e) {
                obj.put("status", false);
                obj.put("msg", e.getMessage());
                return obj.toString();
            }
            obj.put("status", true);
            JSONObject o = new JSONObject();
            o.put("sbdwdm", sbdw.getSbdwdm());
            o.put("sbdw", sbdw.getSbdw());
            obj.put("data", o);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return obj.toString();
    }
}
