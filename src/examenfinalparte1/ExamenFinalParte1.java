package examenfinalparte1;

import java.io.IOException;

public class ExamenFinalParte1 {

    public static void main(String[] args) throws IOException {
        Sumar objetoSuma1 = new Sumar(10, 20);
        int resultado1 = objetoSuma1.suma;
        System.out.println("Es: " + resultado1);
        
        Sumar objetoSuma2 = new Sumar(10);
        int resultado2 = objetoSuma2.suma;
        System.out.println("Es: " + resultado2);
        
        Sumar objetoSuma3 = new Sumar();
        int resultado3 = objetoSuma3.suma;
        System.out.println("Es: " + resultado3);
    }
}
