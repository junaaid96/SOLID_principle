// Bad: A large interface that forces all implementing classes to define all methods
interface Worker {
    void work();

    void eat();
}

// Programmer class only works, but has to implement eat() due to the large
// interface
class Programmer1 implements Worker {
    @Override
    public void work() {
        System.out.println("Programming...");
    }

    @Override
    public void eat() {
        // This method is not relevant to a programmer's role
    }
}

// Good: Separate interfaces for different behaviors
interface Workable {
    void work();
}

interface Eatable {
    void eat();
}

// Now, the Programmer class only implements the relevant interface
class Programmer implements Workable {
    @Override
    public void work() {
        System.out.println("Programming...");
    }
}

// A class that represents a worker who eats, like a factory worker
class FactoryWorker implements Workable, Eatable {
    @Override
    public void work() {
        System.out.println("Working in the factory...");
    }

    @Override
    public void eat() {
        System.out.println("Eating lunch...");
    }
}

public class ISP {
    public static void main(String[] args) {
        Programmer programmer = new Programmer();
        programmer.work();

        FactoryWorker worker = new FactoryWorker();
        worker.work();
        worker.eat();
    }
}