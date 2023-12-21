package day10.io.rw;

import day03.member.Gender;
import day03.member.Member;
import day04.modi.pac1.B;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Arrays;

public class FileReaderExample {
    public static void main(String[] args) {
        try (FileReader fr = new FileReader(FilePath.path+"/member.txt")){
            //성능향상 보조스트림
            BufferedReader br = new BufferedReader(fr);
            String s = br.readLine();
            String[] split = s.split(",");
            System.out.println(Arrays.toString(split));

            Member member = new Member(Integer.parseInt(split[0]), split[1], split[2], split[3], Gender.MALE, Integer.parseInt(split[5]));
            member.inform();

        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
