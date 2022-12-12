import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner scc = new Scanner(System.in);
        Scanner sccf = new Scanner(System.in);

        System.out.print("first number: ");
        int firstNumber = sc.nextInt();

        System.out.print("Operation: ");
        String  operation = scc.nextLine();

        System.out.print("last number: ");
        int lastNumber = sc.nextInt();

        System.out.print("Operation: ");
        String operetion1=sccf.nextLine();

        plus(firstNumber,operation,lastNumber);

    }

    public static void plus(int a, String  t, int b) {
        if (t.equals("+")){
            System.out.println(a + b);
        } else if (t.equals("-")) {
            System.out.println(a-b);
        } else if (t.equals("*")) {
            System.out.println(a*b);
        } else if (t.equals("/")) {
            System.out.println(a/b);
        }else
            System.out.println();

    }
}

