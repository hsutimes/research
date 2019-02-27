package org.hsu.research.service;

import org.hsu.research.entity.Ktfx;

import java.util.List;

public interface KtfxService {
    List<Ktfx> getKtfxList();

    Ktfx getKtfxByDm(String dm);
}
