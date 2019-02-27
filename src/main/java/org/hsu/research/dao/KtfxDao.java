package org.hsu.research.dao;

import org.hsu.research.entity.Ktfx;

import java.util.List;

/**
 * @author times
 * @file KtfxDao.java
 * @time 2019/2/21
 */
public interface KtfxDao {
    List<Ktfx> queryKtfx();

    Ktfx queryKtfxByDm(String dm);
}
