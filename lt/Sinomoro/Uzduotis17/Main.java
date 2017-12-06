package lt.Sinomoro.Uzduotis17;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {


    //grazina ketvirty ir pilna to ketvircio suma SaskaitosFK saraso tipu
   static List<SaskaitaFK> getQuarterReport (List<SaskaitaFK> sarasas)
    {
//                Map<String,BigDecimal> report = sarasas.stream()
//                .collect(Collectors.groupingBy(SaskaitaFK::getQuarter,
//                         Collectors.reducing(BigDecimal.ZERO, SaskaitaFK::getSuma, BigDecimal::add)));
//

        BigDecimal Q1 = sarasas.stream()
                .filter(e -> e.data.getMonth().getValue() < 4)
                .map(SaskaitaFK::getSuma).reduce(BigDecimal.ZERO, BigDecimal::add);

        BigDecimal Q2 = sarasas.stream()
                .filter(e -> e.data.getMonth().getValue() >= 4 && e.data.getMonth().getValue() < 7)
                .map(SaskaitaFK::getSuma).reduce(BigDecimal.ZERO, BigDecimal::add);

        BigDecimal Q3 = sarasas.stream()
                .filter(e -> e.data.getMonth().getValue() >= 7 && e.data.getMonth().getValue() < 10)
                .map(SaskaitaFK::getSuma).reduce(BigDecimal.ZERO, BigDecimal::add);

        BigDecimal Q4 = sarasas.stream()
                .filter(e -> e.data.getMonth().getValue() >= 10)
                .map(SaskaitaFK::getSuma).reduce(BigDecimal.ZERO, BigDecimal::add);


        List<SaskaitaFK> quarterReport = new ArrayList<>();
        quarterReport.add(new SaskaitaFK("2017-03-31",Q1,"Pirmas Ketvirtis"));
        quarterReport.add(new SaskaitaFK("2017-06-30",Q2,"Antras Ketvirtis"));
        quarterReport.add(new SaskaitaFK("2017-09-30",Q3,"Trecias Ketvirtis"));
        quarterReport.add(new SaskaitaFK("2017-12-31",Q4,"Ketvirtas Ketvirtis"));
        return quarterReport;
    }
    //grazina 2 sluoksniu zodyna, pirmas sluoksnis ketvircio pavadinimas, kitas sluoksnis klientu ir ju sumu tam ketvirciui isvestine.
    //jei atgal reikia butinai perteikti SaskaitosFK tipo objekta galima naudoti foreach cikla ir kurti nauja sarasa is zodyno.
    static Map<String,Map<String,BigDecimal>> getQuarterReportTest(List<SaskaitaFK> sarasas)
    {
        return sarasas.stream()
                .collect(Collectors.groupingBy( SaskaitaFK::getQuarter,Collectors.groupingBy(SaskaitaFK::getKlientas,
                        Collectors.reducing(BigDecimal.ZERO, SaskaitaFK::getSuma, BigDecimal::add))));
    }

    public static void main (String[] args)
    {
        List<SaskaitaFK> sarasas = new ArrayList<>();

        sarasas.add(new SaskaitaFK(LocalDate.parse("2017-03-26"),new BigDecimal("566.89"),"Antanas"));

        sarasas.add(new SaskaitaFK("2017-01-06","50.55","Petras"));
        sarasas.add(new SaskaitaFK("2017-01-16","120.23","Ona"));
        sarasas.add(new SaskaitaFK("2017-02-08","565.89","Lukas"));
        sarasas.add(new SaskaitaFK("2017-02-16","1200.99","Petras"));
        sarasas.add(new SaskaitaFK("2017-03-01","555.55","Ona"));
        sarasas.add(new SaskaitaFK("2017-03-18","0.01","Lukas"));
        sarasas.add(new SaskaitaFK("2017-03-26","566.89","Petras"));

        sarasas.add(new SaskaitaFK("2017-04-06","101.10","Petras"));
        sarasas.add(new SaskaitaFK("2017-04-16","240.46","Ona"));
        sarasas.add(new SaskaitaFK("2017-05-08","1131.78","Lukas"));
        sarasas.add(new SaskaitaFK("2017-05-16","2401.98","Petras"));
        sarasas.add(new SaskaitaFK("2017-06-01","1111.1","Ona"));
        sarasas.add(new SaskaitaFK("2017-06-18","0.02","Lukas"));
        sarasas.add(new SaskaitaFK("2017-06-26","1133.78","Petras"));

        sarasas.add(new SaskaitaFK("2017-07-06","202.20","Petras"));
        sarasas.add(new SaskaitaFK("2017-07-16","480.92","Ona"));
        sarasas.add(new SaskaitaFK("2017-07-08","2263.56","Lukas"));
        sarasas.add(new SaskaitaFK("2017-08-16","4803.96","Petras"));
        sarasas.add(new SaskaitaFK("2017-09-01","2222.2","Ona"));
        sarasas.add(new SaskaitaFK("2017-09-18","0.04","Lukas"));
        sarasas.add(new SaskaitaFK("2017-09-26","2267.56","Petras"));

        sarasas.add(new SaskaitaFK("2017-10-06","404.40","Petras"));
        sarasas.add(new SaskaitaFK("2017-10-16","961.84","Ona"));
        sarasas.add(new SaskaitaFK("2017-11-08","4527.12","Lukas"));
        sarasas.add(new SaskaitaFK("2017-11-16","9607.92","Petras"));
        sarasas.add(new SaskaitaFK("2017-12-01","4444.4","Ona"));
        sarasas.add(new SaskaitaFK("2017-12-18","0.08","Lukas"));
        sarasas.add(new SaskaitaFK("2017-12-26","4535.12","Petras"));


        for(Map.Entry<String,Map<String,BigDecimal>> elem:getQuarterReportTest(sarasas).entrySet()) {
            System.out.println(elem.getKey()+" ");
            for(Map.Entry<String,BigDecimal> elementas:elem.getValue().entrySet()){
                System.out.println("     "+elementas.getKey() + "  " + elementas.getValue());
            }
        }

        System.out.println("**************************************************");

        for( SaskaitaFK elementas:getQuarterReport(sarasas)){
            System.out.println(elementas);
        }
    }
}
