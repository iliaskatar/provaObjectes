

//5 - Demanar nombre per teclat i preguntar si vol posar més. Mostrar la suma dels positius i negatius, 
// suma dels parells i imparells, quantitat de positius i negatius, quantitat de parells i imparells i mitja 
// de tots els números
import java.util.Scanner;

public class Ex10Loops {

    public static void main(String[] args) {
        
        boolean mesnums = false;

        Scanner scan = new Scanner(System.in);
        System.out.println("Introdueix la quantitat de numeros que entraras: ");
        int numerosIntroduir = scan.nextInt();
        int[] arrayNums = new int[numerosIntroduir];

        int iterador = 0;
        int contador = 1;

        int positiu = 0;
        int negatiu = 0;
        int parell = 0;
        int imparell = 0;

        int arrayPositius[] = new int[1000];
        int arrayNegatius[] = new int[1000];
        int arrayParells[] = new int[1000];
        int arraySenars[] = new int[1000];

        while (contador <= numerosIntroduir && !mesnums) {
            System.out.println("Introdueix un numero (Escriure '0' per acabar)");
            arrayNums[iterador] = scan.nextInt();
            if (arrayNums[iterador] == 0) {
                mesnums = true;
            }
            contador++;
            iterador++;
        }
        // positius i negatius
        for (int i = 0; i < arrayNums.length; i++) {
            if (i > 0) {
                arrayPositius[positiu] = arrayNums[i];
                positiu++;
            }
        }

        for (int i = 0; i < arrayNums.length; i++) {
            if (i < 0) {
                arrayNegatius[negatiu] = arrayNums[i];
                negatiu++;
            }
        }

        for (int i = 0; i < arrayNums.length; i++) {
            if (i % 2 == 0) {
                arrayParells[parell] = arrayNums[i];
                parell++;
            }
        }

        for (int i = 0; i < arrayNums.length; i++) {
            if (i % 2 != 0) {
                arraySenars[imparell] = arrayNums[i];
                imparell++;
            }
        }
      

        // suma Positius i output
        int sumaPos = 0;
        for (int i = 0; i < arrayPositius.length; i++) {
            sumaPos += arrayPositius[i];

        }
        System.out.println();
        System.out.println("La suma dels numeros Positius es: " + sumaPos);

        if(positiu != 0){
            System.out.println("Hi ha un total de " + (positiu+1) + " numeros Positius");
        }else{
            System.out.println("Hi ha un total de " + positiu + " numeros Positius");
        }
        

        // Suma Negatius i output
        int sumaNeg = 0;
        for (int i = 0; i < arrayNegatius.length; i++) {
            sumaNeg += arrayNegatius[i];
        }
        System.out.println();
        System.out.println("La suma dels numeros Negatius es: " + sumaNeg);

        if(negatiu != 0){
            System.out.println("Hi ha un total de " + (negatiu+1) + " numeros Negatius");
        }else{
            System.out.println("Hi ha un total de " + negatiu + " numeros Negatius");
        }
        


        // suma Parells i output
        int sumaPar = 0;
        for (int i = 0; i < arrayParells.length; i++) {
            sumaPar += arrayParells[i];
        }
        System.out.println();
        System.out.println("La suma dels numeros Parells es: " + sumaPar);
        
        if(parell != 0){
            System.out.println("Hi ha un total de " + parell + " Numeros Parells");
        }else{
            System.out.println("Hi ha un total de " + parell + " Numeros Parells");
        }



        // Suma Imparells i output
        int sumaImp = 0;
        for (int i = 0; i < arraySenars.length; i++) {
            sumaImp += arraySenars[i];
        }
        System.out.println();
        System.out.println("La suma dels numeros Imparells es: " + sumaImp);

        if(imparell != 0){
            System.out.println("Hi ha un total de " + imparell + " Numeros Imparells");
        }else{
            System.out.println("Hi ha un total de " + imparell + " Numeros Imparells");
        }
        

        //mitjana i output
        int mitjana = 0;
        for(int i = 0; i< arrayNums.length; i++){
            mitjana = mitjana + arrayNums[i];

        }
        mitjana = mitjana/numerosIntroduir;

        System.out.println();
        System.out.println("La mitjana dels numeros entrats es: "+mitjana);

    }
}
