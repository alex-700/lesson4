package ru.ifmo.md.lesson4;

public class CalculationException extends Exception {
    public CalculationException(String detailMessage) {
        super(detailMessage);
    }

    @Override
    public String getMessage() {
        return super.getMessage();
    }
}
