/**
 * ex_3
 */
public class ex_3 {

    public static void main(String[] args) {
        //3 - Demana un nombre i mostra si és positiu o negatiu i si és parell o imparell

        System.out.println("si és positiu o negatiu i si és parell o imparell");
        int numero = Integer.parseInt(System.console().readLine());
        boolean stop = false;
        while(!stop)
        {
            if(numero<0 )
            {
                System.out.println("el numero es negatiu");
            }
            else
            {
                System.out.println("el numero es positiu");
            }
            if(numero%2==0)
            {
                System.out.println("el numero es parell");                    
            }
            else
            {    
               System.out.println("el numero es imparell");         
            }
            stop = true;
        }

    }
}