/**
 * practica_1_ex_5
 */
public class practica_1_ex_5 {

    public static void main(String[] args) {
        
        System.out.print("Introdueix el teu non: ");
        String nom = System.console().readLine();

        boolean parar = false;
        int punts = 0;
        
        float pregunta_1;
        
        float pregunta_2;
        
        float pregunta_3;
        float pregunta_4;
        
        

        if(parar == false)
        {
            System.out.println(" qüestionari de 4 preguntes ");

            if (punts == 0)
            {
                
                System.out.println("1) 1+1= ");
                pregunta_1  = Float.parseFloat(System.console().readLine());
               
                    if(pregunta_1 == 2)
                    {
                        punts++;
                        System.out.println(" corecte!!! tens " + punts + " punts");
                    }
                    else
                    {
                        System.out.println("incorrecte");
                        parar = true;
                    }
                }
            
            if(punts == 1)
            {
            
                System.out.println(" 2) 1+2 = ");
                pregunta_2  = Float.parseFloat(System.console().readLine());


                    if (pregunta_2 == 3)
                    {
                        punts++;
                        System.out.println(" corecte!!! tens " + punts + " punts");

                    }
                    else
                    {
                        System.out.println("incorrecte");
                        parar = true;
                    }
            }
                if (punts == 2)
                {
            
                System.out.println("3) 2+2=");
                pregunta_3  = Float.parseFloat(System.console().readLine());
                    
                
                    if (pregunta_3 == 4)
                    {
                        punts++;
                        System.out.println(" corecte!!! tens " + punts + " punts");

                    }
                    else
                    {
                        System.out.println("incorrecte");
                        parar = true;
                    }
                }
                if (punts == 3)
                {
            
                System.out.println("3) 5+5=");
                pregunta_4  = Float.parseFloat(System.console().readLine());
                    
                
                    if (pregunta_4 == 10)
                    {
                        punts++;
                        System.out.println(" corecte!!! tens " + punts + " punts");

                    }
                    else
                    {
                        System.out.println("incorrecte");
                        parar = true;
                    }
                }

 
        }
        System.out.println(""+ nom + " tens " + punts + " punts");
    }
}