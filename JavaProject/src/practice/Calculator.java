package practice;

import java.util.Scanner;

public class Calculator extends Inherite  {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your First Integer");
        int first = in.nextInt();
        System.out.println("Enter your Second Integer");
        int second = in.nextInt();
        System.out.println("Enter your Operator (+,-,/,*)");
        String op = in.next();




        switch (op){
            case "+":
                sum(first,second);
                break;
            case "-":
                sub(first,second);
                break;
            case "*":
                mul(first,second);
                break;
            case "/":
                div(first,second);
                break;
//            case "%":
//                mod(first,second);
//                break;
            default:
                System.out.println("Invalid operator");
                break;


        }



    }
   /* public static void Cal( String op,int frist,int second){
        switch (op) {
            case "+":

                int sum = frist + second;
                System.out.println(sum);
                break;
            case "-":

                int sub = frist - second;
                System.out.println(sub);
                break;
            case "/":

                if (second == 0) {
                    System.out.println("your input is invalid");
                } else {
                    int div = frist / second;
                    System.out.println(div);
                }
                break;

            case "*":

                int mal = frist * second;
                System.out.println(mal);
                break;

            default:
                System.out.println("Invalid operator");
        }

    }*/
}



