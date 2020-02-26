package app;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello Java");
        // LocalDate lDate = LocalDate.parse("2020-01-15");
        // System.out.println(lDate);
        // LocalDate ldate2 = lDate.plusDays(40);
        // System.out.println(ldate2);
        Scanner sc = new Scanner(System.in);

        ArrayList<String> agenda = new ArrayList<String>();
        ArrayList<Integer> numero = new ArrayList<Integer>();
        ArrayList<LocalDate> a = new ArrayList<LocalDate>();
        ArrayList<LocalTime> b = new ArrayList<LocalTime>();
         System.out.println(" nom: ");
         agenda.add(sc.nextLine());
         System.out.println(" cognom: ");
         agenda.add(sc.nextLine);
         System.out.println(" numero de telefon: ");
         numero.add(sc.nextInteger);
         System.out.println(agenda.get(0) + numero.get(0));
        int dia = 1;
        boolean sortir = false;
        while (!sortir) {
            System.out.println(" dia " + dia);
            dia++;
            if (dia==31) {
                sortir=true;
            }
        }     
        
    }
}