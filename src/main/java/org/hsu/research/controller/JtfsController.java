package org.hsu.research.controller;

import org.hsu.research.entity.Jtfs;
import org.hsu.research.service.JtfsService;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author times
 * @file JtfsController.java
 * @time 2019/2/21
 */
@RestController
@CrossOrigin(origins = "*")
@RequestMapping(value = "/api", produces = "application/json")
public class JtfsController {
    @Autowired
    private JtfsService jtfsService;

    @GetMapping("/jtfslist")
    public String getJtfsList() {
        List<Jtfs> jtfsList = jtfsService.getJtfsList();
        JSONObject obj = new JSONObject();
        JSONArray array = new JSONArray();
        for (Jtfs jtfs : jtfsList) {
            JSONObject o = new JSONObject();
            try {
                o.put("jtfsdm", jtfs.getJtfsdm());
                o.put("jtfs", jtfs.getJtfs());
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

    @GetMapping("/jtfs/{dm}")
    public String getJtfs(@PathVariable String dm) {
        JSONObject obj = new JSONObject();
        Jtfs jtfs;
        try {
            try {
                jtfs = jtfsService.getJtfsByDm(dm);
            } catch (RuntimeException e) {
                obj.put("status", false);
                obj.put("msg", e.getMessage());
                return obj.toString();
            }
            obj.put("status", true);
            JSONObject o = new JSONObject();
            o.put("jtfsdm", jtfs.getJtfsdm());
            o.put("jtfs", jtfs.getJtfs());
            obj.put("data", o);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return obj.toString();
    }
}
