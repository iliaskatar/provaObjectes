/**
 * ex_3
 */
public class ex_3 {

    public static void main(String[] args) {
       
        System.out.println("digas el teu nom ");
        String nom = System.console().readLine();
        System.out.println("cuantas voltes has fet?");
        float voltes = Float.parseFloat(System.console().readLine());
         
        if(voltes < 6)
        {
            System.out.println("en " + nom +" a tret un deficient");
        }
        if(voltes == 6 && voltes < 8)
        {
            System.out.println("en " + nom +" a tret un insuficient");
        }
        if(voltes == 8 && voltes < 9)
        {
            System.out.println("en " + nom +" a tret un suficient");
        }
        if(voltes == 9 && voltes < 10)
        {
            System.out.println("en " + nom + " a tret un be");
        }
        if(voltes == 10 && voltes < 11)
        {
            System.out.println("en " + nom +" a tret un notable");
        }
        if(voltes == 11 || voltes >= 12)
        {
            System.out.println("en " + nom + " a tret un exel·lent");
        }
        
        
        

    }
}