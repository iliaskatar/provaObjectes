package app;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        ArrayList<String> agenda = new ArrayList<String>();
        ArrayList<Integer> numero = new ArrayList<Integer>();
        ArrayList<LocalDate> a = new ArrayList<LocalDate>();
        ArrayList<LocalTime> b = new ArrayList<LocalTime>();
        // System.out.println(" nom: ");
        // agenda.add(sc.nextLine());
        // System.out.println(" cognom: ");
        // agenda.add(sc.nextLine());
        // System.out.println(" numero de telefon: ");
        // numero.add(sc.nextInt());
        // System.out.println(" nom: " + agenda.get(0) + " cognom: " + agenda.get(0) + "
        // telefon: " + numero.get(0));
        int opcio = 0;
        int mes = 0;
        String[] nota = new String[1];

        boolean sortir = false;
        while (!sortir) {
            System.out.println("                      menu                     ");
            System.out.println(" 0- sortir \n 1- mostrar mesos \n 2-mostrar dades ");
            opcio = sc.nextInt();
            sc.nextLine();

            switch (opcio) {

            case 1:
                mostrarMesos(nota, opcio);
                break;
            case 2:
                mostrarDades(nota);
                break;
            case 0:
                sortir = true;
                break;

            }

        }

        // event[1]= sc.nextLine().split(":");

    }

    public static void menu() {
        System.out.println(
                " 1- gener \n 2- febrer \n 3- març \n 4- abril \n 5- maig \n 6- juny \n 7- juliol \n 8- agost \n 9- setembre \n 10- octobre \n 11- novembre \n 12- desembre \n ");

    }

    public static void mostrarDades(String[] nota) {
        System.out.println("----------------------------");
        System.out.println("        les tevas dades     ");
        System.out.println("----------------------------");
        for (int i = 0; i < nota.length; i++) {
            System.out.println(nota[i]);
        }
        System.out.println("----------------------------");

    }

    public static void mostrarMesos(String[] nota, int opcio) {
        Scanner sc = new Scanner(System.in);
        boolean sortir = false;
        
            System.out.println("                      menu                     ");
            menu();
            opcio = sc.nextInt();
            sc.nextLine();

            switch (opcio) {

            case 1:
                gener(nota);

                break;
            case 2:
                cafebrer(nota);
                break;
            case 3:
                gener(nota);
                break;
            case 4:
                gener(nota);
                break;
            case 5:
                gener(nota);
                break;
            case 6:
                gener(nota);
                break;
            case 7:
                gener(nota);
                break;
            case 8:
                gener(nota);
                break;
            case 9:
                gener(nota);
                break;
            case 10:
                gener(nota);
                break;
            case 11:
                gener(nota);
                break;
            case 12:
                gener(nota);
                break;
            

            

        }

    }

    public static int date(LocalDateTime ldt, ArrayList<LocalDateTime> aldt) {
        int position = 0;
        for (LocalDateTime ldttemp : aldt) {
            if (ldt.isAfter(ldttemp)) {
                position = aldt.indexOf(ldttemp) + 1;
            }

        }
        return position;
    }

    public static void gener(String[] a) {
        Scanner sc = new Scanner(System.in);
        int dies = 0;
        String nota = " ";
        for (int i = 0; i < 32; i++) {
            System.out.println(" dia " + i);
        }
        System.out.println(" intrudoeix un dia: ");
        //dies = sc.nextInt();
        nota = System.console().readLine(" escriu la nota: ");
        for (int k = 0; k < a.length; k++) {
            a[k] = nota;
        }

    }

    public static void cafebrer(String[] a) {
        int dies = 0;
        String nota = " ";
        for (int i = 0; i < 29; i++) {
            System.out.println(" dia " + i);
        }
        Scanner sc = new Scanner(System.in);
        System.out.println(" intrudoeix un dia: ");
        dies = sc.nextInt();
        nota = System.console().readLine(" escriu la nota: ");
        for (int k = 0; k < a.length; k++) {
            a[k] = nota;
        }
    }
}