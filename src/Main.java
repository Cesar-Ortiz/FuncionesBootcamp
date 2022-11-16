public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int valor1 = 10;
        int valor2 = 20;
        int valor3 = 30;

        int resultado = suma(valor1, valor2, valor3);
        System.out.println("el resultado de la suma es: "+resultado);

        Coche carro = new Coche();

        int puertas = carro.incrementaPuerta(1);
        System.out.println("El numero de puertas del carro es "+puertas);
    }
    public static int suma(int a, int b, int c){
        return a+b+c;
    }
}

class Coche{
    int numPuertas=4;
    public int incrementaPuerta(int num){
        return numPuertas+=num;
    }
}