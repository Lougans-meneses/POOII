package Desafio;

public class Main {
    public static void main(String[] args) {

        RepositorioProduto repoProduto = new RepositorioProduto();
        RepositorioCliente repoCliente = new RepositorioCliente();

        repoProduto.salvar(new Produto(1, "Tenis", 1500.0));
        repoProduto.salvar(new Produto(2, "Jaqueta", 320.0));
        repoProduto.salvar(new Produto(3, "", 600.0));

        repoCliente.salvar(new Cliente(1, "Lougans", "lougans@example.com"));
        repoCliente.salvar(new Cliente(2, "Lohanny", "lohanny@example.com"));
        repoCliente.salvar(new Cliente(3, "Kethelen", ""));

        System.out.println("Produto com ID 1: " + repoProduto.buscarPorId(1));
        System.out.println("Cliente com ID 2: " + repoCliente.buscarPorId(2));
        System.out.println("Cliente com ID 3: " + repoCliente.buscarPorId(3));

        System.out.println("Todos os produtos: " + repoProduto.listarTodos());
        System.out.println("Todos os clientes: " + repoCliente.listarTodos());
    }
}
