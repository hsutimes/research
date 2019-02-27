package org.hsu.research.service;

import org.hsu.research.entity.Xkfl;

import java.util.List;

public interface XkflService {
    List<Xkfl> getXkflList();

    Xkfl getXkflByDm(String dm);
}
