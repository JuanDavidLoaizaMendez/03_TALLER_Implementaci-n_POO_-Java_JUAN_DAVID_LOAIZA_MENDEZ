package FigurasGeometricas;

import java.util.Scanner;

public class Ejecucion {
    public static void main(String[] args) {
        float lado,base,altura,pi,radio;

        Scanner captura=new Scanner(System.in);



        
        //cuadrado
        System.out.println("Por favor digite el valor del lado cuadrado");
        lado=captura.nextFloat();

        //Crear El Objeto De La SubClase Cuadrado
        
        Cuadrado c1=new Cuadrado(lado);
        c1.calcularArea();
        




        

        //Rectangulo
        System.out.println("Por favor digite el valor de la base de la figura rectangulo ");
        base=captura.nextFloat();

        System.out.println("Por favor digite el valor de la altura de la figura rectangulo ");
        altura=captura.nextFloat();

        //Crear El Objeto De La SubClase Rectangulo
        
        Rectangulo R1=new Rectangulo(base,altura);
        R1.calcularArea();







        //Triangulo
        System.out.println("Por favor digite el valor de la base de la figura triangulo ");
        base=captura.nextFloat();

        System.out.println("Por favor digite el valor de la altura de la figura triangulo ");
        altura=captura.nextFloat();

        //Crear El Objeto De La SubClase triangulo
        
        Triangulo T1=new Triangulo(base,altura);
        T1.calcularArea();






         //Circulo
         System.out.println("Por favor digite el valor de pi de la figura circulo ");
         pi=captura.nextFloat();
 
         System.out.println("Por favor digite el valor del radio de la figura circulo ");
         radio=captura.nextFloat();
 
         //Crear El Objeto De La SubClase circulo
         
         Triangulo CI1=new Triangulo(pi,radio);
         CI1.calcularArea();

         
        captura.close();
    }
    
}
