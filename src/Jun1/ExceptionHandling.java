package Jun1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = null;
        boolean perform = true;
        do{
            try {
                int input = sc.nextInt();
//            if(name.equals("Raj")) {
//                System.out.println("Raj");
//            }
                int a = 10/input;
                perform = false;
            } catch (NullPointerException nullE) {
                System.out.println("NullPointer Exception");
                throw new RuntimeException(nullE);
            } catch (InputMismatchException inputE) {
                System.out.println("InputMismatchException Exception");
                throw new RuntimeException(inputE);
            } catch (ArithmeticException arithmeticException) {
                System.out.println("ArithmeticException Exception");
                perform = true;
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        } while(perform);
    }
}
