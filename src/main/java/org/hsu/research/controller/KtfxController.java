package org.hsu.research.controller;

import org.hsu.research.entity.Ktfx;
import org.hsu.research.service.KtfxService;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author times
 * @file KtfxController.java
 * @time 2019/2/21
 */
@RestController
@CrossOrigin(origins = "*")
@RequestMapping(value = "/api", produces = "application/json")
public class KtfxController {
    @Autowired
    private KtfxService ktfxService;

    @GetMapping("/ktfxlist")
    public String getKtfxList() {
        List<Ktfx> ktfxList = ktfxService.getKtfxList();
        JSONObject obj = new JSONObject();
        JSONArray array = new JSONArray();
        for (Ktfx ktfx : ktfxList) {
            JSONObject o = new JSONObject();
            try {
                o.put("ktfxdm", ktfx.getKtfxdm());
                o.put("ktfx", ktfx.getKtfx());
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

    @GetMapping("/ktfx/{dm}")
    public String getKtfx(@PathVariable String dm) {
        JSONObject obj = new JSONObject();
        Ktfx ktfx;
        try {
            try {
                ktfx = ktfxService.getKtfxByDm(dm);
            } catch (RuntimeException e) {
                obj.put("status", false);
                obj.put("msg", e.getMessage());
                return obj.toString();
            }
            obj.put("status", true);
            JSONObject o = new JSONObject();
            o.put("ktfxdm", ktfx.getKtfxdm());
            o.put("ktfx", ktfx.getKtfx());
            obj.put("data", o);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return obj.toString();
    }
}
