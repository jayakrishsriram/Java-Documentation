import java.util.Arrays;
public class A23_array1 {
    public static void main(String[] args) {
        double[] data=new double[3]; //Create a double datatype array in the variable name data with the data size 3
        data[0]=1.5;
        data[1]=4;
        data[2]=3.4;
        System.out.println(data[2]); 
        String[] a= new String[2];
        a[0]="Hello";
        a[1]="World";
        System.out.println(a[0]+" "+a[1]); 
        int[] arr={10,20,34};
        System.out.println(arr[1]);
        /*  
         * To print the entire array you need to use Arrays.tostring(array_name). 
         * To use Arrays you need to import the package java.utils.Arrays.
        */
        System.out.println(Arrays.toString(arr));
    }
}
