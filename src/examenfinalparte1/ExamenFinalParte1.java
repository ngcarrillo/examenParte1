package examenfinalparte1;

import java.io.IOException;

public class ExamenFinalParte1 {
    /**
     * *
     * @author ngarciacarrillo 
     * @throws IOException 
     * @version 6/05/2016-1
     */

    public static void main(String[] args) throws IOException {
      
        /**
         * @params resultado1 Este parámetro es el resultado de sumar los dos
         * numeros que se pasan a través del objeto
         */
        Sumar objetoSuma1 = new Sumar(10, 20);
        int resultado1 = objetoSuma1.suma;
        System.out.println("Es: " + resultado1);
        /**
         * @params resultado2 Este parámetro es el resultado de sumar el numero 
         * que se le pasa al objetoSuma2
         */
        Sumar objetoSuma2 = new Sumar(10);
        int resultado2 = objetoSuma2.suma;
        System.out.println("Es: " + resultado2);
        /**
         * @params resultado3 Este parámetro simplemente devuelve menos -1 ya 
         * que no se le pasa ningún objeto al método y la variable alli definida
         * es -1
         */
        Sumar objetoSuma3 = new Sumar();
        int resultado3 = objetoSuma3.suma;
        System.out.println("Es: " + resultado3);
    }
}
