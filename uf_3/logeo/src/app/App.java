package app;

import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

import javax.swing.text.Position;

import ilias.Usuaris;

/**
 * proa
 */
public class App {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        ArrayList<Usuaris> al = new ArrayList<>();
        boolean carrgar = false;
       menu: while (true) {
            if (carrgar) {
                mostreMenu2();
            } else{
                mostreMenu();
            }
            System.out.print("Tria la opció: ");
            int opcio = sc.nextInt();
            sc.nextLine();
            if (carrgar) {
                switch (opcio) {
                case 1:
                boolean cambiar= true;
                
                // String usuari;
                // do {
                //     System.out.println("escriu el nou Usuari (0 per surtir)");
                //     usuari = sc.nextLine();
                //     if (usuati.equls("0")) {
                //         cambiar=false;
                //     }
                   
                // }while (siUsuariEsUnic(al, usuari));
                // if (cambiar) {
                //     al.set(Position.getUsers(usuari);                    
                // }

                    break;
                case 2:

                    break;
                    case 3:
                    // vots.get(i).remove(sn.nextInt());
                    break;
                case 4:
                carrgar=false;
                    break;

                default:
                    break;
                }

            }

            switch (opcio) {

            case 1:
                String usuari;
                do {
                    System.out.print("Introdueix nom d'usuari: ");
                    usuari = sc.nextLine();
                } while (siUsuariEsUnic(al, usuari));
                String password;
                do {
                    System.out.print("Introdueix password: ");
                    password = sc.nextLine();
                } while (!contrasenyaCorrecta(password));
                al.add(new Usuaris(usuari, password));
                break;

            case 2:
                boolean usuCorect = false;
                boolean sortir = false;
                while (!sortir) {
                    System.out.print("intrudueix usuari: ");
                    String us = sc.nextLine();
                    int pocicio = -1;
                    for (Usuaris usuaris : al) {
                        if (usuaris.getUsers().equals(us)) {
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
            case 3:
                break menu;

            }
        }
    }

    private static boolean siUsuariEsUnic(ArrayList<Usuaris> al, String usuari) {
        boolean qunsideix = false;
        for (Usuaris user : al) {
            if (user.getUsers().equals(usuari)) {
                System.out.println("Usuari repetit");
                qunsideix = true;
            } else {
                System.out.println("Usuari disponibla");
            }
        }
        return qunsideix;
    }

    private static boolean contrasenyaCorrecta(String password) {
        if (password.matches("((?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])).{8,}")) {
            System.out.println("Contrasenya Valida");
            return true;
        } else {
            System.out.println("Constrasenya invalida");
            return false;
        }
    }

    private static void mostreMenu2() {
        System.out.println("######################");
        System.out.println("#        Menu        #");
        System.out.println("######################");
        System.out.println("# 1- cambiar usuari  #");
        System.out.println("# 2- cambiar pasword #");
        System.out.println("# 3- eliminar usuari #");
        System.out.println("# 4- sortir          #");
        System.out.println("######################");
    }

    private static void mostreMenu() {
        System.out.println("######################");
        System.out.println("#        Menu        #");
        System.out.println("######################");
        System.out.println("#  1- Registrar      #");
        System.out.println("#  2- Loging         #");
        System.out.println("#  3- sortir         #");
        System.out.println("######################");
    }

}