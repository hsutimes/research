package org.hsu.research.service.impl;

import org.hsu.research.dao.XkflDao;
import org.hsu.research.entity.Xkfl;
import org.hsu.research.service.XkflService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author times
 * @file XkflServiceImpl.java
 * @time 2019/2/21
 */
@Service
public class XkflServiceImpl implements XkflService {
    @Autowired
    private XkflDao xkflDao;

    @Override
    public List<Xkfl> getXkflList() {
        return xkflDao.queryXkfl();
    }

    @Override
    public Xkfl getXkflByDm(String dm) {
        Xkfl xkfl = xkflDao.queryXkflByDm(dm);
        if (xkfl == null) {
            throw new RuntimeException("参数不存在");
        }
        return xkfl;
    }
}
