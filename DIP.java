// Bad: High-level module (Computer) depends on low-level modules (Keyboard and Monitor)
class Keyboard1 {
    // Keyboard-specific implementation
}

class Monitor1 {
    // Monitor-specific implementation
}

class Computer1 {
    private Keyboard1 keyboard1;
    private Monitor1 monitor1;

    public Computer1() {
        this.keyboard1 = new Keyboard1();
        this.monitor1 = new Monitor1();
    }
}

// Good: Use interfaces for abstraction
interface InputDevice {
    void input();
}

interface OutputDevice {
    void output();
}

class Keyboard implements InputDevice {
    @Override
    public void input() {
        System.out.println("Typing on the keyboard...");
    }
}

class Monitor implements OutputDevice {
    @Override
    public void output() {
        System.out.println("Displaying on the monitor...");
    }
}

class Computer {
    private InputDevice inputDevice;
    private OutputDevice outputDevice;

    public Computer(InputDevice inputDevice, OutputDevice outputDevice) {
        this.inputDevice = inputDevice;
        this.outputDevice = outputDevice;
    }

    public void useDevices() {
        inputDevice.input();
        outputDevice.output();
    }
}

// Usage
public class DIP {
    public static void main(String[] args) {
        InputDevice keyboard = new Keyboard();
        OutputDevice monitor = new Monitor();

        Computer computer = new Computer(keyboard, monitor);
        computer.useDevices();
    }
}
