package work1lesson;

import java.util.Scanner;

public class _3 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt(), b = in.nextInt(), c = in.nextInt(), d = in.nextInt();
        int s = a * (b + (c / d));
        System.out.println(s);

    }
}
