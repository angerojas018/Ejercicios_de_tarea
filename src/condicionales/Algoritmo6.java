package condicionales;
import java.util.Scanner;

/*Tomando como base los resultados obtenidos en un laboratorio de análisis clínicos, un médico determina si una persona tiene anemia o no, 
lo cual depende de su nivel de hemoglobina en la sangre, de su edad y de su sexo. Si el nivel de hemoglobina que tiene una persona es menor
que el rango que le corresponde, se determina su resultado como positivo y en caso contrariocomo negativo.
La tabla en la que el medico se basa para obtener el resultado es la siguiente:
   EDAD                 NIVEL HEMOGLOBINA
   0 - 1 mes               13 - 26 g%
 > 1 y < = 6 meses         10 - 18 g%
 > 6 y < = 12 meses        11 - 15 g%
 > 1 y < = 5 años        11.5 - 15 g%
 > 5 y < = 10 años       12.6 - 15.5 g%
 > 10 y < = 15 años        13 - 15.5 g%
 Mujeres > 15 años         12 - 16 g%
 Hombres > 15 años         14 - 18 g%*/
public class Algoritmo8 {

    public static void main(String[] args) {
        System.out.print("Bienvenidos al Laboratorio Clinico, si tienes entre 0 y 12 meses digita (M), si tienes entre 1 año y 14 años (A) o mayor a 15 años(S)");
        Scanner scanner = new Scanner(System.in);
        String letra = scanner.nextLine();
        
        if (letra.equalsIgnoreCase("M")) {
            System.out.print("¿Cuantos meses tiene?");
            double meses;
            meses = Double.parseDouble(scanner.nextLine());
             if (meses > 12){
                      System.out.println("No tienes la edad para este tramite");
                      System.exit(0);}
            System.out.print("¿Cual es su nivel de Hemoglobina?");
            double Hemoglobina;
            Hemoglobina = Double.parseDouble(scanner.nextLine());

            if (meses <= 1) {//Primero
                if (Hemoglobina < 13){
                System.out.println("El paciente dio positivo para anemia");}
                else {
                System.out.println("El paciente dio negativo para anemia");}
            }
            
          
            if  (meses  > 1 && meses <= 6) {//Segundo
                if (Hemoglobina < 10){
                System.out.println("El paciente dio positivo para anemia");}
                else{
                System.out.println("El paciente dio negativo para anemia");}
            }  
            
             if (meses > 6 && meses <= 12) {//Tercero
                if (Hemoglobina < 11) {
                System.out.println("El paciente dio positivo para anemia");}
                else {
                System.out.println("El paciente dio negativo para anemia");}
            }
        }
        else if (letra.equalsIgnoreCase("A")) {
            System.out.println("¿Cuantos años tienes?");
            double años;
            años = Double.parseDouble(scanner.nextLine());
              if (años > 15){
                      System.out.println("No tienes la edad para este tramite");
                      System.exit(0);}
            System.out.print("¿Cual es tu nivel de Hemoglobina?");
            double Hemoglobin;
            Hemoglobin = Double.parseDouble(scanner.nextLine());
            
            if (años <= 5) {//Cuarto
                if (Hemoglobin < 11.5) {
                System.out.println("El paciente dio positivo para anemia");}
                else {
                System.out.println("El paciente dio negativo para anemia");}
            }    
            if (años >5 && años <= 10) {//Quinto
                if (Hemoglobin < 12.6) {
                System.out.println("El paciente dio positivo para anemia");}
                else {
                System.out.println("El paciente dio negativo para anemia");}
            }    
            if (años >10 && años <= 15) {//Sexto
                if (Hemoglobin < 13) {
                System.out.println("El paciente dio positivo para anemia");} 
                else {
                System.out.println("El paciente dio negativo para anemia");}
            }
        }
            if (letra.equalsIgnoreCase("S")) {
                System.out.print("¿Cuantos años tiene?");
                double edad;
                edad = Double.parseDouble(scanner.nextLine());
                  if (edad < 15){
                      System.out.println("No tienes la edad para este tramite");
                      System.exit(0);
                  }
                System.out.print("¿Cual es su nivel de Hemoglobina?");
                double Hemoglobi;
                Hemoglobi = Double.parseDouble(scanner.nextLine());
                System.out.println("¿Eres Hombre (H) o Mujer (M)?");
                String sexo = scanner.nextLine();

                if (sexo.equalsIgnoreCase("H")) {
                    if (edad > 15) {
                        if (Hemoglobi < 14) {
                            System.out.println("El paciente dio positivo para anemia");}
                        else { 
                            System.out.println("El paciente dio negativo para anemia");}
                    }
                }

                if (sexo.equalsIgnoreCase("M")) {
                    if (edad > 15) {
                        if (Hemoglobi < 12) {
                            System.out.println("El paciente dio positivo para anemia");}
                        else { 
                            System.out.println("El paciente dio negativo para anemia");}
                    }
                }    
            }
        }
    }
/*Angela Maria Pizo Rojas u20232217752*/
