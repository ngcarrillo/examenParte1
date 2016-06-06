package examenfinalparte1;

public class Sumar {

    int suma;

    public Sumar(int num1, int num2) {
        suma = metodoSumar(num1, num2);
    }

    public Sumar(int num1) {
        suma = metodoSumar(num1, num1);
    }

    public Sumar() {
        suma = -1;
    }

    public int metodoSumar(int numSuma1, int numSuma2) {
        return numSuma1 + numSuma2;
    }
}
