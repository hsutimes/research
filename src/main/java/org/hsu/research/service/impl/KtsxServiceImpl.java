package org.hsu.research.service.impl;

import org.hsu.research.dao.KtsxDao;
import org.hsu.research.entity.Ktsx;
import org.hsu.research.service.KtsxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author times
 * @file KtsxServiceImpl.java
 * @time 2019/2/21
 */
@Service
public class KtsxServiceImpl implements KtsxService {
    @Autowired
    private KtsxDao ktsxDao;

    @Override
    public List<Ktsx> getKtsxList() {
        return ktsxDao.queryKtsx();
    }

    @Override
    public Ktsx getKtsxByDm(String dm) {
        Ktsx ktsx = ktsxDao.queryKtsxByDm(dm);
        if (ktsx == null) {
            throw new RuntimeException("参数不存在");
        }
        return ktsx;
    }
}
