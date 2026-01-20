package de.seuhd.observer;

public class ConcreteObserver implements Observer {
    private static int nextId = 1;
    private final int id;
    private final Subject subject;

    public ConcreteObserver(Subject subject) {
        this.id = nextId++;
        this.subject = subject;
        // Automatische Registrierung beim Subject
        this.subject.attach(this);
    }

    @Override
    public void update(Subject subject) {
        // Ausgabe entsprechend der Vorgabe im Aufgabenblatt
        System.out.println("Observer " + id + " received update from " + subject);
    }

    public void detach() {
        subject.detach(this);
    }
}