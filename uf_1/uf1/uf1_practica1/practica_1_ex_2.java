/**
 * practica_1_ex_2
 */
public class practica_1_ex_2 {

    public static void main(String[] args) {
        
        float pes;
             float alçada;
             float IMAC;
             System.out.print("Introdueix el teu pes:");
             pes = Float.parseFloat(System.console().readLine());
             System.out.println(pes);
 
             System.out.print("Introdueix el teu alçada:");
             alçada = Float.parseFloat(System.console().readLine());
             System.out.println(alçada);
 
             
             IMAC = pes/(alçada*2);
 
             
             if (IMAC<18.5)
             {
                System.out.println("ets molt prim " + IMAC);
             }
            if (IMAC >  24.9)
             {
                 System.out.println("estas perfecte " + IMAC);
             }
             if (IMAC > 29.9)
             {
                 System.out.println(" ets casi un porc" + IMAC);
             }
             if (IMAC >= 30.0)
             {
                 System.out.println(" ets molt gordu " + IMAC);
             }
    }
}