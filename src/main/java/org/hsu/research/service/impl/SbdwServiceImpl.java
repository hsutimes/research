package org.hsu.research.service.impl;

import org.hsu.research.dao.SbdwDao;
import org.hsu.research.entity.Sbdw;
import org.hsu.research.service.SbdwService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author times
 * @file SbdwServiceImpl.java
 * @time 2019/2/21
 */
@Service
public class SbdwServiceImpl implements SbdwService {
    @Autowired
    private SbdwDao sbdwDao;

    @Override
    public List<Sbdw> getSbdwList() {
        return sbdwDao.querySbdw();
    }

    @Override
    public Sbdw getSbdwByDm(String dm) {
        Sbdw sbdw = sbdwDao.querySbdwByDm(dm);
        if (sbdw == null) {
            throw new RuntimeException("参数不存在");
        }
        return sbdw;
    }
}
