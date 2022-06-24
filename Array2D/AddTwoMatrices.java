package Array2D;

import java.util.Arrays;

public class AddTwoMatrices {
    public static void main(String[] args) {
          int[] [] ar1 = {
                  { 1,2 },
                  { 3,4}
                         };
          int[] [] ar2 = {
                  {5,6},
                  {7,8}
                       };
          int[][] ar3 = new int[2][2];
        for (int i = 0; i < ar1.length; i++) {
            System.out.println(Arrays.toString(ar1[i]));

        }
        for (int i = 0; i < ar1.length; i++) {
            System.out.println(Arrays.toString(ar2[i]));
        }
        for (int i = 0; i < ar1.length; i++) {
            for (int j = 0; j < ar2.length; j++) {
                ar3[i][j]= ar1[i][j]+ar2[i][j];

            }
        }

        for (int i = 0; i < ar1.length; i++) {
            System.out.println(Arrays.toString(ar3[i]));
        }


    }


}
