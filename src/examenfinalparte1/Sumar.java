package examenfinalparte1;
/**
 * 
 * @author ngarciacarrillo
 * @version 6/05/2016-1
 */
public class Sumar {
/**
 * @params suma Este parámetro es el resultado de realizar el métodoSumar según
 * que constructor se use.
 */
    int suma;
 /**
  * @see metodoSumar
  * @param num1 Parametro que se recoje desde la clase ExamenFinalParte1
  * @param num2 Parametro que se recoje desde la clase ExamenFinalParte1
  * 
  * Este es el constructor de la clase a usar cuando se van a pasar dos numeros 
  * distintos desde el main.
  */
    public Sumar(int num1, int num2) {
        suma = metodoSumar(num1, num2);
    }
/**
 * @see metodoSumar
 * @param num1 Parametro que se recoje desde la clase ExamenFinalParte1
 * Este es el constructor de la clase a usar cuando se va a pasar un numero
  desde el main.
 */
    public Sumar(int num1) {
        suma = metodoSumar(num1, num1);
    }
/**
 * @see metodoSumar
 * Este es el constructor cuando no se recoje ninguna variable
 */
    public Sumar() {
        suma = -1;
    }
/**
 * 
 * @param numSuma1
 * @param numSuma2
 * @return devuelve un Int de la suma de los parametros que se pasan
 */
    public int metodoSumar(int numSuma1, int numSuma2) {
        return numSuma1 + numSuma2;
    }
}
