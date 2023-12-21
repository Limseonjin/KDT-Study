package day09.io.stream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputExample {
    public static void main(String[] args) {
        // 바이트기반 스트림 - 이미지,영상,텍스트,기타파일 전부 처리가능
        // 텍스트기반 스트림 - 텍스트 특화 처리

        String msg = "멍멍이는 왈왈~\n하하호호히히";

        //바이트기반
        //try with resources : auto close기능
        try(FileOutputStream fso = new FileOutputStream("D:/hello/dog.txt");) {

            fso.write(msg.getBytes()); //세이브파일 생성

            System.out.println("파일 저장 성공!");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("해당경로를 찾을 수 없습니다.");
        } catch (IOException e) {
            System.out.println("출력 시스템에 장애가 발생했습니다.");
        }
    }
}
