package org.hsu.research.service;

import org.hsu.research.entity.BasicInfo;

import java.util.List;

public interface BasicInfoService {
    List<BasicInfo> getBasicInfoList();

    BasicInfo getBasicInfoByNo(String no);
}
