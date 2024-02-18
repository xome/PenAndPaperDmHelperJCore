package de.mayer.penandpaperdmhelperjcore.graph.domainservice;

import de.mayer.penandpaperdmhelperjcore.graph.model.Chapter;

import java.util.Optional;
import java.util.Set;

public interface ChapterRepository {
    Set<Chapter> findByAdventure(String adventure);
    Optional<Chapter> findById(String adventure, String chapter);

    void invalidateCache();

}
