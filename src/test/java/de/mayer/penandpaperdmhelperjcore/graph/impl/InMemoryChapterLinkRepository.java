package de.mayer.penandpaperdmhelperjcore.graph.impl;

import de.mayer.penandpaperdmhelperjcore.graph.domainservice.ChapterLinkRepository;
import de.mayer.penandpaperdmhelperjcore.graph.model.ChapterLink;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class InMemoryChapterLinkRepository implements ChapterLinkRepository {
    private HashMap<String, Set<ChapterLink>> database;

    public void save(String adventure, ChapterLink chapterLink) {
        if (this.database == null) {
            this.database = new HashMap<>();
        }
        var links = this.database.getOrDefault(adventure, new HashSet<>());
        links.add(chapterLink);
        this.database.put(adventure, links);

    }

    @Override
    public Set<ChapterLink> findByAdventure(String adventure) {
        if (this.database == null) return new HashSet<>();
       return database.getOrDefault(adventure, new HashSet<>());
    }

    @Override
    public void invalidateCache() {

    }

}
