import javax.swing.*;
import java.awt.*;

public class LojaMecanica extends JFrame{
    JLabel linha1, linha2;
    ImageIcon pecaAutomotiva = new ImageIcon("./imgs/pecas-automotivas.jpg");
    ImageIcon adicionaCarr = new ImageIcon("./imgs/adicionar-ao-carrinho.png");
    ImageIcon pesquisar = new ImageIcon("./imgs/barra-de-pesquisa.png");
    ImageIcon excluir = new ImageIcon("./imgs/excluir.png");
    JButton botaoAdicionar, botaoPesquisar, botaoRemover;
    LojaInterface loja = new LojaSistema();

    public LojaMecanica() {
        setTitle("LOJA DE PEÇAS AUTOMOTIVAS");
        setSize(920,720);
        setResizable(false);
        getContentPane().setBackground(Color.gray);
        linha1 = new JLabel("LOJA DE PEÇAS AUTOMOTIVAS", JLabel.CENTER);
        linha1.setForeground(Color.black);
        linha1.setFont(new Font("Arial",Font.BOLD,24));
        linha2 = new JLabel(pecaAutomotiva, JLabel.CENTER);
        botaoAdicionar = new JButton("Adicionar ao carrinho", adicionaCarr);
        botaoAdicionar.addActionListener(new LojaAddController(loja,this));
        botaoPesquisar = new JButton("Pesquisar produto", pesquisar);
        botaoPesquisar.addActionListener(new LojaSearchController(loja, this));
        botaoRemover = new JButton("Remover produto", excluir);
        botaoRemover.addActionListener( new LojaRemoveController(loja, this));

        getContentPane().setLayout(new GridLayout(3,2));
        getContentPane().add(linha1);
        getContentPane().add(botaoAdicionar);
        getContentPane().add(linha2);
        getContentPane().add(botaoPesquisar);
        getContentPane().add(new JLabel());
        getContentPane().add(botaoRemover);
    }
}
