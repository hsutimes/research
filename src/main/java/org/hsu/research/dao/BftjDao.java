package org.hsu.research.dao;

import org.hsu.research.entity.Bftj;

import java.util.List;

/**
 * @author times
 * @file BftjDao.java
 * @time 2019/2/21
 */
public interface BftjDao {
    List<Bftj> queryBftj();

    Bftj queryBftjByDm(String dm);
}
