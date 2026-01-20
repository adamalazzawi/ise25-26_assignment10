package de.seuhd.observer;

public class ConcreteSubject extends Subject {
    private int value;

    public void setValue(int value) {
        this.value = value;
        System.out.println("Value of subject updated to " + value);
        // Bei jeder Änderung werden die Observer benachrichtigt
        notifyObservers();
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "subject: New value is " + value;
    }
}