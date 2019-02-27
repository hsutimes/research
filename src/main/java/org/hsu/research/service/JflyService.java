package org.hsu.research.service;

import org.hsu.research.entity.Jfly;

import java.util.List;

public interface JflyService {
    List<Jfly> getJflyList();

    Jfly getJflyByDm(String dm);
}
