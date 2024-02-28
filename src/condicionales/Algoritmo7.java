package condicionales;
import java.util.Scanner;
/*Una institución educativa estableció un programa para estimular a los alumnos con buen rendimiento académico y que consiste en lo siguiente:
▪Si el promedio es de 9.5 o más y el alumno es de tecnología, entonces este podrá cursar 55 créditos y se le hará un 25% de descuento.
▪Si el promedio es mayor o igual a 9 pero menor que 9.5 y el alumno es de tecnología, entonces este podrá cursar 50 créditos y se le hará un 10% de descuento.
▪Si el promedio es mayor que 7 y menor que 9 y el alumno es de tecnología, este podrá cursar 50 créditos y no tendrá ningún descuento.
▪Si el promedio es de 7 o menor, el número de materias reprobadas es de 0 a 3 y el alumno es de tecnología, entonces podrá cursar 45 créditos y no tendrá descuento.
▪Si el promedio es de 7 o menor, el número de materias reprobadas es de 4 o más y el alumno es de tecnología, entonces podrá cursar 40 créditos y no tendrá ningún descuento.
▪Si el promedio es mayor o igual a 9.5 y el alumno es de profesional, entonces podrá cursar 55 créditos y se le hará un 20% de descuento.
▪Si el promedio es menor de 9.5 y el alumno es de profesional, entonces podrá cursar 55 créditos y no tendrá descuento.
Obtener el total que tendrá que pagar un alumno si el valor de la matrícula para alumnos de profesional es de $30.000 por cada cinco créditos 
y para alumnos de tecnología es de $18.000 por cada cinco créditos.*/
public class Algoritmo7 {
public static void main(String[] args) {
System.out.print("Muy buenos días,¿Eres estudiante de Tecnología(T)  o Profesional (P)?"); 
Scanner scanner = new Scanner (System.in);
String letra = scanner.nextLine();
   if (letra.equals("T")){
    System.out.print("¿Cúal es su promedio?"); 
    double promedio;
    promedio = Double.parseDouble(scanner.nextLine());
    double descuento = 0;
    double tecnologia = 18000;  
    double matricula = 0;
    double valortt = 0;
     
   if (promedio > 9.5){
    System.out.println("Podrá cursar 55 créditos y se le hará un 25% de descuento");
    System.out.println("¿Cuantos creditos quiere matricular?");
    double creditos;
    creditos = Double.parseDouble(scanner.nextLine());
          
    matricula = creditos * tecnologia /5;
    System.out.println("El valor de su matricula sin descuento,es de:" + matricula);
          
    descuento = matricula * 0.25;
    System.out.println("El 25% de su matricula es:" + descuento);
          
    valortt = (matricula - descuento); 
    System.out.println("El valor total que tendra que pagar de su matricula con el descuento,es de:" + valortt);
          
   }else if (promedio >= 9 && promedio <= 9.4){
     System.out.println("Podrá cursar 50 créditos y se le hará un 10% de descuento");
     System.out.println("¿Cuantos creditos quiere matricular?");
     double creditos;
     creditos = Double.parseDouble(scanner.nextLine());
          
     matricula = creditos * tecnologia /5;
     System.out.println("El valor de su matricula sin descuento,es de:" + matricula);
          
     descuento = matricula * 0.10;
     System.out.println("El 10% de su matricula es:" + descuento);
          
     valortt = (matricula - descuento); 
     System.out.println("El valor total que tendra que pagar de su matricula con el descuento,es de:" + valortt);
          
   }else if (promedio >= 7 && promedio <= 8.9){
     System.out.println("Podrá cursar 50 créditos, pero no tendra descuento");
     System.out.println("¿Cuantos creditos quiere matricular?");
     double creditos;
     creditos = Double.parseDouble(scanner.nextLine());
          
     matricula = creditos * tecnologia /5;
     System.out.println("El valor total que tendra que pagar de su matricula,es de:" + matricula);
        
   }else if (promedio > 6.9){
     int materiasrepro = 0;
      if (materiasrepro >0 && materiasrepro <3 ){
       System.out.println("Podrá cursar 45 créditos, pero no tendra descuento");
       System.out.println("¿Cuantos creditos quiere matricular?");
       double creditos;
       creditos = Double.parseDouble(scanner.nextLine());
                
       matricula = creditos * tecnologia /5;
       System.out.println("El valor total que tendra que pagar de su matricula,es de:" + matricula);
       
      }else if (materiasrepro > 4){
       System.out.println("Podrá cursar 40 créditos, pero no tendra descuento");
       System.out.println("¿Cuantos creditos quiere matricular?");
       double creditos;
       creditos = Double.parseDouble(scanner.nextLine());
                
       matricula = creditos * tecnologia /5;
       System.out.println("El valor total que tendra que pagar de su matricula,es de:" + matricula);}
       }
   else if (letra.equals("P")){
    System.out.print("¿Cúal es su promedio?"); 
    promedio = Double.parseDouble(scanner.nextLine());
    
      if (promedio >= 9.5){
          System.out.println("Podrá cursar 55 créditos y se le hará un 20% de descuento");
          System.out.println("¿Cuantos creditos quiere matricular?");
          double creditos;
          creditos = Double.parseDouble(scanner.nextLine());
          
          matricula = creditos * tecnologia /5;
          System.out.println("El valor de su matricula sin descuento,es de:" + matricula);
          
          descuento = matricula * 0.20;
          System.out.println("El 20% de su matricula es:" + descuento);
          
          valortt = (matricula - descuento); 
          System.out.println("El valor total que tendra que pagar de su matricula con el descuento,es de:" + valortt);
          
      } else if (promedio < 9.4){
          System.out.println("Podrá cursar 55 créditos y no tendra descuento");
          System.out.println("¿Cuantos creditos quiere matricular?");
          double creditos;
          creditos = Double.parseDouble(scanner.nextLine());
          
          matricula = creditos * tecnologia /5;
          System.out.println("El valor total que tendra que pagar de su matricula,es de::" + matricula);
      }
    }
   }
  }
}
/*Angela Maria Pizo Rojas u20232217752*/

