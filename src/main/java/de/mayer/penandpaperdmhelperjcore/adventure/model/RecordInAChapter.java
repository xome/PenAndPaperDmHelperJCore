package de.mayer.penandpaperdmhelperjcore.adventure.model;

public sealed interface RecordInAChapter permits BackgroundMusic,
        ChapterLink,
        EnvironmentLightning,
        Picture,
        Text {
}
