package org.hsu.research.service.impl;

import org.hsu.research.dao.BftjDao;
import org.hsu.research.entity.Bftj;
import org.hsu.research.service.BftjService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author times
 * @file BftjServiceImpl.java
 * @time 2019/2/21
 */
@Service
public class BftjServiceImpl implements BftjService {
    @Autowired
    private BftjDao bftjDao;

    @Override
    public List<Bftj> getBftjList() {
        return bftjDao.queryBftj();
    }

    @Override
    public Bftj getBftjByDm(String dm) {
        Bftj bftj = bftjDao.queryBftjByDm(dm);
        if (bftj == null) {
            throw new RuntimeException("参数不存在");
        }
        return bftj;
    }
}
