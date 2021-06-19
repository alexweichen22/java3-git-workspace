package com;
//import java.time.*;
//import java.time.LocalDate;      // Represents a time (hour, minute, second and milliseconds [HH:mm:ss.SSSSSS])
//import java.time.LocalTime;      // Represents a date (year, month, day [yyyy-MM-dd] )
//import java.time.LocalDateTime;  // Represents a date and a time (yyyy-MM-ddTHH:mm:ss.SSSSSS)
//import java.time.format.DateTimeFormatter; //Formatter for displaying and parsing date-time objects
//import java.time.

/* Key Notes
 *  LocalDate ld1 = LocalDate.now()
 *  LocalDate ld2 = LocalDate.of(1978,3,2)
 *  LocalTime lt1 = LocalTime.now()
 *  LocalTime lt2 = LocalTime.of(12,34,56)
 *  LocalDateTime ldt1 = LocalDateTime.now()
 *  LocalDateTime ldt2 = LocalDateTime.of(ld1, lt1)
 *  LocalDateTime ldt3 = LocalDateTime.of(LocalDate.now(), LocalTime.now())
 *  LocalDateTime ldt4 = LocalDateTime.of(LocalDate.of(1978,3,2),LocalTime.of(12,34,56))
 *  DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("yyyy_MM_dd---HH_mm_ss.SSSSSSSSS")
 *  String ldt1_string = ldt1.format(dtf1);*
 */
import java.util.Calendar;
public class CTest02_Time {
    public static void main(String[] args) {
        testDateTime();                    // test1: basic LocalDate, LocalTime, LocalDateTime, DateTimeFormatter;
    }
    static void testDateTime() {
        // java.time.LocalDate
        java.time.LocalDate lDate_Now = java.time.LocalDate.now();
        // LocalDate.now()
        java.time.LocalDate lDate_Of = java.time.LocalDate.of(1978, 3, 2);
        System.out.println(lDate_Of.getDayOfWeek());
        // LocalDate.of(int year, int month, int day)
        System.out.println("---------------- LocalDate.now()  & LocalDate.of() ----------------");
        System.out.println(lDate_Now);
        System.out.println(lDate_Of);

        // java.time.LocalTime
        java.time.LocalTime lTime_Now = java.time.LocalTime.now();
        // LocalTime.now()
        java.time.LocalTime lTime_Of = java.time.LocalTime.of(12, 34, 56, 789);
        // LocalTime.of();
        System.out.println("---------------- LocalTime.now()  & LocalTime.of() ----------------");
        System.out.println(lTime_Now);
        System.out.println(lTime_Of);


        // java.time.LocalDateTime
        java.time.LocalDateTime lDateTime_Now = java.time.LocalDateTime.now();
        // LocalDateTime.now()
        java.time.LocalDateTime lDateTime_Of = java.time.LocalDateTime.of(java.time.LocalDate.of(1234, 5, 6), java.time.LocalTime.of(9, 8, 7, 654));
        // LocalTime.of();
        System.out.println("---------------- LocalDateTime.now()  & LocalDateTime.of() ----------------");
        System.out.println(lDateTime_Now);
        System.out.println(lDateTime_Of);

        // java.time.format.DateTimeFormatter
        // Use "DateTimeFormatter.ofPattern()" to create a customized display format, and assign the format to  "localDateTime.format()"
        java.time.format.DateTimeFormatter d_t_formatter = java.time.format.DateTimeFormatter.ofPattern("yyyy=MM=dd_HH.mm.ss_SSSSSSSSS");
        String lDateTime_Of_String = lDateTime_Of.format(d_t_formatter);
        System.out.println("---------------- java.time.format.DateTimeFormatter (ofPattern)----------------");
        System.out.println("                                              yyyy MM dd HH MM ss SSSSSSSSS");
        System.out.println("Before formatting, localDateTime_Of is:  ___  " + lDateTime_Of);
        System.out.println("After formatting,  lDateTime_Of_Str is:  ___  " + lDateTime_Of_String);
    }          // ".now() & .format() " >>>>LocalDate,LocalTime,LocalDateTime   ofPattern()  >>> DateTimeFormatterr
}
