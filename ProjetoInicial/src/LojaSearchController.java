import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Collection;
public class LojaSearchController implements ActionListener{
    private LojaInterface loja;
    private JFrame janelaPrincipal;

    public LojaSearchController(LojaInterface loja, JFrame janela){
        this.loja = loja;
        this.janelaPrincipal = janela;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int codigo = Integer.parseInt((JOptionPane.showInputDialog(janelaPrincipal,"Qual o codigo do protudo?")));
        Collection<Produtos> ListaProdutos = loja.pesquisarProduto(codigo);
        if(ListaProdutos.size()>0) {
            JOptionPane.showMessageDialog(janelaPrincipal,"Produto encontrado");
            for(Produtos c:ListaProdutos) {
                JOptionPane.showMessageDialog(janelaPrincipal, c.getNome());
            }
        } else {
            JOptionPane.showMessageDialog(janelaPrincipal, "Não foi possivel encontrar o produto");
        }
    }
}
