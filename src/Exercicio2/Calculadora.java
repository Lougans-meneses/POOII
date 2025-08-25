package Exercicio2;

public class Calculadora implements OperacoesMatematicas{
    @Override
    public double somar(double a, double b) {
        return a + b;
    }

    @Override
    public double subtrair(double a, double b) {
        return a - b;
    }

    @Override
    public double multiplicar(double a, double b) {
        return a * b;
    }

    @Override
    public double dividir(double a, double b) {
        if (b == 0) {
            System.out.println("Divisão por zero erro");
            return 0;
        }
        return a / b;
    }

    public double areaCirculo(double raio){
        return PI * raio * raio;
    }
}
