/**
 * ex_1
 */
public class ex_1 {

    public static void main(String[] args) {
         //Calcula el factorial d'un nombre demanat per teclat


        
        System.out.println("numero facturial");
        int numero = Integer.parseInt(System.console().readLine());
        int facturial=1;

        System.out.println("tots el numeros facturial");
        for(int i =numero;i>0;i--)
        {
            facturial =facturial*i;
            System.out.println(facturial);
        }
    }
}