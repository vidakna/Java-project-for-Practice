package practice;

import java.util.Scanner;

public class Sub extends Cal{


    public static void MainSub() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your First Integer");
        int first = in.nextInt();
        System.out.println("Enter your Second Integer");
        int second = in.nextInt();



        sub(first,second);
    }


}
