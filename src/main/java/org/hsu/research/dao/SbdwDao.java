package org.hsu.research.dao;

import org.hsu.research.entity.Sbdw;

import java.util.List;

/**
 * @author times
 * @file SbdwDao.java
 * @time 2019/2/21
 */
public interface SbdwDao {
    List<Sbdw> querySbdw();

    Sbdw querySbdwByDm(String dm);
}
