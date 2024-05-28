package java_code.May25.multipleInheritence;

public class Father extends GrandFather {
    Inheritence inheritence = Inheritence.FATHER;
    
    Inheritence gfInheritence = title();

    private void printGrandFatherTitle () {
        if(gfInheritence == Inheritence.GRAND_FATHER) {
            System.out.println("Grand Father");
        }
    }
}
