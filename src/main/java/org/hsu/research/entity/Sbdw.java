package org.hsu.research.entity;

/**
 * 申报单位
 * @author times
 * @file Sbdw.java
 * @time 2019/2/19
 */
public class Sbdw {
    private String sbdwdm;
    private String sbdw;

    public Sbdw() {
    }

    public Sbdw(String sbdwdm, String sbdw) {
        this.sbdwdm = sbdwdm;
        this.sbdw = sbdw;
    }

    public String getSbdwdm() {
        return sbdwdm;
    }

    public void setSbdwdm(String sbdwdm) {
        this.sbdwdm = sbdwdm;
    }

    public String getSbdw() {
        return sbdw;
    }

    public void setSbdw(String sbdw) {
        this.sbdw = sbdw;
    }

    @Override
    public String toString() {
        return "Sbdw{" +
                "sbdwdm='" + sbdwdm + '\'' +
                ", sbdw='" + sbdw + '\'' +
                '}';
    }
}
