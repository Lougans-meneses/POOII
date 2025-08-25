package Exercicio1;

public class Cachorro implements Animal {
    @Override
    public void emitirSom() {
        System.out.println("Cachorro emitir som 'Au Au'");
    }

    @Override
    public void mover() {
        System.out.println("Cachorro corre pela frente");
    }
}
