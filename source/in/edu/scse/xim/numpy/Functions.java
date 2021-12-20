package in.edu.scse.xim.numpy;

 
public class Functions {
    public static double[] add(NDArray ar1, NDArray ar2){
        double[] sum = new double[ar1.shape[0] * ar1.shape[1]];
        int n = 0;
        for(int i = 0; i < ar1.shape[0]; i++){
            for(int j = 0; j< ar1.shape[1]; i++){
                sum[i] = ar1.arr2[i][j] + ar2.arr2[j][j];
            }
        }
        return sum;
    }

    public static double[] substract(NDArray ar1, NDArray ar2){
        double[] substract = new double[ar1.shape[0] * ar1.shape[1]];
        int n = 0;
        for(int i = 0; i < ar1.shape[0]; i++){
            for(int j = 0; j< ar1.shape[1]; i++){
                substract[i] = ar1.arr2[i][j] - ar2.arr2[j][j];
            }
        }
        return substract;
    }

    //  To multiply 2D matrix and return 1D array
    public static double[] multiply(NDArray ar1, NDArray ar2){
        if(ar1.shape[1] == ar2.shape[1]){
            double[] multiply= new double[ar1.shape[0] * ar1.shape[1]];
            int n = 0;
            for(int i = 0; i < ar1.shape[0]; i++){
                for(int j = 0; j< ar1.shape[1]; i++){

                    int a = 0;
                    for(int k = 0; k < ar1.shape[0]; k++){
                        for(int l = 0; l< ar1.shape[1]; l++){
                            a += ar1.arr2[i][j] - ar2.arr2[j][i];
                        }
                    }
                    multiply[i] = a;
                }
            }
            return multiply;
        }
        else{
            double[] multiply = new double[0];
            return multiply;
        }
    }
}