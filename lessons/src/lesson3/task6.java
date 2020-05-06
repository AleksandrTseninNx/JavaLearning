package lesson3;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class task6 {
    public static void main(String[] args) {
       /* System.out.println(LocalDate.now()); // 2020-04-16
         System.out.println(LocalTime.now()); // 03:16:23.474053400
         System.out.println(LocalDateTime.now()); // 2020-04-16T03:16:23.474053400S
         System.out.println(LocalDate.now().plusDays(1)); // 2020-04-17
        System.out.println(LocalDate.parse("2000-01-01").getDayOfWeek()); // SATURDAY
        System.out.println(LocalTime.parse("06:30").plus(1, ChronoUnit.HOURS)); // 07:30
        System.out.println(LocalTime.parse("06:30").isBefore(LocalTime.parse("07:30"))); // true
         System.out.println(ZoneId.getAvailableZoneIds().size()); // 600 Набор всех идентификаторов зон
         System.out.println(OffsetDateTime.of(LocalDateTime.now(), ZoneOffset.of("+02:00")));*/
        //System.out.println(LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy/dd/MM"))); // 2020/16/04
    LocalDate date1 = LocalDate.now();
    LocalDate newYearDate = LocalDate.now();
        for (LocalDate date = date1; date.isBefore(LocalDate.of(date1.plusYears(1).getYear(), 02, 01)); date = date.plusDays(1))
        {
            newYearDate = date;
        };
        System.out.println(newYearDate);
        System.out.println(newYearDate.getDayOfWeek());
    }
}
