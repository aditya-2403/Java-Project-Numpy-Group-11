import java.util.*;

class NDArrays extends NDArray{


    
 String CrArray(){
    System.out.println("Enter the number of dimensions for array");

    Scanner sc = new Scanner(System.in);
    switch1 = sc.nextInt();


    switch(switch1)
    {

        case 1:
        {

        //Case 1 will be used for 1 dimensional array
        System.out.println(("Enter the shape of the array"));

        i1 = sc.nextInt();

        int array1[] = new int[i1];
        //Here i1 indicates the size of the 1 dimensional array

        
        for(int loops1=0;loops1<i1;loops1++)
        {
            //loops1 is used for taking inputs 

            System.out.println("Enter element no."+(loops1+1));
            array1[loops1] = sc.nextInt();
        }

        for(int loops1=0;loops1<i1;loops1++)
        {
        System.out.println(array1[loops1]);
        }

        System.out.println(array1.length);

        break;
    }


        case 2:

        {
        

        System.out.println(("Enter the shape of the array"));

        i1 = sc.nextInt();
        i2 = sc.nextInt();
        
        int array1[][] = new int[i1][i2];

        
        for(int loops1=0;loops1<i1;loops1++)
        {
            for(int loops2=0;loops2<i2;loops2++)
            {

            System.out.println("Enter element no."+(loops1+1)+","+(loops2+1));
            array1[loops1][loops2]= sc.nextInt();}
        }
        System.out.println();
        for(int loops1=0;loops1<i1;loops1++)
        {
            for(int loops2=0;loops2<i2;loops2++)
            {
        System.out.print(array1[loops1][loops2]+" ");
        }
        System.out.println();
    }

        //System.out.println(array1.length);

        break;

    }

    case 3:

    {


    System.out.println(("Enter the shape of the array"));

    i1 = sc.nextInt();
    i2 = sc.nextInt();
    i3 = sc.nextInt();
    
    int array1[][][] = new int[i1][i2][i3];

    
    for(int loops1=0;loops1<i1;loops1++)
    {
        for(int loops2=0;loops2<i2;loops2++)
        {
            for(int loops3=0;loops3<i3;loops3++)
            {

        System.out.println("Enter element no."+(loops1+1)+","+(loops2+1)+","+(loops3+1));
        array1[loops1][loops2][loops3]= sc.nextInt();}
    }}
    System.out.println();
    for(int loops1=0;loops1<i1;loops1++)
    {
        for(int loops2=0;loops2<i2;loops2++)
        {
            for(int loops3=0;loops3<i3;loops3++)
        {
    System.out.print(array1[loops1][loops2][loops3]+" ");
    }
    System.out.println();}
    System.out.println();
}


    break;


}

case 4:

    {
    

    System.out.println(("Enter the shape of the array"));

    i1 = sc.nextInt();
    i2 = sc.nextInt();
    i3 = sc.nextInt();
    i4 = sc.nextInt();
    
    int array1[][][][] = new int[i1][i2][i3][i4];

    
    for(int loops1=0;loops1<i1;loops1++)
    {
        for(int loops2=0;loops2<i2;loops2++)
        {
            for(int loops3=0;loops3<i3;loops3++)
            {
                for(int loops4=0;loops4<i4;loops4++)
                {

        System.out.println("Enter element no."+(loops1+1)+","+(loops2+1)+","+(loops3+1)+","+(loops4+1));
        array1[loops1][loops2][loops3][loops4]= sc.nextInt();}
    }}}
    System.out.println();
    for(int loops1=0;loops1<i1;loops1++)
    {
        for(int loops2=0;loops2<i2;loops2++)
        {
            for(int loops3=0;loops3<i3;loops3++)
            {
                for(int loops4=0;loops4<i4;loops4++)
                {
    System.out.print(array1[loops1][loops2][loops3][loops4]+" ");
    }
  System.out.println();}
  System.out.println();}
    System.out.println();
    
}

    break;

}



}


    sc.close();

    return("hello");
}
}



public class NDArray{

    static int switch1,i1,i2,i3,i4,i5,i6,i7;
    //This contains the index size inputs for the array
    //switch1 variable will be used for switch case
    public  static void main(String[] args)
    {
    NDArrays A = new NDArrays();
    System.out.println(A.CrArray());

    }
}