package org.hsu.research.entity;


import org.json.JSONException;
import org.json.JSONObject;

/**
 * @author times
 * @file User.java
 * @time 2019/2/21
 */
public class User {
    private Integer id;
    private String name;
    private String pw;
    private String power;

    public User() {
    }

    public User(String name, String pw, String power) {
        this.name = name;
        this.pw = pw;
        this.power = power;
    }

    public User(Integer id, String name, String pw, String power) {
        this.id = id;
        this.name = name;
        this.pw = pw;
        this.power = power;
    }

    public String getPw() {
        return pw;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }

    public String toString() {
        JSONObject user = new JSONObject();
        try {
            user.put("id", id);
            user.put("name", name);
            user.put("power", power);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return user.toString();
    }
}
