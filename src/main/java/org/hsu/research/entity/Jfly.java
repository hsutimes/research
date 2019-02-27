package org.hsu.research.entity;

/**
 * 经费来源
 * @author times
 * @file Jfly.java
 * @time 2019/2/19
 */
public class Jfly {
    private String jflydm;
    private String jfly;

    public Jfly() {
    }

    public Jfly(String jflydm, String jfly) {
        this.jflydm = jflydm;
        this.jfly = jfly;
    }

    public String getJflydm() {
        return jflydm;
    }

    public void setJflydm(String jflydm) {
        this.jflydm = jflydm;
    }

    public String getJfly() {
        return jfly;
    }

    public void setJfly(String jfly) {
        this.jfly = jfly;
    }

    @Override
    public String toString() {
        return "Jfly{" +
                "jflydm='" + jflydm + '\'' +
                ", jfly='" + jfly + '\'' +
                '}';
    }
}
