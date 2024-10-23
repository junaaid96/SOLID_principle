// Subtypes must be substitutable for their base types
abstract class Bird {
    abstract void eat();
}

class FlyingBird extends Bird {
    void eat() {
        // Eating implementation
    }

    void fly() {
        // Flying implementation
    }
}

class Penguin extends Bird {
    void eat() {
        // Eating implementation
    }
    // No fly method because penguins can't fly
}

class LSP {
    public static void main(String[] args) {
        Bird bird = new Penguin();
        bird.eat();
    }
}