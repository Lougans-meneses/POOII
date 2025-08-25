package Exercicio2;

public class Main {
    public static void main(String[] args) {
        Calculadora cal = new Calculadora();

        System.out.println("Soma => " + cal.somar(5,5));
        System.out.println("Subtração => " + cal.subtrair(5,5));
        System.out.println("Multiplicação => " + cal.multiplicar(5,5));
        System.out.println("Divisão => " + cal.dividir(5,0));
        System.out.println("Divisão => " + cal.dividir(5,5));


        System.out.println("Área do circulo => " + cal.areaCirculo(12));
        System.out.println("Constante E: " + OperacoesMatematicas.E);
    }
}
