package de.mayer.penandpaperdmhelperjcore.adventure.model;

public record Text(String text) implements RecordInAChapter {
    public Text {
        if (text == null || text.isEmpty())
            throw new IllegalModelAccessException("Text cannot be null or empty.");
    }
}
