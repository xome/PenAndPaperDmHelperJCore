package de.mayer.penandpaperdmhelperjcore.graph.model;

public class IllegalModelAccessException extends RuntimeException {

    public IllegalModelAccessException(String message){
        super(new IllegalAccessException(message));
    }

}
