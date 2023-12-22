import java.util.Scanner;
import java.util.Arrays;
public class ieee {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int T = in.nextInt();//test cases



        if(T>=1 && T<=30){
            for(int i=0;i<T;i++)
            {
                int N = in.nextInt();//no patients

                if(N>=2 && N<=(10^5)){
                    for(int j=0;j<N;j++){

                        int arr[] = new int[2];
                        int Li = in.nextInt();// 1 day
                        arr[0]=Li;
                        int Ri = in.nextInt();
                        arr[1]=Ri;

                        if (Li>=1 && Li<=Ri && Li<=N && Ri<=N){

                            if(Ri==Li){
                                System.out.print(Li);
                            }else if ( N==2 ){
                                System.out.println(Li);
                                System.out.println(Ri);
                            }else if (Ri !=Li){
                                System.out.println(Ri);
                            }else{
                                System.out.println("imposible");
                            }
                            //check(arr, Li,Ri);

                        }

                    }
                }
            }



        }}






    private static void check(int[] arr, int Li,int Ri)
    {
        // check if the specified element
        // is present in the array or not
        // using Linear Search method
        boolean test = false;
        for (int element : arr) {
            if (element == Li && element==Ri) {
                test = true;
                System.out.println("Impossible");
                break;


            }}
    }
}
