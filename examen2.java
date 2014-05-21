
import java.util.Scanner;

public class examen2 {

public static void main(String[] args) {
//vamos a poner un scanner  que nunca falta en este tipo de programas//
        Scanner lea =new Scanner(System.in);
        //aqui declaramos una variable de la suma de todas las respuestas buenas.
        System.out.println(" ENCUESTA PARA GAMERS!! ");
        System.out.println(" PARA DEMOSTRAR QUIEN ES EL MEJOR");
        System.out.println(" buena suerte!!! ");
        int puntos=0;
         //vamos a empezar la encuesta//
        System.out.println("como se llama la princsa que debe rescatar mario?" );
       	//que lea la respuesta
        String resp1 = lea.next();
        //chekeamos la respuesta correcta//
           String opcion_correcta1="PEACH";
           //si la respuesta es correcta sumaremos un punto// 
           //si la respuesta esta mala no sumara y le dira la respuesta que era//
            if (resp1.equalsIgnoreCase(opcion_correcta1)){
puntos=+1;	
             System.out.print("Correcto\n");
         }
         else {
System.out.print("Incorrecto La respuesta correcta era PEACH\n");
    }
            //vamos a repetir esto en todas//
        System.out.println("cuantos juegoas a lanzado battlefield?");
        String resp2 = lea.next();
        String opcion_correcta2="4";
            
          if (resp2.equalsIgnoreCase(opcion_correcta2)){
puntos=puntos+1;	
             System.out.print("Correcto\n");
         }
         else {
System.out.print("Incorrecto La respuesta correcta era 4\n");
    }
        System.out.println("quien le hace la competencia a fifa en videojuegos?");
        String resp3 = lea.next();
         String opcion_correcta3="PES";
           if (resp3.equalsIgnoreCase(opcion_correcta3)){
puntos=puntos+1;	
             System.out.print("Correcto\n");
         }
         else {
System.out.print("Incorrecto La respuesta correcta era  PES\n");
    }
         System.out.println("juego mas reconocido de futbol?");
        String resp4 = lea.next();
         String opcion_correcta4="FIFA";
           if (resp4.equalsIgnoreCase(opcion_correcta4)){
puntos=puntos+1;
             System.out.print("Correcto\n");
         }
         else {
System.out.print("Incorrecto La respuesta correcta era EA SPORTS\n");
    }
         System.out.println("quien es el enemigo en el call of duty black ops 2?");
        String resp5 = lea.next();
         String opcion_correcta5="RAUL";
          if (resp5.equalsIgnoreCase(opcion_correcta5)){
puntos=puntos+1;	
             System.out.print("Correcto\n");
         }
         else {
System.out.print("Incorrecto la respuesta era RAUL\n");
    }
        //se sumara los puntos correctos//
   System.out.print("Total de Preguntas Correctas son: "+puntos+"\n\n");
   //el porcentaje lo sacaremos con un float
   float porcentaje;            
   //las buenas por 100 entre 5//
   porcentaje=(puntos * 100 / 5);
   //nos mostrara el porcentaje
         System.out.print("El porcentaje total es: "+porcentaje+"%\n");
         if (porcentaje==100) {
            System.out.print("Excelente usted es el mejor gamer\n");
        } else {
         if (porcentaje>=80) {
            System.out.print("sabe mucho\n");
        } else {
            if (porcentaje>=60) {
                System.out.print("bueno\n");
            } else {
                if (porcentaje>=40) {
                    System.out.print("casi o sabe\n");
                } else {
                    System.out.print("super mal no sabe\n");
                }

           }
            }
        }
         /* obtuve un poco de ayuda paara guiarme en https://github.com/IvethS/SegundaParte/blob/master/src/SegundaParteExamen.java
          * de iveth*/
          

