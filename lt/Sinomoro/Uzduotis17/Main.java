package lt.Sinomoro.Uzduotis17;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {

    //reiktu dar speju papildyti metodus su 0 sumos rasymu jei ketvirtyje nieko nevyko, nes dabar net neparaso ketvircio

    //grazina sarasa su bendra suma kikevienam ketvirciui.
   static List<SaskaitaFK> getQuarterReport (List<SaskaitaFK> sarasas)
    {
        List<SaskaitaFK> quarterReport = new ArrayList<>();

                Map<Integer,Map<Integer,BigDecimal>> report = sarasas.stream()
                .collect(Collectors.groupingBy(SaskaitaFK::getYear,Collectors.groupingBy(SaskaitaFK::getQuarter,
                         Collectors.reducing(BigDecimal.ZERO, SaskaitaFK::getSuma, BigDecimal::add))));

                for(Map.Entry<Integer,Map<Integer,BigDecimal>> metai: report.entrySet() )
                {
                    for(Map.Entry<Integer,BigDecimal> ketvirtis : metai.getValue().entrySet())
                    {
                        quarterReport.add(new SaskaitaFK(""+ metai.getKey() + "-"+ ((ketvirtis.getKey() < 4)?("0"+ketvirtis.getKey()*3 ):(ketvirtis.getKey()*3 ))+ "-01",
                                ketvirtis.getValue()
                                ,ketvirtis.getKey()+ " Ketvirtis"));
                    }
                }

        return quarterReport;
    }

    //grazina sarasa su bendra kliento suma kikevienam ketvirciui.
    static List<SaskaitaFK> getQuarterReportTest(List<SaskaitaFK> sarasas)
    {
        List<SaskaitaFK> quarterReport = new ArrayList<>();

        Map<Integer,Map<Integer,Map<String,BigDecimal>>> report = sarasas.stream()
                .collect(Collectors.groupingBy(SaskaitaFK::getYear,Collectors.groupingBy( SaskaitaFK::getQuarter,Collectors.groupingBy(SaskaitaFK::getKlientas,
                        Collectors.reducing(BigDecimal.ZERO, SaskaitaFK::getSuma, BigDecimal::add)))));

        for(Map.Entry<Integer,Map<Integer,Map<String,BigDecimal>>> metai: report.entrySet() ) {
            for (Map.Entry<Integer, Map<String, BigDecimal>> ketvirtis : metai.getValue().entrySet()) {
                for (Map.Entry<String, BigDecimal> klientas : ketvirtis.getValue().entrySet() ) {
                    quarterReport.add(new SaskaitaFK("" + metai.getKey() + "-" + ((ketvirtis.getKey() < 4) ? ("0" + ketvirtis.getKey() * 3) : (ketvirtis.getKey() * 3)) + "-01"
                            , klientas.getValue()
                            , klientas.getKey() +" " + ketvirtis.getKey() + " Ketvirtis"));
                }
            }
        }

        return quarterReport;
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


//        for(Map.Entry<Integer,Map<String,BigDecimal>> elem:getQuarterReportTest(sarasas).entrySet()) {
//            System.out.println(elem.getKey()+" Ketvirtis");
//            for(Map.Entry<String,BigDecimal> elementas:elem.getValue().entrySet()){
//                System.out.println("     "+elementas.getKey() + "  " + elementas.getValue());
//            }
//        }

        int metu_flag = 0;
        int ketvircio_flag = 0;

        for( SaskaitaFK elementas:getQuarterReportTest(sarasas)){
            if(metu_flag != elementas.getYear())
            {
                metu_flag = elementas.getYear();
                System.out.println("************ "+ elementas.getYear()+" Metai **************");
            }
            if(ketvircio_flag != elementas.getMonth())
            {
                ketvircio_flag = elementas.getMonth();
                System.out.println("        ************ "+ elementas.getQuarter()+"Ketvirtis **************");
            }
            System.out.println("                " + elementas);
        }
        System.out.println("**************************************************");

        for( SaskaitaFK elementas:getQuarterReport(sarasas)){
            System.out.println(elementas);
        }
    }
}
