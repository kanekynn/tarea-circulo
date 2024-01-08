package ClasesAbstractas;

public class Circulo extends Figura{
    float pi = 3.14159f;
    private float radio;
    public Circulo(String color,float radio){
        super(color);
        this.radio = radio;
    }
    @Override
    public float area(){


        return pi*radio*radio;
    }
    @Override
    public float perimetro(){
        return 2*pi*radio;
    }
    @Override
    public void printColor(){
        System.out.println("El color del Circulo es : "+color);

    }
}

