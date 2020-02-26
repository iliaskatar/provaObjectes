package templets;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Figura
 */
public class Figura {
   protected double parimetre, area;
   protected String mesura;
   protected DecimalFormat df = new DecimalFormat("#.##");
   protected Scanner sc= new Scanner(System.in);

    public Figura(String mesura) {
        this.mesura = mesura;
    }

    public double getParimetre() {
        return parimetre;
    }

    public void setParimetre(double parimetre) {
        this.parimetre = parimetre;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public String getMesura() {
        return mesura;
    }

    public void setMesura(String mesura) {
        this.mesura = mesura;
    }
   
    
}