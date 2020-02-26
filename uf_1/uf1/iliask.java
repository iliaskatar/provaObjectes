package app;

import java.io.Console;
import java.sql.Time;
import java.time.LocalTime;
import java.util.Scanner;


public class App {

    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("intrudueix primer nom");
        String nom1 = System.console().readLine();
        System.out.println("intrudueix segon nom");
        String nom2 = System.console().readLine();
        
        int [] resultatJavalina = new int [2];        
        int [][]arrayJavalina = new int [2][2]; 

        float usuari1;
           float usuari2;
            int contador=0;
           
           int[] arrayusuari = new int[2];
           int[] arrayusuari2=new int [2];
           for (int o = 0; o < arrayusuari.length; o++) {
               System.out.println(" llensament " + nom1 + " : ");
                    usuari1 = sc.nextFloat();
               usuari1 = arrayusuari[o];
                     
           for (int p = 0; p < arrayusuari2.length; p++) {
               System.out.println(" llensament " + nom2 + " : ");
                    usuari2=sc.nextFloat();
                     usuari2= arrayusuari2[p];
    
        for (int j = 0; j < arrayJavalina[0].length; j++) {
            
            for (int i = 0; i < arrayJavalina.length; i++) {
                    contador++;
                     if(arrayJavalina[i][j] == arrayJavalina[i][j]){
                        
                        arrayusuari[o]= arrayJavalina[j][i];
                        arrayusuari2[p]= arrayJavalina[j][i];
               }
               System.out.print("\t" + arrayJavalina[j][i]);
               
            }
            System.out.println("\n");
        } 
    }
    }

        for (int i = 0; i < resultatJavalina.length ; i++) {
            for (int j = 0; j < arrayJavalina.length; j++) {
                for (int x = 0; x < arrayJavalina[0].length; x++) {
                    if(arrayJavalina[j][x]>arrayJavalina[j][x]){
                        arrayJavalina[j][x]=resultatJavalina[i];
                    }
                }
            } 
            System.out.println("el resultat de la javalina " + resultatJavalina[i]);
        }
        System.out.println("segona proba salt");
        int[][]arayatle=new int[2][2];
        int[] long1=new int [2];
        int[] long2 =new int[2];
        int[] finalsalt=new int [2];

        for (int j = 0; j < arayatle[0].length; j++) {
            for (int i = 0; i < arayatle.length; i++) {
                System.out.println(" salt " + nom1 + " : ");
                usuari1= sc.nextFloat();
                System.out.println("salt " + nom2 + " : ");
                usuari2=sc.nextFloat();
                if(arayatle[j][i]==arayatle[j][i]){
                    usuari1=arayatle[j][i];
                    usuari2=arayatle[j][i];
                }
                System.out.println("\t" + arayatle[j][i]);
            }
            System.out.println("\n");
        }
        for (int i = 0; i < finalsalt.length ; i++) {
            for (int j = 0; j < arayatle.length; j++) {
                for (int x = 0; x < arayatle[0].length; x++) {
                    if(arayatle[j][x]>arayatle[j][x]){
                        arayatle[j][x]=finalsalt[i];
                    }
                }
            } 
            System.out.println("el resultat de la javalina " + resultatJavalina[i]);
        }

        System.out.println("ultima proba carrera");
        int[] velocitat=new int[2];
        int sortida;
        int aribada;
        LocalTime now = LocalTime.now();

        //sortida = now.now(1);
        System.out.println(" preta espa");
     for (int i = 0; i < velocitat.length; i++) {
         usuari1=sc.nextFloat();
         System.out.println(" ");
         usuari2= sc.nextFloat();
         if(velocitat[i]==velocitat[i])
         {
             usuari1=velocitat[i];
             usuari2=velocitat[i];
         }
         System.out.println(velocitat[i]);
                 
     }
     //aribada= sortida-Time;
       


       

        



        

       

    }
}



























































































































