
import java.util.Collection;
public interface LojaInterface {

    public boolean cadastrarProduto(String nome, int codigo, float preco);
    public Collection<Produtos> pesquisarProduto(int codigo);
    public boolean removeProdutos(String nome);
}
