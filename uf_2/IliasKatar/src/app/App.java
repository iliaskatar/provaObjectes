package app;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.xml.crypto.Data;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;
import java.text.SimpleDateFormat;


public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        ArrayList<ArrayList<String>> llistaParticipants = new ArrayList<>();
        ArrayList<String> nom = new ArrayList<>();
        ArrayList<String> cognoms = new ArrayList<>();
        ArrayList<String> categoria = new ArrayList<>();

        ArrayList<Integer> dorsalsInscrits = new ArrayList<>();
        ArrayList<Integer> dorsalsFinalitzats = new ArrayList<>();

        llistaParticipants.add(nom);
        llistaParticipants.add(cognoms);
        llistaParticipants.add(categoria);

        ArrayList<LocalDate> datesNaixament = new ArrayList<>();
        ArrayList<LocalTime> tempsDeParticipantsEnLocalTime = new ArrayList<>();

        int numDorsal = 1;
        LocalTime ltStart = null;
        // afegeixUsuarisTest(llistaParticipants, dorsalsInscrits);
        boolean menu = true;
        while (menu) {
            mostraMenu(); //
            int opcio = sc.nextInt();
            sc.nextLine();
            switch (opcio) {

            case 1:
                System.out.print("Introdueix el Nom: ");
                nom.add(sc.nextLine());
                System.out.print("Introdueix els cognoms: ");
                cognoms.add(sc.nextLine());
                String dataNaixament;
                do {
                System.out.print("Introdueix la teva data de naixament (dd/mm/yyyy): ");
                dataNaixament = sc.nextLine();
                } while (!(elFormatDeLaDataEsCorrecte(dataNaixament)));
                String entrada;
                do {
                System.out.print("Introdueix el sexe (M/F): ");
                entrada = sc.nextLine();
                } while (!(nomesHaEscritUnCaracterIEsMoF(entrada)));
                char sexe = entrada.charAt(0);
                String[] arrayDataNaixament = deStringAArray(dataNaixament, "/");
                int[] arrayDataNaixamentInt = deStringAInt(arrayDataNaixament);
                LocalDate ld = creaLocalDateAmbUnArrayInt(arrayDataNaixamentInt);
                datesNaixament.add(ld);
                categoria.add(calculaCategoria(ld, sexe));
                dorsalsInscrits.add(numDorsal);
                numDorsal++;
                break;

            case 2:

                String cat;
                do {
                    System.out.println("Introdueix la categoria que vols mostrar (De la A a la J): ");
                    System.out.println("Si vols mostrar tots els inscrits per categoria introdueix una 'T'");
                    cat = sc.nextLine();
                } while (!(elFormatDeLaEntradaEsCorrecta(cat)));// pot ser una sola lletra majúscula o minúscula de la a
                                                                // a la j o una t majúscula o minúscula.
                ////// mostraParticipants(cat, llistaParticipants, dorsalsInscrits);

                break;

            case 3:
                System.out.println("Tothom preparat?");
                System.out.println("Prem intro per començar");
                sc.nextLine();
                LocalTime start = LocalTime.of(00,00,00);
                /// ltStart = mostraHoraIniciDeLaCursa();
                break;

            case 4:
                for (Integer dorsal : dorsalsInscrits) {
                    int dorsalQueFinalitza;
                    do {
                        System.out.print("Introdueix el dorsal que ha arribat: ");
                        dorsalQueFinalitza = sc.nextInt();
                        sc.nextLine();
                    } while (!(dorsalExisteix(dorsalQueFinalitza, dorsalsInscrits)));

                    dorsalsFinalitzats.add(dorsalQueFinalitza);
                    mostraNomICognomDeQuiHaArribat(dorsalQueFinalitza, dorsalsInscrits, llistaParticipants);
                    LocalTime ltArribada = LocalTime.now();
                    String tempsEnString = mostraHoraITempsDeQuiHaArribat(ltStart, ltArribada); // Espera un string amb
                                                                                                // el temps utilitzat.
                                                                                                // Exemple: 0:3:25 (3min
                                                                                                // i 25 segons).
                    String[] tempsEnArray = tempsEnString.split(":");
                    afegeixLocalTimeAPartirDeArrayString(tempsEnArray, tempsDeParticipantsEnLocalTime);

                }
                break;

            case 5:
                mostraQualificacioAmbTemps(llistaParticipants, dorsalsInscrits, dorsalsFinalitzats,
                        tempsDeParticipantsEnLocalTime);
                break;
            case 6:
                menu = false;
                break;
            }

        }
    }

    public static void mostraMenu() {
        System.out.println("########################################");
        System.out.println("#                 MENÚ                 #");
        System.out.println("########################################");
        System.out.println("#  1 - Afegeix Participant             #");
        System.out.println("#  2 - Mostra Inscrits                 #");
        System.out.println("#  3 - Inici de la cursa               #");
        System.out.println("#  4 - Registre de dorsals que arriben #");
        System.out.println("#  5 - Mostra classificació            #");
        System.out.println("#  6 - Sortir                          #");
        System.out.println("########################################");
    }

    public static void afegeixUsuarisTest(ArrayList<ArrayList<String>> llistaParticipants, ArrayList<Integer> dorsal) {
        llistaParticipants.get(0).add("Hector");
        llistaParticipants.get(0).add("Andreu");
        llistaParticipants.get(0).add("Pere");
        llistaParticipants.get(0).add("Bel");
        llistaParticipants.get(0).add("Xevi");

        llistaParticipants.get(1).add("Ortiz");
        llistaParticipants.get(1).add("Buenafuente");
        llistaParticipants.get(1).add("Barnils");
        llistaParticipants.get(1).add("Alcoba");
        llistaParticipants.get(1).add("Tartera");

        llistaParticipants.get(2).add("A");
        llistaParticipants.get(2).add("A");
        llistaParticipants.get(2).add("B");
        llistaParticipants.get(2).add("B");
        llistaParticipants.get(2).add("C");

        for (int i = 1; i < 6; i++) {
            dorsal.add(i);
        }

    }

    public static boolean elFormatDeLaEntradaEsCorrecta(String dataNaixament) {
        boolean sortir = false;
        String cat = " ";
        ArrayList<ArrayList<String>> llistaParticipants = new ArrayList<ArrayList<String>>();
        ArrayList<Integer> dorsalsInscrits = new ArrayList<Integer>();
        //mostraParticipants(cat, llistaParticipants, dorsalsInscrits);

        for (int i = 0; i < dataNaixament.length(); i++) {
            dataNaixament = " pep";

            System.out.println(dataNaixament);
        }
        
        return true;

    }

    public static boolean elFormatDeLaDataEsCorrecte(String dataNaixament) {

        System.out.println(LocalDate.parse("2018-10-30").isBefore(LocalDate.parse("2018-10-31")));
        return false;
    }

    public static boolean nomesHaEscritUnCaracterIEsMoF(String entr) {
        Pattern p = Pattern.compile("mMfF{1}");
        Matcher m = p.Matcher(entr);
        return false;

    }

    public static String[] deStringAArray(String dataNaixament, String a) {
        String[] b = { "/" };
        return b;
    }

    public static int[] deStringAInt(String[] arrayDataNaixament) {
        int[] a = new int[5];
        return a;

    }

    public static LocalTime creaLocalDateAmbUnArrayInt(String[] arrayDataNaixamentInt) {

        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String[] datavui = sdf.format(date).split("/");
        LocalTime aara = LocalTime.now();
        ArrayList<Integer> id = new ArrayList<Integer>();
        ArrayList<ArrayList<String>> llistaParticipants = new ArrayList<>();

        id.add(llistaParticipants.get(0).size());
        return aara;

    }
    // public static void calculaCategoria(LocalDate lt, char a){

    // }

    // public static Void mostraParticipants(String cat, ArrayList<ArrayList<String>> llistaParticipants,
    //         ArrayList<Integer> dorsalsInscrits) {

    // }
    // public static LocalTime mostraHoraIniciDeLaCursa (){
    // LocalTime a ;
    // return a;

    // }
    public static boolean dorsalExisteix(int dorsalQueFinalitza, ArrayList<Integer> dorsalsInscrits) {

        
        return false;
    }

    public static void mostraNomICognomDeQuiHaArribat(int dorsalQueFinalitza, ArrayList<Integer> dorsalsInscrits,
            ArrayList<ArrayList<String>> llistaParticipants) {

    }

    public static String mostraHoraITempsDeQuiHaArribat(LocalTime ltStart, LocalTime ltArribada) {
        String a = " ";
        return a;

    }

    public static void afegeixLocalTimeAPartirDeArrayString(String[] tempsEnArray,
            ArrayList<LocalTime> tempsDeParticipantsEnLocalTime) {

    }

    public static void mostraQualificacioAmbTemps(ArrayList<ArrayList<String>> llistaParticipants,
            ArrayList<Integer> dorsalsInscrits, ArrayList<Integer> dorsalsFinalitzats,
            ArrayList<LocalTime> tempsDeParticipantsEnLocalTime) {

    }

}