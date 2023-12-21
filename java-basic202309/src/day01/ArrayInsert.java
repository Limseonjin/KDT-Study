package day01;

import java.util.Arrays;

public class ArrayInsert {
    public static void main(String[] args) {
        int[] arr = {10,20,90,100};
        int newData = 50;
        int targetIndex = 2;

        //1.사이즈가 1큰 데이터를 복사
        int[] temp = Arrays.copyOf(arr,arr.length+1);
        //2.요소를 뒤로 밀음
        for (int i = arr.length; i>targetIndex; i--) {
            temp[i] = temp[i-1];
        }
        //3.타겟 심음
        temp[targetIndex] = newData;

        arr = temp;
        temp = null;

        System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));
        System.out.println("Arrays.toString(temp) = " + Arrays.toString(temp));
    }
}
