package day02;

import java.util.Arrays;

public class Matrix {
    public static void main(String[] args) {
        int korScore = 77;
        int engScore = 100;
        int mathScore = 99;

        int[] kimScores = {korScore,engScore,mathScore};
        int[] parkScores = {100, 22, 56};
        int[] hongScores = {100, 22, 56};

        //2차원배열
        int[][] classscores = {kimScores,parkScores, hongScores};
        System.out.println(classscores.length); //3
        System.out.println(classscores[0]); //주소값
        System.out.println(kimScores);
        System.out.println(Arrays.toString(classscores[0]));
        System.out.println(classscores[0][0]); // kimScores[0]

        System.out.println(Arrays.toString(classscores));
        System.out.println(Arrays.deepToString(classscores));

        //2차원 배열 값 초기화
        int[][] arr2d = {
                {1,2,3},
                {4,5,6},
                {7,8,9},
                {10,11,12}};

        //2차원 배열 순회
        for (int[] nums : arr2d){
            for(int num : nums){
                System.out.printf("%3d ",num);
            }
            System.out.println();
        }

        //배열의 공간만 지정하고 생성 < 5행 4열
        // 5행 : 2차원 배열에 들어갈 1차원 배열 수
        // 4열 : 1차원 배열에 들어갈 데이터의 수
        int[][] array5by4 = new int[5][4];
        array5by4[3][2] = 99;
        for(int[] ints : array5by4){
            for (int anInt:ints){
                System.out.printf("%3d ",anInt);
            }
            System.out.println();
        }

        //3차원 배열
        int[][][] arr3d = {
                {
                        {10,26},
                        {20,74},
                },
                {
                        {30,644},
                        {40,234},
                },
                {
                        {50,111},
                        {60,343},
                }
        };
        System.out.println(arr3d[2][1][0]);
        for(int[][] ints : arr3d){
            for (int[] int1 : ints){
                for (int in : int1){
                    System.out.println("in = " + in);
                }
            }
        }

    }
}
