package org.hsu.research.service;

import org.hsu.research.entity.Ktlb;

import java.util.List;

public interface KtlbService {
    List<Ktlb> getKtlbList();

    Ktlb getKtlbByDm(String dm);
}
