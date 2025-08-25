package Exercicio1;

public class Gato implements Animal {
    @Override
    public void emitirSom() {
        System.out.println("Gato emiti som 'Miau Miau'");
    }

    @Override
    public void mover() {
        System.out.println("Gato caminha pelo telhado");
    }
}
