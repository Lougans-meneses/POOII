package Desafio;

public class RepositorioProduto extends RepositorioMemoria<Produto>{
    @Override
    public Produto buscarPorId(int id) {
        for (Produto p : lista) {
            if (p.getId() == id) {
                return p;
            }
        }
        return null;
    }

    @Override
    protected boolean validar(Produto produto) {
        return produto.getPreco() >= 0 && produto.getNome() != null && !produto.getNome().isEmpty();
    }
}
