/**
 * ex_2
 */
public class ex_2 {

    public static void main(String[] args) {
        
        System.out.println("posa el primer nom ");
        String nom1 = System.console().readLine();
        System.out.println("posa el segon nom ");
        String nom2 = System.console().readLine();
        
        System.out.println("cuans calers te " + nom1 + " en el banc");
        float diners1 = Float.parseFloat(System.console().readLine());
        System.out.println("cuans calers te " + nom2 + " en el banc");
        float diners2 = Float.parseFloat(System.console().readLine());

        float resultat = 0;

        if(diners1 >diners2)
        {
            resultat = (diners1 - diners2);
            System.out.println("en " + nom1 + " te " + resultat + " mes que " + nom2);
        }
        else
        {
            resultat = (diners2 - diners1);
            System.out.println("en " + nom2 + " te " + resultat + " mes que " + nom1);
        }


    }
}