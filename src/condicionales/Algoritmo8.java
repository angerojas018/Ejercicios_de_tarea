package condicionales;
import java.util.Scanner;
/*El Seguro Social requiere clasificar a las personas que se jubilaran en el año 2004. 
Existen tres tipos de jubilaciones: por edad, por antigüedad joven y por antigüedad adulta. 
Las personas adscritas a la jubilación por edad deben tener 60 años o más y una antigüedad en su empleo de menos de 25 años. 
Las personas adscritas a la jubilación por antigüedad joven deben tener menos de 60 años y una antigüedad en su empleo de 25 años o más.
Las personas adscritas a la jubilación por antigüedad adulta deben tener 60 años o más y una antigüedad en su empleo de 25 años o más.*/
public class AlgoritmoJubilación8 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Buen día,Ingrese su edad");
    int edad = sc.nextInt();
    sc.nextLine();
    
    System.out.println("Ingrese su antiguedad");
    int antiguedad = sc.nextInt();
    sc.nextLine();
        
     
        
        if (edad >= 60){
            if (antiguedad < 25){
                System.out.println("Tendra Jubilación por edad");
            }}
        if (edad < 60){
         if (antiguedad > 25){
             System.out.println("Tendra Jubilación por antiguedad joven");
         }}
        else if (edad >= 60){
            if (antiguedad  >= 25){
                System.out.println("Tendra Jubilación por antiguedad adulta");
                }}
        else {
                System.out.println("No cumple con los requisitos para la Jubilación.");
    
    }
  }
}
/*Angela Maria Pizo Rojas u20232217752*/
