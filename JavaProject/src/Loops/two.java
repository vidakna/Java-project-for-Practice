package Loops;

import java.util.Scanner;

public class two {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter Number :");
        int n =in.nextInt();
//
//        for(int i=0;i<n;i++){
//            for(int j=0;j<=i;j++){
//                System.out.print(" *");
//            }
//            System.out.println();
//        }
        for(int i=0;i<n;i++){
           for(int j=n;j>i;j--){
               System.out.print(" *");
           }
            System.out.println();
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
               System.out.print(" *");
            }
           System.out.println();
        }
    }
}
