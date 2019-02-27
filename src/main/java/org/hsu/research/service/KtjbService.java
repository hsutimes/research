package org.hsu.research.service;

import org.hsu.research.entity.Ktjb;

import java.util.List;

public interface KtjbService {
    List<Ktjb> getKtjbList();

    Ktjb getKtjbByDm(String dm);
}
