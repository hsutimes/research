package org.hsu.research.entity;

/**
 * 拨付途径
 * @author times
 * @file Bftj.java
 * @time 2019/2/19
 */
public class Bftj {
    private String bftjdm;
    private String bftj;

    public Bftj() {
    }

    public Bftj(String bftjdm, String bftj) {
        this.bftjdm = bftjdm;
        this.bftj = bftj;
    }

    public String getBftjdm() {
        return bftjdm;
    }

    public void setBftjdm(String bftjdm) {
        this.bftjdm = bftjdm;
    }

    public String getBftj() {
        return bftj;
    }

    public void setBftj(String bftj) {
        this.bftj = bftj;
    }

    @Override
    public String toString() {
        return "Bftj{" +
                "bftjdm='" + bftjdm + '\'' +
                ", bftj='" + bftj + '\'' +
                '}';
    }
}
