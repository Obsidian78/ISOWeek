package org.example;
import java.util.TimeZone;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
public class IsoWeekTest {
        public static void main(String[] args) {
           /* TimeZone timeZone = TimeZone.getTimeZone("Europe/Berlin");
            SimpleDateFormat formatter = new SimpleDateFormat("ww EEEE dd-MM-yyyy HH:mm:ss z");
            formatter.setTimeZone(timeZone);

            Date date = new Date();
            System.out.println("Aktuelle Zeit in Europe/Berlin: " + formatter.format(date));

            LocalDate JanDate = LocalDate.of(2022, 01, 02);
            Date JanuarDatum = Date.from(JanDate.atStartOfDay(ZoneId.systemDefault()).toInstant());
            System.out.println("Aktuelle Zeit in Europe/Berlin: " + formatter.format(JanuarDatum));
*/
            RunSchleife();
        }



    public static void RunSchleife() {
        LocalDate startDate = LocalDate.of(2022, 11, 25);
        LocalDate endDate = LocalDate.of(2022, 11, 30);

        for (LocalDate date = startDate; date.isBefore(endDate.plusDays(1)); date = date.plusDays(1)) {
            doSomething(date);
        }
    }

    public static void doSomething(LocalDate M) {
        TimeZone timeZone = TimeZone.getTimeZone("Europe/Berlin");
        SimpleDateFormat formatter = new SimpleDateFormat("ww EEEE dd-MM-yyyy");
        formatter.setTimeZone(timeZone);
        Date TooPrint = Date.from(M.atStartOfDay(ZoneId.systemDefault()).toInstant());
        System.out.println("Aktuelle Zeit in Europe/Berlin: " + formatter.format(TooPrint));
        }
    }

//     System.out.println("Aktuelle Zeit in Europe/Berlin: " + formatter.format(TooPrint));
//             LocalDate Enddatum=LocalDate.of(2022,1,15);
//             for(LocalDate i=JanDate;date.toInstant().isBefore(Enddatum.plusDays(1)); i=i.plusDays(1)) {
//             Date TooPrint = Date.from(i.atStartOfDay(ZoneId.systemDefault()).toInstant());
//             System.out.println("Aktuelle Zeit in Europe/Berlin: " + formatter.format(TooPrint));
//             }


