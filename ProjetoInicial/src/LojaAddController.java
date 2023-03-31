import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class LojaAddController implements ActionListener{
    private LojaInterface loja;
    private JFrame janelaPrincipal;

    public LojaAddController( LojaInterface loja, JFrame janela) {
        this.loja = loja;
        this.janelaPrincipal = janela;

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String nome = JOptionPane.showInputDialog(janelaPrincipal,"Nome da ferramenta:");

        int codigo = Integer.parseInt(JOptionPane.showInputDialog(janelaPrincipal,"Digite o codigo:"));

        float preco = Float.parseFloat(JOptionPane.showInputDialog(janelaPrincipal,"Digite o preco:"));

        boolean adicionado = loja.cadastrarProduto(nome,codigo,preco);
        if(adicionado) {
            JOptionPane.showMessageDialog(janelaPrincipal,"Produto adicionado");
        } else {
            JOptionPane.showMessageDialog(janelaPrincipal,"Não foi possivel cadastrar o produto " + ",verifique se já não existe");
        }
    }
}
