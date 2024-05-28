package May12;
/**
 * Main
 */
public class Main {
    public static void main(String[] args) {
        Engine e = new Engine();
        Maruti m = new Maruti(e);
        Tata t = new Tata(e);

        if(!m.isCarStated()) {
            m.startCar();
        }

        
    }
}