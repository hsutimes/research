package org.hsu.research.service.impl;

import org.hsu.research.dao.KtjbDao;
import org.hsu.research.entity.Ktjb;
import org.hsu.research.service.KtjbService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author times
 * @file KtjbServiceImpl.java
 * @time 2019/2/21
 */
@Service
public class KtjbServiceImpl implements KtjbService {
    @Autowired
    private KtjbDao ktjbDao;

    @Override
    public List<Ktjb> getKtjbList() {
        return ktjbDao.queryKtjb();
    }

    @Override
    public Ktjb getKtjbByDm(String dm) {
        Ktjb ktjb = ktjbDao.queryKtjbByDm(dm);
        if (ktjb == null) {
            throw new RuntimeException("参数不存在");
        }
        return ktjb;
    }
}
