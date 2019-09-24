package practicas_uf1;

/**
 * practica1
 */
public class practica1 {

    public static void main(String[] args) {

        
            System.out.print("Introdueix el teu nom::");
            String nom = System.console().readLine();
            System.out.println(nom);

            System.out.print("Introdueix el teu cognom:");
            String cognom = System.console().readLine();
            System.out.println(cognom);
            System.out.print("Introdueix ara el domini:");
            String email = System.console().readLine();
            System.out.println(email);
            System.out.println("el teu correu es : " + nom + "." + cognom +"@"+email);

        

        
    }
}