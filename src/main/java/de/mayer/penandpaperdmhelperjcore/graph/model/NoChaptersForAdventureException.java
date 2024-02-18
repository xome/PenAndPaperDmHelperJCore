package de.mayer.penandpaperdmhelperjcore.graph.model;

public class NoChaptersForAdventureException extends Throwable {
    public NoChaptersForAdventureException(String adventure) {
        super(adventure);
    }
}
