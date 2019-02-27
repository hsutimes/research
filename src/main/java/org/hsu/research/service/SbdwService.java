package org.hsu.research.service;

import org.hsu.research.entity.Sbdw;

import java.util.List;

public interface SbdwService {
    List<Sbdw> getSbdwList();

    Sbdw getSbdwByDm(String dm);
}
