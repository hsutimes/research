package org.hsu.research.service.impl;

import org.hsu.research.dao.JflyDao;
import org.hsu.research.entity.Jfly;
import org.hsu.research.service.JflyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author times
 * @file JflyServiceImpl.java
 * @time 2019/2/21
 */
@Service
public class JflyServiceImpl implements JflyService {
    @Autowired
    private JflyDao jflyDao;

    @Override
    public List<Jfly> getJflyList() {
        return jflyDao.queryJfly();
    }

    @Override
    public Jfly getJflyByDm(String dm) {
        Jfly jfly = jflyDao.queryJflyByDm(dm);
        if (jfly == null) {
            throw new RuntimeException("参数不存在");
        }
        return jfly;
    }
}
