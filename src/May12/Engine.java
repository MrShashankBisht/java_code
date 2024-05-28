package May12;

public class Engine {
    private int piston = 2;
    private String eName = null;
    private int power = 0; 

    void setPiston(int piston) {
        this.piston = piston;
    }

    int getPiston() {
        return this.piston;
    }
    void setEName(String eName) {
        this.eName = eName;
    }

    String getEName() {
        return this.eName;
    }
    void setPower(int power) {
        this.power = power;
    }

    int getPower() {
        return power;
    }


}
