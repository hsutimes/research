package org.hsu.research.service;

import org.hsu.research.entity.Bftj;

import java.util.List;

public interface BftjService {
    List<Bftj> getBftjList();

    Bftj getBftjByDm(String dm);
}
