package day01;

import java.util.Arrays;

public class ArrayPop {
    public static void main(String[] args) {
        //pop:맨 끝 데이터 삭제
        int[] arr ={10,20,30,40,50};

        //새로운 배열을 생성 (기존보다 -1 작음)
        int[] temp = new int[arr.length-1];
        for (int i = 0; i < temp.length; i++) {
            temp[i] = arr[i];
        }
        arr = temp; //주소값 변경
        temp = null;

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(temp));
    }
}
