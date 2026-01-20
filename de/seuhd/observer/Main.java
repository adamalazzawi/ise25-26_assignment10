package de.seuhd.observer;

public class Main {
    public static void main(String[] args) {
        ConcreteSubject subject = new ConcreteSubject();
        
        // Zwei Observer registrieren sich
        ConcreteObserver observer1 = new ConcreteObserver(subject);
        ConcreteObserver observer2 = new ConcreteObserver(subject);

        // Zustandsänderung
        subject.setValue(5);
        
        // Einer meldet sich ab
        observer1.detach();
        
        // Zustandsänderung 
        subject.setValue(1);
        
        // Zweiter meldet sich ab
        observer2.detach();
        
        // Zustandsänderung keine Benachrichtigung mehr
        subject.setValue(3);
    }
}