package domain.ports.input;

public interface IGerenciadorEstoque {

    void cadastrarProduto(String id, String nome, double preco);
    /**
     * Registra um novo produto no sistema.
     * @param id O identificador único do produto.
     * @param nome O nome do produto.
     * @param preco O preço do produto.
     */
    Produto consultarProduto(String id);
    /**
     * Consulta um produto pelo seu ID.
     * @param id O identificador do produto a ser consultado.
     * @return O produto correspondente ao ID, ou null se não encontrado.
     */
    void excluirProduto(String id);
    /**
     * Exclui um produto do sistema pelo seu ID.
     * @param id O identificador do produto a ser excluído.
     * @throws IllegalArgumentException se o produto com o ID especificado não for encontrado.
     */
    double calcularPrecoMedio(String id);

}