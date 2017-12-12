package lt.Sinomoro.Uzduotis17;

import java.math.BigDecimal;
import java.time.LocalDate;

public class SaskaitaFK {

    private LocalDate data;
    private BigDecimal suma;
    private String klientas;

    SaskaitaFK(LocalDate data, BigDecimal suma, String klientas) {
        this.data = data;
        this.suma = suma;
        this.klientas = klientas;
    }

    SaskaitaFK(String data, String suma, String klientas) {
        this.data = LocalDate.parse(data);
        this.suma = new BigDecimal(suma);
        this.klientas = klientas;
    }

    SaskaitaFK(String formatedDate, BigDecimal suma) {
        int month = Integer.parseInt(formatedDate.substring(5,6))*3;


        this.data = LocalDate.parse(formatedDate.substring(0,4) +"-"+(month<10?"0":"")+month+"-01");
        this.suma = suma;
        this.klientas = formatedDate;
    }
    @Override
    public String toString() {
        return "SaskaitaFK{" +
                "data=" + data +
                ", suma=" + suma +
                ", klientas='" + klientas + '\'' +
                '}';
    }

    BigDecimal getSuma() {
        return suma;
    }

    String getFormatedDate()
    {
        return (this.data.getYear() + " " + ((data.getMonth().getValue()-1)/3 +1) + " Ketvirtis");
    }

}
