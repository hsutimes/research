package org.hsu.research.service.impl;

import org.hsu.research.dao.BasicInfoDao;
import org.hsu.research.dao.BftjDao;
import org.hsu.research.entity.BasicInfo;
import org.hsu.research.entity.Bftj;
import org.hsu.research.service.BasicInfoService;
import org.hsu.research.service.BftjService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author times
 * @file BasicInfoServiceImpl.java
 * @time 2019/2/21
 */
@Service
public class BasicInfoServiceImpl implements BasicInfoService {
    @Autowired
    private BasicInfoDao basicInfoDao;

    @Override
    public List<BasicInfo> getBasicInfoList() {
        return basicInfoDao.queryBasicInfo();
    }

    @Override
    public BasicInfo getBasicInfoByNo(String no) {
        BasicInfo basicInfo = basicInfoDao.queryBasicInfoByNo(no);
        if (basicInfo == null) {
            throw new RuntimeException("参数不存在");
        }
        return basicInfo;
    }
}
