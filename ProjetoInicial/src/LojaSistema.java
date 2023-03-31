import java.util.*;

public class LojaSistema implements LojaInterface{
    private Map<String, Produtos> produtos;

    public LojaSistema() {
        this.produtos = new HashMap<>();
    }

    @Override
    public boolean cadastrarProduto(String nome, int codigo, float preco) {
        if(!produtos.containsKey(nome)){
            this.produtos.put(nome,new Produtos(nome,codigo,preco));
            return true;
        } else {
            return false;
        }
    }

    @Override
    public Collection<Produtos> pesquisarProduto(int codigo) {
        Collection<Produtos> produtoAchado = new ArrayList<>();
        for(Produtos c: this.produtos.values()) {
            if(c.getCodigo()==codigo){
                produtoAchado.add(c);
            }
        }
        return produtoAchado;
    }

    @Override
    public boolean removeProdutos(String nome) {
        if(this.produtos.containsKey(nome)){
            this.produtos.remove(nome);
            return true;
        } else {
            return false;
        }
    }
}
