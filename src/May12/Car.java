package May12;

/**
 * abstract : that no one in the project can create the new instance and this
 * class is only use for inheritence. 
 * 1) abstract class 
 * 2) abstract method (functions)
 * 3) abstract variables 
 */
abstract public class Car {
    public Car(Engine e) {
        this.eng = e;
    }
    boolean enginStart = false;
    int space = 4;
    protected Engine eng = null;

    boolean startCar() {
        if(eng != null){
            enginStart = true;
            return true;
        } else {
            return false;
        }
        
    }

    void stopCar() {
        enginStart = false;
    }

    boolean isCarStated() {
        return enginStart;
    }

    void injectEngin(Engine e) {
        this.eng = e;
    }
}
