import java.util.*;
import in.edu.scse.xim.numpy.*;

public class Test {
    public static void main(String[] args) {
        int[] num1= {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] num2= {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] shape1 = new int[2];
        int[] shape2 = new int[2];

        NDArray n1 = new NDArray(num1, shape1);
        NDArray n2 = new NDArray(num2, shape2);

        double[] sum = new double[n1.shape[0] * n1.shape[1]];
        sum = Functions.add(n1, n2);

        System.out.println(sum.length);
        for(int i = 0; i < sum.length; i++){
            System.out.println(sum[i]);
        }

        System.out.println(n1.arr2.length);

        //To print the 
        for(int i = 0; i< n1.arr2.length; i++){
            for(int j = 0; j< n1.arr2.length; j++){
                System.out.println(n1.arr2[i][j]);
            }
        }
    }
}
