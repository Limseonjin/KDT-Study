package day10.io.rw;

import java.io.FileWriter;

import static util.Utility.input;

public class FileWriterExample {
    public static void main(String[] args) {
        //텍스트 파일 출력을 위한 문자기반 스트림
        try(FileWriter fw = new FileWriter(FilePath.path+"/hobby.txt")){
            String hobby = input("취미를 입력하세요 : ");
            String message =String.format("내 취미는 %s입니다.",hobby);

            fw.write(message);
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
