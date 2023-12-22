import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Doctor {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();//test cases

        if (T >= 1 && T <= 30) {
            for (int i = 0; i < T; i++) {
                int N = in.nextInt();//no patients

                if (N >= 2 && N <= (10 ^ 5)) {
                    List<Integer> list = new ArrayList<Integer>();
                    for (int j = 0; j < N; j++) {
                        int Li = in.nextInt();// 1 day
                        list.add(Li);
                        int Ri = in.nextInt();
                        list.add(Ri);
                    }
                    check(list);
                }
            }
        }
    }

    private static void check(List<Integer> list)
    {
        int size = list.size();
        System.out.println(size);


    }
}
