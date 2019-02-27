package org.hsu.research.dao;

import org.hsu.research.entity.Ktjb;

import java.util.List;

/**
 * @author times
 * @file KtjbDao.java
 * @time 2019/2/21
 */
public interface KtjbDao {
    List<Ktjb> queryKtjb();

    Ktjb queryKtjbByDm(String dm);
}
