package org.hsu.research.controller;

import org.hsu.research.entity.Jfly;
import org.hsu.research.service.JflyService;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author times
 * @file JflyController.java
 * @time 2019/2/21
 */
@RestController
@CrossOrigin(origins = "*")
@RequestMapping(value = "/api", produces = "application/json")
public class JflyController {
    @Autowired
    private JflyService jflyService;

    @GetMapping("/jflylist")
    public String getJflyList() {
        List<Jfly> jflyList = jflyService.getJflyList();
        JSONObject obj = new JSONObject();
        JSONArray array = new JSONArray();
        for (Jfly jfly : jflyList) {
            JSONObject o = new JSONObject();
            try {
                o.put("jflydm", jfly.getJflydm());
                o.put("jfly", jfly.getJfly());
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

    @GetMapping("/jfly/{dm}")
    public String getJfly(@PathVariable String dm) {
        JSONObject obj = new JSONObject();
        Jfly jfly;
        try {
            try {
                jfly = jflyService.getJflyByDm(dm);
            } catch (RuntimeException e) {
                obj.put("status", false);
                obj.put("msg", e.getMessage());
                return obj.toString();
            }
            obj.put("status", true);
            JSONObject o = new JSONObject();
            o.put("jflydm", jfly.getJflydm());
            o.put("jfly", jfly.getJfly());
            obj.put("data", o);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return obj.toString();
    }
}
