package lt.Sinomoro.Uzduotis17;

import java.math.BigDecimal;
import java.time.LocalDate;

public class SaskaitaFK {

    LocalDate data;
    private BigDecimal suma;
    private String klientas;

    SaskaitaFK(LocalDate data, BigDecimal suma, String klientas) {
        this.data = data;
        this.suma = suma;
        this.klientas = klientas;
    }

    SaskaitaFK(String data, BigDecimal suma, String klientas) {
        this.data = LocalDate.parse(data);
        this.suma = suma;
        this.klientas = klientas;
    }

    SaskaitaFK(String data, String suma, String klientas) {
        this.data = LocalDate.parse(data);
        this.suma = new BigDecimal(suma);
        this.klientas = klientas;
    }

    public String getKlientas() {
        return klientas;
    }

    @Override
    public String toString() {
        return "SaskaitaFK{" +
                "data=" + data +
                ", suma=" + suma +
                ", klientas='" + klientas + '\'' +
                '}';
    }

    public BigDecimal getSuma() {
        return suma;
    }

    public LocalDate getData() {
        return data;
    }

    public String getQuarter()
    {
        return"Q" + ((data.getMonth().getValue()-1)/3 +1);
    }
}
