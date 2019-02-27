package org.hsu.research.dao;

import org.hsu.research.entity.Xkfl;

import java.util.List;

/**
 * @author times
 * @file XkflDao.java
 * @time 2019/2/21
 */
public interface XkflDao {
    List<Xkfl> queryXkfl();

    Xkfl queryXkflByDm(String dm);
}
