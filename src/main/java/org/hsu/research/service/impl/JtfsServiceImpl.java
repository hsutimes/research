package org.hsu.research.service.impl;

import org.hsu.research.dao.JtfsDao;
import org.hsu.research.entity.Jtfs;
import org.hsu.research.service.JtfsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author times
 * @file JtfsServiceImpl.java
 * @time 2019/2/21
 */
@Service
public class JtfsServiceImpl implements JtfsService {
    @Autowired
    private JtfsDao jtfsDao;

    @Override
    public List<Jtfs> getJtfsList() {
        return jtfsDao.queryJtfs();
    }

    @Override
    public Jtfs getJtfsByDm(String dm) {
        Jtfs jtfs = jtfsDao.queryJtfsByDm(dm);
        if (jtfs == null) {
            throw new RuntimeException("参数不存在");
        }
        return jtfs;
    }
}
