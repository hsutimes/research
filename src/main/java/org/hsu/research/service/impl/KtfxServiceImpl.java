package org.hsu.research.service.impl;

import org.hsu.research.dao.KtfxDao;
import org.hsu.research.entity.Ktfx;
import org.hsu.research.service.KtfxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author times
 * @file KtfxServiceImpl.java
 * @time 2019/2/21
 */
@Service
public class KtfxServiceImpl implements KtfxService {
    @Autowired
    private KtfxDao ktfxDao;

    @Override
    public List<Ktfx> getKtfxList() {
        return ktfxDao.queryKtfx();
    }

    @Override
    public Ktfx getKtfxByDm(String dm) {
        Ktfx ktfx = ktfxDao.queryKtfxByDm(dm);
        if (ktfx == null) {
            throw new RuntimeException("参数不存在");
        }
        return ktfx;
    }
}
