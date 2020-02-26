
/**
 * JOCtORT
 */
import java.utils.ArrayList;

import sun.security.util.Password;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Pattern;

public class JOCtORT {

    public static void main(String[] args) {
        boolean sortir = false;
        String[][] GuardarNoms = new String[6][3];
        int[] array = new int[10];
        String usuari = " ";
        int contrassenya = 0;
        // String key = " ";
        // int length = 0;
        while (!sortir) {
            System.out.println("-----------------------------------------");
            System.out.println("            Tria una opcio               ");
            System.out.println("-----------------------------------------");
            System.out.println(" 1- afagir usuari \n 2- Loging \n 3- sortir ");
            int opcio = Integer.parseInt(System.console().readLine());
            switch (opcio) {
            case 1:
                System.out.println("1- afagir usuari ");
                CrearUsuari(GuardarNoms);
                break;
            case 2:
                System.out.println(" 2- Loging ");
                loging(usuari, contrassenya);
                break;
            case 3:
                System.out.println(" 3- sortir");
                sortir = true;
                break;
            }

        }
    }

    public static void CrearUsuari(String[][] GuardarNoms) {
        boolean intruduir = false;
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String[] datavui = sdf.format(date).split("/");
        while (!intruduir) {
            String nom = System.console().readLine(" intrudueix un nom: ");
            String cognom = System.console().readLine(" intrudueix un cognom: ");
            String adreça = System.console().readLine(" intrudueix un adreça: ");
            String  poblacio = System.console().readLine(" intrudueix un poblacio: ");
            boolean cargar = false;
            while (!cargar) {
                String usuari = System.console().readLine("escriu un usuari: ");
                boolean a = false;
                while (!a) {
                    String password = System.console().readLine("escriu una contrasenya 8 caracters minim : ");
                    if (password.matches("{a-z}{A-Z}{8,}")) {
                        System.out.println("contrasenya es valida ");
                        a = true;
                        cargar = true;
                    } else {
                        System.out.println("contrasenya es incorrecta ");
                    }
                }
                for (int j = 0; j < GuardarNoms[0].length; j++) {

                        GuardarNoms[0][j] = usuari;
                        GuardarNoms[1][j] = nom;
                        GuardarNoms[2][j] = cognom;
                        GuardarNoms[3][j] = adreça;
                        GuardarNoms[4][j] = poblacio;
                        GuardarNoms[5][j] = password; 

                    }
                
                intruduir = true;
            }
            System.out.println("--------------------------------------------------------------------------");
            System.out.println("                   dades del usuari               ");
            System.out.println("--------------------------------------------------------------------------");
            System.out.println(" noms: " + GuardarNoms[0][1] + " \n cognom:   " + GuardarNoms[0][2] + "\n adreça:  "
                    + GuardarNoms[0][3] + " \n poblacio: " + GuardarNoms[0][4] + "\n usuari: " + GuardarNoms[0][0]
                    + "\n contrassenya: " + GuardarNoms[0][5]);
            System.out.println(" Date: " + datavui[0] + "/" + datavui[1] + "/" + datavui[2]);
            System.out.println("--------------------------------------------------------------------------");

        }
    }

    public static void loging(String usuari, int contrassenya) {
        // int[] contra = new int[5];
        String[][] user = new String[2][5];
        boolean s = false;
        boolean q = false;
        String usuari1 = " ";
        String password = "12345678";
        boolean repetit = true;
        Pattern sv = Pattern.compile(usuari);

        // while (repetit) {
        // usuari = System.console().readLine("USUARI: ");
        // repetit=false;
        // for (int i = 0; i < user.length; i++) {
        // if ( usuari.equalsIgnoreCase(user[i])) {
        // repetit= true;
        // }
        // }

        // }

        while (repetit) {

            usuari = System.console().readLine("USUARI: ");
            repetit = false;
            contrassenya = Integer.parseInt(System.console().readLine("PASSWORD: "));

            for (int i = 0; i < user[0].length; i++) {
                for (int j = 0; j < user.length; j++) {
                    user[0][0] = usuari1;
                    user[0][2] = password;

                    repetit = false;

                    if (usuari.equalsIgnoreCase(user[0][i])) {
                        repetit = true;
                    }
                    // while (!q) {
                    //     if (password != contrassenya && usuari1 != usuari) {
                    //         System.out.println("contrassenya o usuari incorrecta");
                    //         System.out.println("Provau de nou");
                    //         q = true;
                    //     } else {
                    //         System.out.println("contrasenya o usuari correctament");
                    //         q = true;
                    //         s = true;
                    //         break;
                    //     }
                    // }
                }
            }
        }

        System.out.println("HOLA EL CLUB");
    }

    public static String getPassword(String key, int length) {
        String pswd = "";

        for (int i = 0; i < length; i++) {
            pswd += (key.charAt((int) (Math.random() * key.length())));
        }

        return pswd;
    }

    // public static void reg(String usuari, int password){ }

}