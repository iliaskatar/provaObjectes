/**
 * practica_1_ex_1
 */
public class practica_1_ex_1 {

    public static void main(String[] args) {
        
        System.out.print("Introdueix el teu nom: ");
        String nom = System.console().readLine();
        System.out.print("Introdueix el teu cognom:");
        String cognom = System.console().readLine(); 
        System.out.print("Introdueix ara el domini:");
        String email = System.console().readLine();
        System.out.println("el teu correu es : " + nom + "." + cognom +"@"+email);
        
    }
}