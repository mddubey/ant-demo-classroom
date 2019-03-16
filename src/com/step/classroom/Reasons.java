package com.step.classroom;

public enum Reasons {
    DAMAGED("The book is damaged."),
    OUTDATED("The book is not relevant anymore."),
    OTHERS("Not sure about the reason");

    private final String explanation;

    Reasons(String explanation) {
        this.explanation = explanation;
    }

    public String getExplanation() {
        return explanation;
    }
}
