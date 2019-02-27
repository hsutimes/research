package org.hsu.research.service;

import org.hsu.research.entity.Ktsx;

import java.util.List;

public interface KtsxService {
    List<Ktsx> getKtsxList();

    Ktsx getKtsxByDm(String dm);
}
