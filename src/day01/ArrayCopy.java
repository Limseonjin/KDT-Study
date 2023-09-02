package day01;

import java.util.Arrays;

public class ArrayCopy {
    public static void main(String[] args) {
        String[] pets = {"멍멍이","고먀미","짹쨱이"};
        
        //배열복사 - 주소값 다르게
//        String[] petCopy = new String[pets.length];
//        for (int i = 0; i < pets.length ; i++) {
//            petCopy[i] = pets[i];
//        }
        String[] petCopy = Arrays.copyOf(pets,pets.length);
        
        pets[1]="어흥이";

        System.out.println("Arrays.toString(pets) = " + Arrays.toString(pets));
        System.out.println("Arrays.toString(petCopy) = " + Arrays.toString(petCopy));
    }
}
