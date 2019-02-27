package org.hsu.research.dao;

import org.hsu.research.entity.Ktlb;

import java.util.List;

/**
 * @author times
 * @file KtlbDao.java
 * @time 2019/2/21
 */
public interface KtlbDao {
    List<Ktlb> queryKtlb();

    Ktlb queryKtlbByDm(String dm);
}
