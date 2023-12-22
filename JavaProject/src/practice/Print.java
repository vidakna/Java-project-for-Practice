package practice;

import java.util.Scanner;

public class Print {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your Operator (+,-,/,*)");
        String op = in.next();

        switch (op){
            case "+":
                Add obj=new Add();
                obj.MainAdd();
                break;
            case "-":
                Sub obj1=new Sub();
                obj1.MainSub();
                break;
            case "*":
                Mal obj2=new Mal();
                obj2.MainMal();
                break;
            case "/":
                Div obj3=new Div();
                obj3.MainDiv();
                break;
//            case "%":
//                mod(first,second);
//                break;
            default:
                System.out.println("Invalid operator");
                break;


        }
    }

}
