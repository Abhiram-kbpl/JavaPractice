
import java.util.Scanner;

public class App {
    // swapping numbers java 
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.println("enter number 1 : ");

        int numb1= sc.nextInt();

        System.out.println("enter number 2 : ");
        int numb2 =sc.nextInt();
        int tm =numb1;
        numb1 =numb2;
        numb2=tm;

        System.out.println("number1 :" + numb1);
        System.out.println("number1 :" + numb2);
       
    }
}
