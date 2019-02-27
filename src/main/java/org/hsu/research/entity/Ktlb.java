package org.hsu.research.entity;

/**
 * @author times
 * @file Ktlb.java
 * @time 2019/2/21
 */
public class Ktlb {
    private String ktlbdm;
    private String ktlb;

    public Ktlb() {
    }

    public Ktlb(String ktlbdm, String ktlb) {
        this.ktlbdm = ktlbdm;
        this.ktlb = ktlb;
    }

    public String getKtlbdm() {
        return ktlbdm;
    }

    public void setKtlbdm(String ktlbdm) {
        this.ktlbdm = ktlbdm;
    }

    public String getKtlb() {
        return ktlb;
    }

    public void setKtlb(String ktlb) {
        this.ktlb = ktlb;
    }

    @Override
    public String toString() {
        return "Ktlb{" +
                "ktlbdm='" + ktlbdm + '\'' +
                ", ktlb='" + ktlb + '\'' +
                '}';
    }
}
