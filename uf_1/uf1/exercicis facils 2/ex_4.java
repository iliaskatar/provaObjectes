/**
 * ex_4
 */
public class ex_4 {

    public static void main(String[] args) {
        //4 - Demana 5 números, els mostra, mostra la suma i els mostra en ordre invers (Arrays)

        
        System.out.println(" escriu els  numero");
        int[]array=new int[5];
        int suma = 0;
        
            for(int i = 0;i<array.length;i++)
            {
                array[i]=Integer.parseInt(System.console().readLine());
                suma = suma + array[i];
            }
            System.out.println("la suma dels numeros es : " + suma); 
            for(int x = array.length-1; x>=0;--x)
            {         
                System.out.println( array[x]);  
            }
            

                   
           


    }
}