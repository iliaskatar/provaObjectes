/**
 * ex_2
 */
public class ex_2 {

    public static void main(String[] args) {
        
         //2 - Suma els parells i els senars fins a un nombre demanat per teclat

         System.out.println("suma de parells i els senars");
         int numero = Integer.parseInt(System.console().readLine());
 
          int [] suma_parell = new int [numero];
          int [] suma_sanar = new int [numero];
          int parell = 0;
          int sanar = 0;
          int x =0;
 
          for(int i =1;i<(numero+1);i++)
          {
                if(i%2==0)
                {
                    suma_parell[parell] = suma_parell[parell] + i;
                    
                }
                else
                {
                    suma_sanar[sanar]=suma_sanar[sanar]+i;
                    
                }
               
            x = i;
          }
          System.out.println(" el numero " + x + " La suma dels parells son : " + suma_parell[parell]);
          System.out.println(" el numero " + x + " la suma dels numeros sanars son : " + suma_sanar[sanar]);

          
    }
}