package Jun1;

abstract class Car {
    abstract public void start();
    abstract public void start(int a, int b);
}

abstract class Engin {
    abstract public void start();
}

public class BMW extends Car{
    public void start() {
        System.out.println("Start in BMW");
    }

    @Override
    public void start(int a, int b) {

    }
}
