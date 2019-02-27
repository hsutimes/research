package org.hsu.research.entity;

/**
 * 课题方向
 * @author times
 * @file Ktfx.java
 * @time 2019/2/19
 */
public class Ktfx {
    private String ktfxdm;
    private String ktfx;

    public Ktfx() {
    }

    public Ktfx(String ktfxdm, String ktfx) {
        this.ktfxdm = ktfxdm;
        this.ktfx = ktfx;
    }

    public String getKtfxdm() {
        return ktfxdm;
    }

    public void setKtfxdm(String ktfxdm) {
        this.ktfxdm = ktfxdm;
    }

    public String getKtfx() {
        return ktfx;
    }

    public void setKtfx(String ktfx) {
        this.ktfx = ktfx;
    }

    @Override
    public String toString() {
        return "Ktfx{" +
                "ktfxdm='" + ktfxdm + '\'' +
                ", ktfx='" + ktfx + '\'' +
                '}';
    }
}
