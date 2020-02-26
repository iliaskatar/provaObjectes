// 6.- Demana números per teclat fins a un màxim especificat  per teclat. guEs demanen i es guarden en una matriu els números fins que es responi "x" o 
// arribi al màxim. Finalment s'imprimeixen en ordre i es demana un número per cercar. si està s'imprimeix la posició d'aquest nombre en l'array.
import java.util.Scanner;
//array[contador] != "x" && contador2<array.length
public class Ex11Loops{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Introdueix cuants numeros entraras: ");
        int num = scan.nextInt();

        String array[] = new String[num];
        int arrayInt[] = new int[num];
        int contador = 0;
        int contador2 = 0;
        boolean a = false;
        int d = 0;
       
        while (!a && contador<array.length){
            array[contador] = scan.nextLine();
            if(array[contador] == "x"){
                a=true;
            }
            else{

            }
            contador++;
            
        }

       for(int i = 0; i<arrayInt.length-1; i++){
            for(int j = i+1;j<arrayInt.length;j++){
                if(arrayInt[i] > arrayInt[j]){
                    int auxiliar = arrayInt[i];
                    arrayInt[i] = arrayInt[j];
                    arrayInt[j] = auxiliar;
                }
            }
        }
        System.out.println("Numeros en Ordre:");
        for(int i = 0; i<array.length; i++){
            System.out.println(array[i]);
        }
    }
}