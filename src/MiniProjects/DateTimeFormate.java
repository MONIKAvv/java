package MiniProjects;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormate {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        System.out.println("Todays Date is: "+date);
        LocalDateTime datetime = LocalDateTime.now();
        System.out.println(" Todays time current time : "+datetime);
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-mm-yyyy hh:mm:ss");
        String formatDate = datetime.format(format);
        System.out.println("The formated date and time are: "+ formatDate);


    }
}
