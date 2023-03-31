import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class LojaRemoveController implements ActionListener {
    private LojaInterface loja;
    private JFrame janelaPrincipal;

    public LojaRemoveController( LojaInterface loja, JFrame janela){
        this.loja = loja;
        this.janelaPrincipal = janela;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String nome = JOptionPane.showInputDialog(janelaPrincipal,"Digite o nome do produto que deseja remover:");
        boolean removeu = loja.removeProdutos(nome);
        if(removeu){
            JOptionPane.showMessageDialog(janelaPrincipal,"Produto removido com sucesso");
        } else {
            JOptionPane.showMessageDialog(janelaPrincipal,"Produto não encontrado " + ",operação não realizada");
        }
    }
}
