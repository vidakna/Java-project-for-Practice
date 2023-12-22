import java.util.Scanner;
public class ieeesum {
    public static void main(String[] args) {
        int ans=0,mod=1;
        double temp;
        Scanner in = new Scanner(System.in);
        int p = in.nextInt();
        int q = in.nextInt();
        int n = in.nextInt();
        int m = in.nextInt();

        if(1<=p && p<=1000){
            if(0<=q && q<=1000){
                if(1<=n || m<=(10^9)){

                    for(int i=1;i<=n;i++) {

                        temp = Math.pow(p, i) * Math.pow(i, q) ;
                        ans+=temp;

                        mod= ans % m;



                    }

                    System.out.println(mod);
                }
            }
        }
    }
}
