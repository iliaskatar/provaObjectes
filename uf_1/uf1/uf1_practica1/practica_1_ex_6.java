/**
 * practica_1_ex_6
 */
public class practica_1_ex_6 {

    public static void main(String[] args) {
        
        long comensa = 0;
        boolean parar = false;
        long temps =0;
      System.out.println(" Escriu correctement la frase ");
      comensa = System.currentTimeMillis();
      System.out.println(comensa);
      while(parar == false)
      {
          
        System.out.println("Setze jutges d'un jutjat mengen fetge en un penjat");
        System.out.println("\n");
        String escriu = System.console().readLine();

        if(escriu.equalsIgnoreCase("Setze jutges d'un jutjat mengen fetge en un penjat"))
            {
                System.out.println("!!!!! CORRECTE !!!!!") ;
                parar = true;
            }
        else
            {
                System.out.println("escriu la frase que demana correctament.");
            }

      }
      //System.out.println(System.currentTimeMillis());
      temps =(System.currentTimeMillis() - comensa);
      System.out.println(" has tardat " + temps);
    }
}