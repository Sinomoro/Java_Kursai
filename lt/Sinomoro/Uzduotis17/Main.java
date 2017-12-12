package lt.Sinomoro.Uzduotis17;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {

   private static List<SaskaitaFK> getQuarterReport (List<SaskaitaFK> sarasas)
    {
        //gaunamas zodynas su ketvircio duomenimis ir ketvircio suma
        Map<String,BigDecimal> tempReport = sarasas.stream()
                .collect(Collectors.groupingBy(
                                SaskaitaFK::getFormatedDate,
                                Collectors.reducing(BigDecimal.ZERO, SaskaitaFK::getSuma, BigDecimal::add))
                );
        //gaunamas surusiuotas sarasas su ketvircio sumomis, pateikiamas SaskaitosFK formatu.

        return tempReport.entrySet().stream()
                .sorted(Comparator.comparing(Map.Entry::getKey))
                .map(p -> new SaskaitaFK(p.getKey(),p.getValue()))
                .collect(Collectors.toList());
    }

    public static void main (String[] args)
    {
        List<SaskaitaFK> sarasas = new ArrayList<>();

        sarasas.add(new SaskaitaFK(LocalDate.parse("2017-03-26"),new BigDecimal("566.89"),"Antanas"));

        sarasas.add(new SaskaitaFK("2017-01-06","50.55","Petras"));
        sarasas.add(new SaskaitaFK("2017-01-16","120.23","Ona"));
        sarasas.add(new SaskaitaFK("2017-02-08","565.89","Lukas"));
        sarasas.add(new SaskaitaFK("2017-02-16","1200.99","Petras"));

        sarasas.add(new SaskaitaFK("2016-03-01","555.55","Ona"));
        sarasas.add(new SaskaitaFK("2016-03-18","0.01","Lukas"));
        sarasas.add(new SaskaitaFK("2016-03-26","566.89","Petras"));

        sarasas.add(new SaskaitaFK("2017-04-06","101.10","Petras"));
        sarasas.add(new SaskaitaFK("2017-04-16","240.46","Ona"));
        sarasas.add(new SaskaitaFK("2017-05-08","1131.78","Lukas"));
        sarasas.add(new SaskaitaFK("2017-05-16","2401.98","Petras"));

        sarasas.add(new SaskaitaFK("2016-06-01","1111.1","Ona"));
        sarasas.add(new SaskaitaFK("2016-06-18","0.02","Lukas"));
        sarasas.add(new SaskaitaFK("2016-06-26","1133.78","Petras"));

        sarasas.add(new SaskaitaFK("2017-07-06","202.20","Petras"));
        sarasas.add(new SaskaitaFK("2017-07-16","480.92","Ona"));
        sarasas.add(new SaskaitaFK("2017-07-08","2263.56","Lukas"));
        sarasas.add(new SaskaitaFK("2017-08-16","4803.96","Petras"));

        sarasas.add(new SaskaitaFK("2016-09-01","2222.2","Ona"));
        sarasas.add(new SaskaitaFK("2016-09-18","0.04","Lukas"));
        sarasas.add(new SaskaitaFK("2016-09-26","2267.56","Petras"));

        sarasas.add(new SaskaitaFK("2017-10-06","404.40","Petras"));
        sarasas.add(new SaskaitaFK("2017-10-16","961.84","Ona"));
        sarasas.add(new SaskaitaFK("2017-11-08","4527.12","Lukas"));
        sarasas.add(new SaskaitaFK("2017-11-16","9607.92","Petras"));

        sarasas.add(new SaskaitaFK("2016-12-01","4444.4","Ona"));
        sarasas.add(new SaskaitaFK("2016-12-18","0.08","Lukas"));
        sarasas.add(new SaskaitaFK("2016-12-26","4535.12","Petras"));

        for( SaskaitaFK elementas:getQuarterReport(sarasas)){
            System.out.println(elementas);
        }
    }
}
