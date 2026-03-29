package adapters.input;

import adapters.output.ProdutoRepositorioMemoria;
import application.GerenciadorEstoque;
import domain.model.Produto;
import domain.ports.input.IGerenciadorEstoque;
import domain.ports.output.IProdutoRepositorio;

public class EstoqueController {

    public static void main(String[] args) {
        System.out.println("=== SISTEMA DE ESTOQUE - ARQUITETURA EM CAMADAS ===\n");

        IProdutoRepositorio produtoRepositorio = new ProdutoRepositorioMemoria();
        GerenciadorEstoque gerenciador = new GerenciadorEstoque(produtoRepositorio);

        gerenciador.cadastrarProduto("p1", "Teclado Mecânico", 250.00);
        gerenciador.cadastrarProduto("p2", "Mouse Gamer", 180.00);
        gerenciador.cadastrarProduto("p3", "Monitor 24\"", 920.00);

        Produto produto = gerenciador.consultarProduto("p2");
        System.out.println("Produto consultado: " + produto.getNome() + " - R$ " + produto.getPreco());

        double precoMedio = gerenciador.calcularPrecoMedio();
        System.out.println("Preço médio do estoque: R$ " + precoMedio);

        gerenciador.excluirProduto("p1");
        System.out.println("Produto p1 excluído com sucesso.");
    }
}