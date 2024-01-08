package ClasesAbstractas;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Figura figura1 = new Circulo("azul",12);
        Figura figura2 = new Cuadrado("verde",15);
        Figura figura3 = new Cuadrado("azul",12.4f);
        Figura figura4 = new Circulo("verde",14);
        Figura figura5 = new Circulo("amarillo",13.4f);


        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("Ingrese un numero del 1 al 5");
            int numero = sc.nextInt();
            if (numero == 1){
                System.out.println("El circulo es de color "+figura1.getColor()+" Area es "+ figura1.area()+" Su perimetro es "+figura1.perimetro());
            }
            if (numero == 2){
                System.out.println("El Cuadrado es de color "+figura2.getColor()+" Area es "+ figura2.area()+" Su perimetro es "+figura2.perimetro());
            }
            if (numero == 3){
                System.out.println("El Cuadrado es de color "+figura3.getColor()+" Area es "+ figura3.area()+" Su perimetro es "+figura3.perimetro());
            }
            if (numero == 4){
                System.out.println("El circulo es de color "+figura4.getColor()+" Area es "+ figura4.area()+" Su perimetro es "+figura4.perimetro());
            }
            if (numero == 5){
                System.out.println("El circulo es de color "+figura5.getColor()+" Area es "+ figura5.area()+" Su perimetro es "+figura5.perimetro());
            } else if (numero>5) {
                System.out.println("ingrese un numero valido");
            }



        }


    }

}

