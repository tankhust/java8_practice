package com.tank.java8.TimeAPI;

import java.time.*;
import java.time.temporal.ChronoUnit;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author tank
 * @create 2019/12/10 23:15
 */
public class Java8TimeTest {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);
        System.out.println(localDate.getYear() + ", " + localDate.getMonthValue() + ", " + localDate.getDayOfMonth());

        System.out.println("------------------");
        LocalDate localDate1 = LocalDate.of(2017, 3, 3);
        System.out.println(localDate1);

        System.out.println("------------------");
        LocalDate localDate3 = LocalDate.of(2010, 3, 25);
        MonthDay monthDay = MonthDay.of(localDate3.getMonth(), localDate3.getDayOfMonth());
        MonthDay monthDay1 = MonthDay.from(LocalDate.of(2011, 3, 25));

        if (monthDay.equals(monthDay1)) {
            System.out.println("equals");
        } else {
            System.out.println("not equals");
        }


        System.out.println("--------------------");
        LocalTime time = LocalTime.now();
        System.out.println(time);

        LocalTime time2 = time.plusHours(3).plusMinutes(20);
        System.out.println(time2);

        System.out.println("--------------------");

        LocalDate localDate4 = localDate.plus(2, ChronoUnit.WEEKS);
        System.out.println(localDate4);


        System.out.println("--------------------");

        LocalDate localDate5 = localDate.plus(2, ChronoUnit.DAYS);
        System.out.println(localDate5);

        System.out.println("--------------------");
        Clock clock = Clock.systemDefaultZone();
        System.out.println(clock.millis());

        System.out.println("--------------------");

        LocalDate localDate6 = LocalDate.now();
        LocalDate localDate7 = LocalDate.of(2019, 12, 11);
        System.out.println(localDate6.isAfter(localDate7));
        System.out.println(localDate6.isBefore(localDate7));
        System.out.println(localDate6.isEqual(localDate7));

        System.out.println("--------------------");

        Set<String> set = ZoneId.getAvailableZoneIds();
        Set<String> treeset = new TreeSet<String>() {//TreeSet子类
            {
                addAll(set);// 构造块
            }
        };
        treeset.stream().forEach(System.out::println);//按顺序打印时区

        System.out.println("--------------------");

        ZoneId zoneId = ZoneId.of("Asia/Shanghai");
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);

        ZonedDateTime zonedDateTime = ZonedDateTime.of(localDateTime, zoneId);
        System.out.println(zonedDateTime);


        System.out.println("--------------------");

        YearMonth yearMonth = YearMonth.now();
        System.out.println(yearMonth);
        System.out.println(yearMonth.lengthOfMonth());
        System.out.println(yearMonth.isLeapYear());

        System.out.println("--------------------");

        YearMonth yearMonth1 = YearMonth.of(2016, 2);
        System.out.println(yearMonth1);
        System.out.println(yearMonth1.lengthOfMonth());
        System.out.println(yearMonth1.lengthOfYear());
        System.out.println(yearMonth1.isLeapYear());

        System.out.println("--------------------");
        LocalDate localDate8 = LocalDate.now();
        LocalDate localDate9 = LocalDate.of(2020, 9, 23);
        Period period = Period.between(localDate8, localDate9);
        System.out.println(period);
        System.out.println(period.getYears());
        System.out.println(period.getMonths());
        System.out.println(period.getDays());

        System.out.println("--------------------");
        System.out.println(Instant.now());

    }
}
