package org.hsu.research.entity;

/**
 * 学科分类
 * @author times
 * @file Xkfl.java
 * @time 2019/2/19
 */
public class Xkfl {
    private String xkfldm;
    private String xkfl;

    public Xkfl() {
    }

    public Xkfl(String xkfldm, String xkfl) {
        this.xkfldm = xkfldm;
        this.xkfl = xkfl;
    }

    public String getXkfldm() {
        return xkfldm;
    }

    public void setXkfldm(String xkfldm) {
        this.xkfldm = xkfldm;
    }

    public String getXkfl() {
        return xkfl;
    }

    public void setXkfl(String xkfl) {
        this.xkfl = xkfl;
    }

    @Override
    public String toString() {
        return "Xkfl{" +
                "xkfldm='" + xkfldm + '\'' +
                ", xkfl='" + xkfl + '\'' +
                '}';
    }
}
