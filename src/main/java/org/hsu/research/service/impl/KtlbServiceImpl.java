package org.hsu.research.service.impl;

import org.hsu.research.dao.KtlbDao;
import org.hsu.research.entity.Ktlb;
import org.hsu.research.service.KtlbService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author times
 * @file KtlbServiceImpl.java
 * @time 2019/2/21
 */
@Service
public class KtlbServiceImpl implements KtlbService {
    @Autowired
    private KtlbDao ktlbDao;

    @Override
    public List<Ktlb> getKtlbList() {
        return ktlbDao.queryKtlb();
    }

    @Override
    public Ktlb getKtlbByDm(String dm) {
        Ktlb ktlb = ktlbDao.queryKtlbByDm(dm);
        if (ktlb == null) {
            throw new RuntimeException("参数不存在");
        }
        return ktlb;
    }
}
