/**
 * practica_1_ex_4
 */
public class practica_1_ex_4 {

    public static void main(String[] args) {
        
        System.out.print("Introdueix el nom de l´article: ");
            String nom = System.console().readLine();

            float preu;
            System.out.print("Introdueix el preu : ");
            preu = Float.parseFloat(System.console().readLine());

            float descompte;
            System.out.print("Introdueix el descompte : ");

            descompte = Float.parseFloat(System.console().readLine());
            float preu_final;

           
             //preu_final = preu_final -(descompte*preu)/100;
             preu_final = preu * (1- (descompte/100));

             System.out.println(" el producte " + nom + " El preu final de l'article és de : " + preu_final);
    }
}