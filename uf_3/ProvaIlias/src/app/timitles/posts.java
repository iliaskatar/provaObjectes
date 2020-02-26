package app.timitles;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

/**
 * posts
 */
public class posts {

    private String usuari, password;
    private LocalDate data;

    public posts(String usuari, String password) {
        this.usuari = usuari;
        this.password = password;
    }

    public String getUsuari() {
        return usuari;
    }

    public void setUsuari(String usuari) {
        this.usuari = usuari;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;

    }

    public static void dataNaixament(LocalDate data) {
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        data = LocalDate.parse("15/08/1993", fmt);
    }

    public static void calculatePeriod(LocalDate inici, LocalDate fin) {
        Period period = Period.between(inici, fin);
        System.out.println(period);
    }

}