package work1lesson;

import java.util.Scanner;

public class _5 {
    public static void main(String[] args)  {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        if (a >= 0) {
            System.out.println("Положительное");
        } else {
            System.out.println("Отрицательное");
        }
    }
}
