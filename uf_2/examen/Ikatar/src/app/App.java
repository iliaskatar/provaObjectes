package app;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import java.util.Arrays;

public class App {
    static DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm");
    static DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("dd/MM/yyyy - HH:mm");
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        HashMap<String, ArrayList<String>> pacients = new HashMap<>();
        HashMap<LocalDateTime, String> cites = new HashMap<>();
        HashMap<Integer, LocalTime> hores = new HashMap<>();
        TreeMap<LocalTime, String> salaEspera = new TreeMap<>();
        TreeMap<LocalDateTime, ArrayList<String>> historialCites = new TreeMap<>();
        ompleMapHores(hores);
        while (true) {
            mostraMenu();
            int opcio = sc.nextInt();
            sc.nextLine();
            switch (opcio) {
            case 1:
                while (true) {
                    String[] dades = new String[4];
                    System.out.println("Introdueix el DNI del pacient (0 per sortir)");
                    dades[0] = sc.nextLine();
                    if (dades[0].equals("0")) {
                        break;
                    }
                    ArrayList<String> volum = new ArrayList<>();

                    System.out.print("Introdueix el nom: ");
                    dades[1] = sc.nextLine();
                    System.out.print("Introdueix el cognom: ");
                    dades[2] = sc.nextLine();
                    System.out.print("Introdueix la Població: ");
                    dades[3] = sc.nextLine();

                    volum.add(dades[2]);
                    volum.add(dades[1]);
                    volum.add(dades[3]);
                    pacients.put(dades[0], volum);

                }

                break;
            case 2:
                mostrar(pacients);
                break;
            case 3:
                System.out.print("Introdueix el DNI del/la pacient: ");
                String dni = sc.nextLine();
                comprovaSiJaExisteix(dni, pacients);
                if (comprovaSiJaExisteix(dni, pacients)) {
                    System.out.print("Introdueix el dia de la visita (dd/mm/yyyy): ");
                    String[] dia = sc.nextLine().split("/");
                    int[] arrayDiaInt = arrayDeStringAInt(dia);

                    mostraAgendaDia(arrayDiaInt, hores, cites, pacients);
                    int hora;
                    do {
                        System.out.print("Introdueix la hora que desitges reservar: ");
                        hora = sc.nextInt();// hora correspon a un enter del desplegable d'hores.
                        sc.nextLine();
                    } while (!comprovaQueLaHoraEsValidaIEstaLliureIGuardaCita(hores, cites, hora, arrayDiaInt, dni)); // comprova
                                                                                                                      // que
                                                                                                                      // el
                                                                                                                      // valor
                                                                                                                      // entrat
                                                                                                                      // ñes
                                                                                                                      // correcte,
                                                                                                                      // i
                                                                                                                      // si
                                                                                                                      // està
                    // lliure. Si és així, emmagatzema la cita.
                    mostraAgendaDia(arrayDiaInt, hores, cites, pacients);
                    System.out.println("Intro per Continuar");
                    sc.nextLine();
                }

                break;
            case 4:
                System.out.print("Introdueix el dia de la cita que vols eliminar (dd/mm/yyyy): ");
                String[] dia = sc.nextLine().split("/");
                int[] arrayDiaInt = arrayDeStringAInt(dia);// passa l'array a int per porder crear l'objecte LocalTime
                                                           // correctament.
                mostraAgendaDia(arrayDiaInt, hores, cites, pacients);
                int hora;
                do {
                    System.out.print("Introdueix la hora que desitges eliminar: ");
                    hora = sc.nextInt();
                    sc.nextLine();
                } while (!eliminaCita(hores, cites, hora, arrayDiaInt));
                mostraAgendaDia(arrayDiaInt, hores, cites, pacients);

                break;
            case 5:
                String dniArribat;
                do {
                    System.out.print("Introdueix el DNI del/la pacient que acaba d'arribar: ");
                    dniArribat = sc.nextLine();
                } while (!comprovaSiDniTeVisitaAvui(cites, dniArribat));// si no té visita
                // reservada no pot passar a la sala d'espera

                //salaEspera.put(retornaHora(cites, dniArribat), dniArribat);// retorna hora ens
                // dona el LocalTime de la hora que tenia reservada

                break;
            case 6:
                mostraSalaEspera(salaEspera, pacients);
                break;
            case 7:
                System.out.println("Prem Intro per rebre informació del/la següent pacient");
                sc.nextLine();
                String dniPacient = mostrarsalaesperainformacio(salaEspera, pacients);
                System.out.println("Escriu Informe per afegir a l'historial: ");
                String informe = sc.nextLine();
                ArrayList<String> al = new ArrayList<>();
                al.add(dniPacient);
                al.add(informe);
                historialCites.put(LocalDateTime.now(), al);
                break;
            case 8:

                System.out.print("Introdueix el DNI: ");
                dni = sc.nextLine();
                if (comprovaSiJaExisteix(dni, pacients)) {
                    mostraHistorialPacient(dni, historialCites);
                } else {
                    System.out.println("El/la pacient no existeix a la clínica");
                }
                break;

            default:
                break;
            }

        }

    }

    public static void mostraMenu() {
        System.out.println("########################################");
        System.out.println("#            ADMINISTRATIU             #");
        System.out.println("########################################");
        System.out.println("#  1 - Introduir Pacient               #");
        System.out.println("#  2 - Mostra Pactients                #");
        System.out.println("#  3 - Nova Cita                       #");
        System.out.println("#  4 - Eliminar cita                   #");
        System.out.println("#  5 - Arribada de pacient al centre   #");
        System.out.println("########################################");
        System.out.println("#                METGE                 #");
        System.out.println("########################################");
        System.out.println("#  6 - Visualitzar sala d'espera       #");
        System.out.println("#  7 - Visitar pacient                 #");
        System.out.println("#  8 - Consultar històric pacient      #");
        System.out.println("########################################");
    }

    public static void ompleMapHores(HashMap<Integer, LocalTime> hores) {
        LocalTime lt = LocalTime.of(18, 0);
        long seconds = lt.toSecondOfDay();
        for (int i = 1; i < 13; i++) {
            hores.put(i, LocalTime.ofSecondOfDay(seconds));
            seconds = seconds + 900;
        }

    }

    public static void mostrar(HashMap<String, ArrayList<String>> pacients) {

        System.out.println("------------------------------");
        System.out.println("total pacients : ");
        System.out.println("------------------------------");
        pacients.forEach((k, v) -> {
            System.out.println("dni: " + k + " - " + v.get(1) + " - " + v.get(0) + " - " + v.get(2));
        });
    }

    public static boolean mirarsiexisteix(String[] dades, HashMap<String, ArrayList<String>> pacients) {

        for (HashMap.Entry<String, ArrayList<String>> entry : pacients.entrySet()) {

            String key = entry.getKey();
            ArrayList<String> value = entry.getValue();

            if (dades.equals(key)) {
                return true;
            }

        }
        System.out.println("el pacient no esta a la base de dades");
        return false;

    }

    public static String mostrarsalaesperainformacio(TreeMap<LocalTime, String> salaEspera,
            HashMap<String, ArrayList<String>> pacients) {

        pacients.forEach((k, v) -> {
            System.out.print("dni: " + k + " - ");
            for (String o : v) {
                System.out.print(o);

            }
        });

        return " be";
    }

    public static boolean comprovaSiJaExisteix(String dni, HashMap<String, ArrayList<String>> pacients) {

        for (HashMap.Entry<String, ArrayList<String>> entry : pacients.entrySet()) {

            String key = entry.getKey();
            ArrayList<String> value = entry.getValue();
            // ...
            if (dni.equals(key)) {
                return true;

            }
        }
        System.out.println(" el pacient no esta a la base de dades");
        return false;

    }

    public static void mostraHistorialPacient(String dni, TreeMap<LocalDateTime, ArrayList<String>> historialCites) {

    }

    public static int[] arrayDeStringAInt(String[] dia) {

        int mida = dia.length;
        int[] arr = new int[mida];
        for (int i = 0; i < mida; i++) {
            arr[i] = Integer.parseInt(dia[i]);
        }
        System.out.println(Arrays.toString(arr));
        return arr;

    }

    public static void mostraSalaEspera(TreeMap<LocalTime, String> salaEspera,
            HashMap<String, ArrayList<String>> pacients) {

        salaEspera.forEach((k, v) -> {
            System.out.print(k + " - " + v);
        });
        System.out.println();

    }

    public static void mostraAgendaDia(int[] arrayDiaInt, HashMap<Integer, LocalTime> hores,
            HashMap<LocalDateTime, String> cites, HashMap<String, ArrayList<String>> pacients) {

    }

    public static boolean eliminaCita(HashMap<Integer, LocalTime> hores, HashMap<LocalDateTime, String> cites, int hora,
            int[] arrayDiaInt) {

        return true;
    }

    public static boolean comprovaQueLaHoraEsValidaIEstaLliureIGuardaCita(HashMap<Integer, LocalTime> hores,
            HashMap<LocalDateTime, String> cites, int hora, int[] arrayDiaInt, String dni) {

        return true;
    }

    public static boolean comprovaSiDniTeVisitaAvui(HashMap<LocalDateTime, String> cites, String dniArribat) {

        return true;
    }

    public static void retornaHora(HashMap<LocalDateTime, String> cites, String dniArribat) {

        LocalTime a = LocalTime.now();
        cites.forEach((k, v) -> {

            v = dniArribat;
            System.out.println(k + " - " + a + "->" + v);

        });
    }

}