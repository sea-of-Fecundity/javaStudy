package com.example.javastudy.dateandtime;

import java.text.SimpleDateFormat;
import java.time.*;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
public class dateTest {
    public static void main(String[] args) {
        //시간 타임 스탬프
        Date date = new Date();
        //날짜에서 시간을 가져온다. 이 시간마저 기계가 사용하는 시간을 출력한다.
        //객체의 상태를 바꿀 수 있으므로 mutable하다
        long time = date.getTime();
        System.out.println(date);
        System.out.println(time);

        Calendar calendar = new GregorianCalendar(1998, Calendar.UNDECIMBER, 3);
        System.out.println(calendar.getTime());


        SimpleDateFormat dateFormat = new SimpleDateFormat();

        System.out.println("================");
        /**
         * 기계용 api
         */
        //기계적인 시간 date와 유사하다.
        //기준시를 출력한다.
        Instant instant = Instant.now();
        System.out.println("instant "+instant);

        //내 기준으로 시각을 출력하기
        ZoneId zone = ZoneId.systemDefault();
        System.out.println("zone " + zone);
        ZonedDateTime zonedDateTime = instant.atZone(zone);
        System.out.println("zoneDateTime "+zonedDateTime);

        /**
         * 사람용 api
         */
        LocalDateTime now = LocalDateTime.now();
        System.out.println("now "+now);


    }
}
