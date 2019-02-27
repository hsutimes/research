package org.hsu.research.dao;

import org.hsu.research.entity.Ktsx;

import java.util.List;

/**
 * @author times
 * @file KtsxDao.java
 * @time 2019/2/21
 */
public interface KtsxDao {
    List<Ktsx> queryKtsx();

    Ktsx queryKtsxByDm(String dm);
}
