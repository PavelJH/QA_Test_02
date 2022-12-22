import java.util.ArrayList;
import java.util.Arrays;

public class Test_QA {
    public static int[] deleteNumber(int[] array, int number) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                count++;
            } else {
                array[i - count] = array[i];
            }
        }
        int[] res = Arrays.copyOf(array, array.length - count);
        return res;
        //int [] res = arraysCopyOf(array, number); - к методу который нужно написатт нижк
    } //return Arrays.copyOf(array, array.length - count);


      static int[] arraysCopyOf(int[] array, int number){
    //    //TODO Написать метод принимающий массив цифр и число.  А возврашающий этот же массив,
          //     с колличеством элементом равным number
          return
          Arrays.copyOf(array, number);
    }
}



