package org.hsu.research.service;

import org.hsu.research.entity.Jtfs;

import java.util.List;

public interface JtfsService {
    List<Jtfs> getJtfsList();

    Jtfs getJtfsByDm(String dm);
}
