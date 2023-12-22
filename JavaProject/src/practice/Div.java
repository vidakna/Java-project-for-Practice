package practice;

import java.util.Scanner;

public class Div extends Cal {


    public static void MainDiv() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your First Integer");
        int first = in.nextInt();
        System.out.println("Enter your Second Integer");
        int second = in.nextInt();


        div(first,second);
    }


}

