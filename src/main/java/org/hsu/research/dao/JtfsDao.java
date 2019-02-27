package org.hsu.research.dao;

import org.hsu.research.entity.Jtfs;

import java.util.List;

/**
 * @author times
 * @file JtfsDao.java
 * @time 2019/2/21
 */
public interface JtfsDao {
    List<Jtfs> queryJtfs();

    Jtfs queryJtfsByDm(String dm);
}
