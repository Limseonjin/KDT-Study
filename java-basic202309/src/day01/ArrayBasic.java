package day01;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayBasic {
    public static void main(String[] args) {
        //자바배열 특징
        //1. 동종 모음 구조 : 같은 타입만 저장
        //2. 크기가 고정 : 크기를 동적으로 늘리거나 줄일 수 없다

        //배열 선언
        int[] arr;
        //배열 생성
        arr = new int[5];
        //배열 초기화
        arr[0] = 50;
        arr[1] = 40;
        arr[2] = arr[0]+20;
        arr[3] = (int) 66.7;
        arr[4] = 100;
//        arr[5] = 60;
        System.out.println("arr.length = " + arr.length);

        for (int i = 0; i < 5; i++) {
            System.out.println("데이터:"+arr[i]);
        }
        System.out.println("======================");
        for (int i : arr) {
            System.out.println("i = " + i);
        }
        System.out.println("======================");
        //문자열로 배열 내부 출력
        System.out.println(Arrays.toString(arr));

        //배열 한번에 만들기
//        int[] numbers = new int[] {10,20,30};

        //배열변수 선언과 함께일떄는 new 생략가능
        int[] numbers = {10,20,30};
        numbers = new int[] {40,50,60};
        System.out.println(Arrays.toString(numbers));
        System.out.println("======================");

        //배열을 생성만하고 값을 넣지 않으면 기본값이 세팅됨
        byte[] bArr = new byte[3]; //정수 기본값 0
        double[] dArr = new double[5]; // 실수 0.0
        boolean[] boArr = new boolean[4]; // 논리 false
        String[] sArr = new String[3]; //그 외는 null

        System.out.println(Arrays.toString(bArr));
        System.out.println(Arrays.toString(dArr));
        System.out.println(Arrays.toString(boArr));
        System.out.println(Arrays.toString(sArr));

    }
}
