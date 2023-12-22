package practice;

import java.util.Scanner;

public class Mal extends Cal{


    public static void MainMal(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your First Integer");
        int first = in.nextInt();
        System.out.println("Enter your Second Integer");
        int second = in.nextInt();


        mul(first,second);
    }


}
