package org.hsu.research.entity;

import java.util.Date;

/**
 * 科研项目数据
 *
 * @author times
 * @file BasicInfo.java
 * @time 2019/2/19
 */
public class BasicInfo {
    private String projectno;
    private String projectname;
    private String hostid;
    private String hostname;
    private String ktjbdm;
    private String ktsxdm;
    private String ktlbdm;
    private String ktfxdm;
    private String xkfldm;
    private String jtfsdm;
    private String sbdwdm;
    private String jflydm;
    private String bftjdm;
    private Date pzsj;
    private Date wcsj;
    private Double zjf;
    private String member1;
    private String member2;
    private String member3;
    private String member4;
    private String member5;
    private String sftj;
    private String sflx;

    public BasicInfo() {
    }

    public BasicInfo(String projectno, String projectname, String hostid, String hostname, String ktjbdm,
                     String ktsxdm, String ktlbdm, String ktfxdm, String xkfldm, String jtfsdm, String sbdwdm,
                     String jflydm, String bftjdm, Date pzsj, Date wcsj, Double zjf, String member1, String member2,
                     String member3, String member4, String member5, String sftj, String sflx) {
        this.projectno = projectno;
        this.projectname = projectname;
        this.hostid = hostid;
        this.hostname = hostname;
        this.ktjbdm = ktjbdm;
        this.ktsxdm = ktsxdm;
        this.ktlbdm = ktlbdm;
        this.ktfxdm = ktfxdm;
        this.xkfldm = xkfldm;
        this.jtfsdm = jtfsdm;
        this.sbdwdm = sbdwdm;
        this.jflydm = jflydm;
        this.bftjdm = bftjdm;
        this.pzsj = pzsj;
        this.wcsj = wcsj;
        this.zjf = zjf;
        this.member1 = member1;
        this.member2 = member2;
        this.member3 = member3;
        this.member4 = member4;
        this.member5 = member5;
        this.sftj = sftj;
        this.sflx = sflx;
    }

    public String getProjectno() {
        return projectno;
    }

    public void setProjectno(String projectno) {
        this.projectno = projectno;
    }

    public String getProjectname() {
        return projectname;
    }

    public void setProjectname(String projectname) {
        this.projectname = projectname;
    }

    public String getHostid() {
        return hostid;
    }

    public void setHostid(String hostid) {
        this.hostid = hostid;
    }

    public String getHostname() {
        return hostname;
    }

    public void setHostname(String hostname) {
        this.hostname = hostname;
    }

    public String getKtjbdm() {
        return ktjbdm;
    }

    public void setKtjbdm(String ktjbdm) {
        this.ktjbdm = ktjbdm;
    }

    public String getKtsxdm() {
        return ktsxdm;
    }

    public void setKtsxdm(String ktsxdm) {
        this.ktsxdm = ktsxdm;
    }

    public String getKtlbdm() {
        return ktlbdm;
    }

    public void setKtlbdm(String ktlbdm) {
        this.ktlbdm = ktlbdm;
    }

    public String getKtfxdm() {
        return ktfxdm;
    }

    public void setKtfxdm(String ktfxdm) {
        this.ktfxdm = ktfxdm;
    }

    public String getXkfldm() {
        return xkfldm;
    }

    public void setXkfldm(String xkfldm) {
        this.xkfldm = xkfldm;
    }

    public String getJtfsdm() {
        return jtfsdm;
    }

    public void setJtfsdm(String jtfsdm) {
        this.jtfsdm = jtfsdm;
    }

    public String getSbdwdm() {
        return sbdwdm;
    }

    public void setSbdwdm(String sbdwdm) {
        this.sbdwdm = sbdwdm;
    }

    public String getJflydm() {
        return jflydm;
    }

    public void setJflydm(String jflydm) {
        this.jflydm = jflydm;
    }

    public String getBftjdm() {
        return bftjdm;
    }

    public void setBftjdm(String bftjdm) {
        this.bftjdm = bftjdm;
    }

    public Date getPzsj() {
        return pzsj;
    }

    public void setPzsj(Date pzsj) {
        this.pzsj = pzsj;
    }

    public Date getWcsj() {
        return wcsj;
    }

    public void setWcsj(Date wcsj) {
        this.wcsj = wcsj;
    }

    public Double getZjf() {
        return zjf;
    }

    public void setZjf(Double zjf) {
        this.zjf = zjf;
    }

    public String getMember1() {
        return member1;
    }

    public void setMember1(String member1) {
        this.member1 = member1;
    }

    public String getMember2() {
        return member2;
    }

    public void setMember2(String member2) {
        this.member2 = member2;
    }

    public String getMember3() {
        return member3;
    }

    public void setMember3(String member3) {
        this.member3 = member3;
    }

    public String getMember4() {
        return member4;
    }

    public void setMember4(String member4) {
        this.member4 = member4;
    }

    public String getMember5() {
        return member5;
    }

    public void setMember5(String member5) {
        this.member5 = member5;
    }

    public String getSftj() {
        return sftj;
    }

    public void setSftj(String sftj) {
        this.sftj = sftj;
    }

    public String getSflx() {
        return sflx;
    }

    public void setSflx(String sflx) {
        this.sflx = sflx;
    }

    @Override
    public String toString() {
        return "{" +
                "projectno='" + projectno + '\'' +
                ", projectname='" + projectname + '\'' +
                ", hostid='" + hostid + '\'' +
                ", hostname='" + hostname + '\'' +
                ", ktjbdm='" + ktjbdm + '\'' +
                ", ktsxdm='" + ktsxdm + '\'' +
                ", ktlbdm='" + ktlbdm + '\'' +
                ", ktfxdm='" + ktfxdm + '\'' +
                ", xkfldm='" + xkfldm + '\'' +
                ", jtfsdm='" + jtfsdm + '\'' +
                ", sbdwdm='" + sbdwdm + '\'' +
                ", jflydm='" + jflydm + '\'' +
                ", bftjdm='" + bftjdm + '\'' +
                ", pzsj='" + pzsj + '\'' +
                ", wcsj='" + wcsj + '\'' +
                ", zjf=" + zjf +
                ", member1='" + member1 + '\'' +
                ", member2='" + member2 + '\'' +
                ", member3='" + member3 + '\'' +
                ", member4='" + member4 + '\'' +
                ", member5='" + member5 + '\'' +
                ", sftj='" + sftj + '\'' +
                ", sflx='" + sflx + '\'' +
                '}';
    }
}
