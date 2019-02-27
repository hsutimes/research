package org.hsu.research.dao;

import org.hsu.research.entity.BasicInfo;

import java.util.List;

/**
 * @author times
 * @file BasicInfoDao.java
 * @time 2019/2/21
 */
public interface BasicInfoDao {
    List<BasicInfo> queryBasicInfo();

    BasicInfo queryBasicInfoByNo(String no);
}
