package de.mayer.penandpaperdmhelperjcore.adventure.model;

import java.util.List;

public record Adventure(String name, List<Chapter> chapters) {
    public Adventure {
        if (name == null || name.isEmpty())
            throw new IllegalModelAccessException("Name cannot be null or empty.");
    }
}
