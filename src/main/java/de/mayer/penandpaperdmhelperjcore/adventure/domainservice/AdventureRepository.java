package de.mayer.penandpaperdmhelperjcore.adventure.domainservice;

import de.mayer.penandpaperdmhelperjcore.adventure.model.Adventure;

import java.util.List;
import java.util.Optional;

public interface AdventureRepository {
    Optional<Adventure> findByName(String adventureName);

    void save(Adventure adventure);

    void changeName(Adventure adventure, String newAdventureName);

    void delete(Adventure adventure);

    List<Adventure> findAll();
}
