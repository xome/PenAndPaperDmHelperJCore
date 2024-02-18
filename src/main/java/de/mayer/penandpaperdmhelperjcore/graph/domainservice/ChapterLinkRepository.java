package de.mayer.penandpaperdmhelperjcore.graph.domainservice;

import de.mayer.penandpaperdmhelperjcore.graph.model.ChapterLink;

import java.util.Set;

public interface ChapterLinkRepository {
    Set<ChapterLink> findByAdventure(String adventure);
    void invalidateCache();

}
