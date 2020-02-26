package app;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

import app.timitles.*;

public class App {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        funcionts.titol();
        ArrayList<administrador> al = new ArrayList<>();
        ArrayList<editor> ale = new ArrayList<>();
        ArrayList<lector> all = new ArrayList<>();

        String usuari;
        do {
            System.out.print(" Escriu el nom del Administrador: ");
            usuari = sc.nextLine();
        } while (funcionts.siUsuariEsUnic(al, usuari));
        String password = " ";
        // do {
        //     System.out.println(" Escriu el contrasenya del Administrador: ");
        //     password = sc.nextLine();
        // } while (!administrador.contrasenyaCorrecta(password));
        // al.add(new administrador(usuari, password));

        al.add(new administrador(usuari, password));
        boolean carrgar = false;

        menu: while (true) {
            if (carrgar) {
                funcionts.Post();
            } else {
                funcionts.Loging();
            }
            System.out.print("Tria la opció: ");
            int opcio = sc.nextInt();
            sc.nextLine();
            if (carrgar) {
                switch (opcio) {
                case 1:
                    editor edita;
                    System.out.print("intrudueix titol: ");
                    String titol = sc.nextLine();
                    System.out.print("intrudueix contingut: ");
                    String contingut = sc.nextLine();
                    System.out.print("contingut es major de 18 anys?: ");
                    String major = sc.nextLine();
                    // ale.add(new editor(titol, contingut, major));
                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:

                    break;
                case 5:

                    break;
                case 6:
                    carrgar = false;
                    break;

                default:
                    break;
                }

            }

            switch (opcio) {

            case 1:
                boolean usuCorect = false;
                boolean sortir = false;
                while (!sortir) {
                    System.out.print("intrudueix usuari: ");
                    String us = sc.nextLine();
                    int pocicio = -1;
                    for (administrador usuaris : al) {
                        if (usuaris.getUsuari().equals(us)) {
                            pocicio = al.indexOf(usuaris);
                            System.out.println("Usuari es Valid");
                            usuCorect = true;
                        }
                    }
                    if (usuCorect) {
                        System.out.print("intrudueix contrasenya: ");
                        String pas = sc.nextLine();
                        if (al.get(pocicio).getPassword().equals(pas)) {
                            System.out.println("Benvinguts");
                            carrgar = true;
                            break;
                        } else {
                            System.out.println("contrasenya no coincideix");
                            break;
                        }
                    } else {
                        System.out.println("Usuari no existeix");
                    }

                }
                break;
            case 2:
            System.out.print("intrudueix un nom d'usuari unic: ");
                String nom = sc.nextLine();
                System.out.print("intrudueix una contrasenya: ");
                String contra = sc.nextLine();
                System.out.print("intrudueix la teva date de naixement (dd/mm/yyyy): ");
                LocalDate startDate = LocalDate.parse("1900-01-01");
                LocalDate endDate = LocalDate.parse("2002-12-31");
                posts.calculatePeriod(startDate, endDate);

                break;
            case 3:
                break menu;

            }
        }

    }
}