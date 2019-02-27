package org.hsu.research.entity;

/**
 * 结题方式
 * @author times
 * @file Jtfs.java
 * @time 2019/2/19
 */
public class Jtfs {
    private String jtfsdm;
    private String jtfs;

    public Jtfs() {
    }

    public Jtfs(String jtfsdm, String jtfs) {
        this.jtfsdm = jtfsdm;
        this.jtfs = jtfs;
    }

    public String getJtfsdm() {
        return jtfsdm;
    }

    public void setJtfsdm(String jtfsdm) {
        this.jtfsdm = jtfsdm;
    }

    public String getJtfs() {
        return jtfs;
    }

    public void setJtfs(String jtfs) {
        this.jtfs = jtfs;
    }

    @Override
    public String toString() {
        return "Jtfs{" +
                "jtfsdm='" + jtfsdm + '\'' +
                ", jtfs='" + jtfs + '\'' +
                '}';
    }
}
