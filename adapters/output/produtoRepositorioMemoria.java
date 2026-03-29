package adapters.output;

import domain.model.Produto;
import domain.ports.output.IProdutoRepositorio;
import java.until.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProdutoRepositorioMemoria implements IProdutoRepositorio {

    private Map<String, Produto> produtos;

    public ProdutoRepositorioMemoria() {
        this.produtos = new HashMap<>();
    }

    @Override
    public void salvar(Produto produto) {
        produtos.put(produto.getId(), produto);
    }

    @Override
    public Produto buscarPorId(String id) {
        return produtos.get(id);
    }

    @Override
    public void excluirPorId(String id) {
        produtos.remove(id);
    }

    @Override
    public List<Produto> listarProdutos() {
        return new ArrayList<>(produtos.values());
    }
}
