package repl;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Repl_205_MethodsWithArrayList2_AddElements {
    public static void main(String[] args) {

//        Method addElements accepts 2 int arrays and adds each element value of two arrays and returns a new array. You can assume that each array has 5 elements
//
//        addElements(new int[][10, 40, 50, 3, 1],
//        new int[][11, 0, 500, 44, 1101]);
//        --------
//        return array after adding values in the arrays:
//             [21, 40, 550, 47, 1102]

        int[] ints1={1,2,3};
        int[] ints2 ={3,2,1};

        System.out.println(Arrays.toString(addElements(ints1,ints2)) );
    }



    public static int[] addElements(int[] ints1, int[] ints2) {

        int [] arr = new int [ints1.length];

        for (int i = 0; i <ints1.length ; i++) {
            arr[i]=ints1[i]+ints2[i];

        }

return arr;

    }


}

