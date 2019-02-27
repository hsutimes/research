package org.hsu.research.entity;

/**
 * 课题属性
 * @author times
 * @file Ktsx.java
 * @time 2019/2/19
 */
public class Ktsx {
    private String ktsxdm;
    private String ktsx;

    public Ktsx() {
    }

    public Ktsx(String ktsxdm, String ktsx) {
        this.ktsxdm = ktsxdm;
        this.ktsx = ktsx;
    }

    public String getKtsxdm() {
        return ktsxdm;
    }

    public void setKtsxdm(String ktsxdm) {
        this.ktsxdm = ktsxdm;
    }

    public String getKtsx() {
        return ktsx;
    }

    public void setKtsx(String ktsx) {
        this.ktsx = ktsx;
    }

    @Override
    public String toString() {
        return "Ktsx{" +
                "ktsxdm='" + ktsxdm + '\'' +
                ", ktsx='" + ktsx + '\'' +
                '}';
    }
}
