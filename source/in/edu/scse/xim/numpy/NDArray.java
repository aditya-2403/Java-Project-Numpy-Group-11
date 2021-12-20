package in.edu.scse.xim.numpy;
import java.util.*;

public class NDArray{
    public int[][] arr2;
    public int[][][] arr3;

    // Object[] arr = new Object[1];

    public int[] shape;
    public int[] elements;

    public NDArray(){
        this.crArray();
    }

    public NDArray(int[] elements, int[] shape){
        this.elements = elements;
        this.shape = shape;
        this.crArray();
    }


    int n = 0;

    //for creating 2D Array
    public int[][] to2DArray(){
        int[][] arr2 = new int[shape[0]][shape[1]];
            for(int i = 0; i < shape[0]; i++){
                for(int j = 0; j < shape[1]; j++){
                    arr2[i][j] = elements[n];
                    n++;
                }
            }
        return arr2;
    }

    //for creating 3D Array
    public int[][][] to3DArray(){
        int[][][] arr3 = new int[shape[0]][shape[1]][shape[3]];
        for(int i = 0; i < shape[0]; i++){
            for(int j = 0; j < shape[1]; j++){
                for(int k = 0; k < shape[1]; k++){
                    arr3[i][j][k] = elements[n];
                    n++;
                }
            }
        }
        return arr3;
    }

    public void crArray(){
        if(shape.length == 2){
            arr2 = new int[shape[0]][shape[1]];
            for(int i = 0; i < shape[0]; i++){
                for(int j = 0; j < shape[1]; j++){
                    arr2[i][j] = elements[n];
                    n++;
                }
            }
        }
        else if(shape.length == 3){
            arr3 = new int[shape[0]][shape[1]][shape[3]];
            for(int i = 0; i < shape[0]; i++){
                for(int j = 0; j < shape[1]; j++){
                    for(int k = 0; k < shape[1]; k++){
                        arr3[i][j][k] = elements[n];
                        n++;
                    }
                }
            }
        }
    }
}