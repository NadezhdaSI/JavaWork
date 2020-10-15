package work1lesson;

import java.util.Scanner;

public class _4 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt(), b = in.nextInt();
        int s = a + b;
        if (s >= 10 && s <= 20) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

    }

}
