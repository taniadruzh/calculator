import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        boolean flExit = true;
        while (flExit) {
            System.out.println("Let's calc! (y/n)");
            Scanner in = new Scanner(System.in);
            String st = in.nextLine();
            if (st.equals("n")) {
                flExit = false;
                System.out.println("Goodbye!");
                continue;
            }
            calculator();
        }
    }

    public static void calculator()
    {
        System.out.println("Let's calculate :-)");
        System.out.println("Enter your first number:");
        int num1 = getInt();
        System.out.println("Enter operation symbol (+ - * /):");
        char ch = getOperation();
        System.out.println("Enter your second number:");
        int num2 = getInt();
        System.out.print("Your result is ");
        calc(num1,ch,num2);
    }

    public static int getInt()
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        return n;
    }

    public static char getOperation()
    {
        Scanner in = new Scanner(System.in);
        String st = in.nextLine();
        char ch = st.charAt(0);
        return ch;
    }

    public static void calc(int num1,char ch,int num2)
    {
        switch (ch){
            case '+': {
                System.out.println(num1 + num2);
                break;
            }
            case '-':{
                System.out.println(num1 - num2);
                break;
            }
            case '*':{
                System.out.println(num1 * num2);
                break;
            }
            case '/':{
                System.out.println(num1 / num2);
                break;
            }
        }
    }
}
