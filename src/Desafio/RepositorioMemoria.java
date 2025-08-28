package Desafio;

import java.util.ArrayList;
import java.util.List;

public abstract class RepositorioMemoria<T> implements Repositorio<T> {
    protected List<T> lista = new ArrayList<>();

    @Override
    public void salvar(T obj) {
        if (validar(obj)) {
            lista.add(obj);
            System.out.println("Objeto salvo: " + obj);
        } else {
            System.out.println("Erro: objeto inválido. Não foi salvo.");
        }
    }

    @Override
    public List<T> listarTodos() {
        return lista;
    }

    protected abstract boolean validar(T obj);
}
