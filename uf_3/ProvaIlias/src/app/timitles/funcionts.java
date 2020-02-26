package app.timitles;

import java.util.ArrayList;

/**
 * funcionts
 */
public class funcionts {

    public static void titol() {
        System.out.println("*************************************************");
        System.out.println("*       benvinguts a cirvSocialNetworck         *");
        System.out.println("*************************************************");

    }

    public static void Loging() {
        System.out.println("**************************************");
        System.out.println("*       1- Loging                    *");
        System.out.println("*       2- Registre del lector       *");
        System.out.println("*       3- Sortir                    *");
        System.out.println("**************************************");

    }

    public static void Post() {
        System.out.println("**************************************");
        System.out.println("*       1- crear un posts            *");
        System.out.println("*       2- llista tots els posts     *");
        System.out.println("*       3- eliminar un post          *");
        System.out.println("*       4- Modificar lector e editor *");
        System.out.println("*       5- llista editor             *");
        System.out.println("*       6- llista lector             *");
        System.out.println("*       0- Log Out                   *");
        System.out.println("**************************************");

    }

    public static boolean siUsuariEsUnic(ArrayList<administrador> al, String usuari) {
        boolean qunsideix = false;
        for (administrador user : al) {
            if (user.getUsuari().equals(usuari)) {
                System.out.println("Usuari repetit");
                qunsideix = true;
            } else {
                System.out.println("Usuari disponibla");
            }
        }
        return qunsideix;
    }

}