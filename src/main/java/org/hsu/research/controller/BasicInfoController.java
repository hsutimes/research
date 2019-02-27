package org.hsu.research.controller;

import org.hsu.research.entity.BasicInfo;
import org.hsu.research.service.BasicInfoService;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author times
 * @file BasicInfoController.java
 * @time 2019/2/21
 */
@RestController
@CrossOrigin(origins = "*")
@RequestMapping(value = "/api", produces = "application/json")
public class BasicInfoController {
    @Autowired
    private BasicInfoService basicInfoService;

    @GetMapping("basicinfolist")
    public String getBasicInfoList() {
        List<BasicInfo> basicInfoList = basicInfoService.getBasicInfoList();
        JSONObject obj = new JSONObject();
        JSONArray array = new JSONArray();
        for (BasicInfo basicInfo : basicInfoList) {
            try {
                array.put(new JSONObject(basicInfo.toString()));
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        try {
            obj.put("status", "true");
            obj.put("data", array);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return obj.toString();
    }

    @GetMapping("/basicinfo/{no}")
    public String getBasicInfo(@PathVariable String no) {
        JSONObject obj = new JSONObject();
        BasicInfo basicInfo;
        try {
            try {
                basicInfo = basicInfoService.getBasicInfoByNo(no);
            } catch (RuntimeException e) {
                obj.put("status", false);
                obj.put("msg", e.getMessage());
                return obj.toString();
            }
            obj.put("status", true);
            obj.put("data", new JSONObject(basicInfo.toString()));
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return obj.toString();
    }
}
