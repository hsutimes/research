package org.hsu.research.dao;

import org.hsu.research.entity.Jfly;

import java.util.List;

/**
 * @author times
 * @file JflyDao.java
 * @time 2019/2/21
 */
public interface JflyDao {
    List<Jfly> queryJfly();

    Jfly queryJflyByDm(String dm);
}
