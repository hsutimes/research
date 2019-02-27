package org.hsu.research.entity;

/**
 * 课题级别
 * @author times
 * @file Ktjb.java
 * @time 2019/2/19
 */
public class Ktjb {
    private String ktjbdm;
    private String ktjb;

    public Ktjb() {
    }

    public Ktjb(String ktjbdm, String ktjb) {
        this.ktjbdm = ktjbdm;
        this.ktjb = ktjb;
    }

    public String getKtjbdm() {
        return ktjbdm;
    }

    public void setKtjbdm(String ktjbdm) {
        this.ktjbdm = ktjbdm;
    }

    public String getKtjb() {
        return ktjb;
    }

    public void setKtjb(String ktjb) {
        this.ktjb = ktjb;
    }

    @Override
    public String toString() {
        return "Ktjb{" +
                "ktjbdm='" + ktjbdm + '\'' +
                ", ktjb='" + ktjb + '\'' +
                '}';
    }
}
