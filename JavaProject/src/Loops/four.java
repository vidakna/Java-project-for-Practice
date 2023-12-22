package Loops;

public class four {
    public static void main(String[] args) {
        int arr[][]={{2,7,9},{3,6,1},{7,2},{8,4,3}};

        for(int i=0;i< arr.length;i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] +" ");

            }
            System.out.println();
        }
    }
}
