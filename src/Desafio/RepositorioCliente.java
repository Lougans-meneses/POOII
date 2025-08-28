package Desafio;

public class RepositorioCliente  extends RepositorioMemoria<Cliente>{
    @Override
    public Cliente buscarPorId(int id) {
        for (Cliente c : lista) {
            if (c.getId() == id) {
                return c;
            }
        }
        return null;
    }

    @Override
    protected boolean validar(Cliente cliente) {
        return cliente.getNome() != null && !cliente.getNome().isEmpty()
                && cliente.getEmail() != null && !cliente.getEmail().isEmpty();
    }
}
