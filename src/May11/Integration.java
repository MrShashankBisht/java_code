package May11;
// Integration
import java.util.Scanner;
public class Integration {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double Ar=0;
        double sum=0;
        System.out.println("Convert the equation to the form A(x^2)+Bx+C where A, B, and C are integers.");
        System.out.print("Value of A=");
        int a=sc.nextInt();
        System.out.print("Value of B=");
        int b=sc.nextInt();
        System.out.print("Value of C=");
        int c=sc.nextInt();
        System.out.print("Enter the limits: ");
        int a1=sc.nextInt();
        int a2=sc.nextInt();
        for(float i=a1;i<=a2;i+=0.5)
        {
            if(i==a1 || i==a2){
                sum=(a*i*i)+(b*i)+c;
            }
            else{
                sum=((a*i*i)+(b*i)+c)*2;
            }
            Ar+=sum;
        }
        Ar=Ar/4;
        System.out.println("Ans="+Ar);
        sc.close();
    }
}