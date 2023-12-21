package day09.api.time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;

public class DateTime {
    public static void main(String[] args) {
//        Date date = new Date();
//        System.out.println("date = " + date);
//        Calendar instance = Calendar.getInstance(); 
        //위에는 옛날 버전들 

        //현재 날짜 정보 얻기  (연 월 일)
        LocalDate nowDate = LocalDate.now();
        System.out.println("nowDate = " + nowDate);

        //현재 시간 정보 얻기 (시 분 초)
        LocalTime nowTime = LocalTime.now();
        System.out.println("nowTime = " + nowTime);

        //현재 날짜+시간 정보 얻기 / 따로 추출 가능
        LocalDateTime nowDateTime = LocalDateTime.now();
        System.out.println("nowDateTime = " + nowDateTime);
        
        int year = nowDateTime.getYear();//연 추출
        int dayOfMonth = nowDateTime.getDayOfMonth(); //일 추출
        int monthValue = nowDateTime.getMonthValue();
        System.out.println("monthValue = " + monthValue);
        System.out.println("dayOfMonth = " + dayOfMonth);
        
        //원하는 날짜 만들기
        LocalDateTime targetTime = LocalDateTime.of(2023, 11, 25, 0, 0, 0);
        System.out.println("targetTime = " + targetTime);
        
        //날짜 연산
        //도서 대여 시스템 : 대출 오늘 -> 반납은 17일 뒤 
        LocalDateTime rentalDate = LocalDateTime.now();
        LocalDateTime retrunDate = rentalDate.plusDays(17);
        System.out.println("retrunDate = " + retrunDate);

        LocalDateTime targetDate = retrunDate.plusYears(1)
                .plusMonths(6).plusDays(28);

        //사이 날짜 구하기
        LocalDate b = LocalDate.of(2019, 12, 3);
        LocalDate d = LocalDate.of(2023, 9, 18);
        
        nowDate.isAfter(b);
        long between = ChronoUnit.DAYS.between(b, d);
        System.out.println("between = " + between);
        
        //날짜 포맷 바꾸기 
        DateTimeFormatter pattern = DateTimeFormatter.ofPattern("yyyy년 MM월 d일 E요일 a hh시 mm분");
        String dateString = nowDateTime.format(pattern);
        System.out.println("dateString = " + dateString);

    }
}
