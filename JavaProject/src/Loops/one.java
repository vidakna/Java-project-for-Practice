package Loops;

import java.util.Scanner;

public class one {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter Number :");
        int n =in.nextInt();
        //int n=5;
        for(int i=0;i<n;i++) {
            for(int j=0;j<n;j++)
            {
                System.out.print("  *");
            }
            System.out.println("");
        }
    }
}

