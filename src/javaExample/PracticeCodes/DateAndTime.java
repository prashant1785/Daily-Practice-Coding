package PracticeCodes;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DateAndTime
{
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalDate yesterday = LocalDate.now().minusDays(1);
        LocalDate tommorrow = LocalDate.now().plusDays(1);
        LocalDate birthday = LocalDate.of(2002,04,04);
        LocalDate lastYearDate = LocalDate.now().minusYears(1);
        System.out.println("Today: "+ today);
        System.out.println("Yesterday: "+ yesterday);
        System.out.println("Tommorrow: "+ tommorrow);
        System.out.println("Date Of Birth: "+ birthday);
        System.out.println("Last Year Date: "+lastYearDate);

        LocalTime currentTime = LocalTime.now();
        LocalDateTime dateAndTime = LocalDateTime.now();
        System.out.println("Date And Time: "+dateAndTime);
        System.out.println("Current Time: "+ currentTime);
    }
}
