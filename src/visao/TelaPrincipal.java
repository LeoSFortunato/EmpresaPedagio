package visao;

import acoes.AcaoBotaoEncerrar;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class TelaPrincipal extends JFrame {

    private static long serialVersionUID = 1L;

    private JButton btConsultar = new JButton("Consultar");
    private JButton btRelatorio = new JButton("Relatório");
    private JButton btConfiguracoes = new JButton("Configurações");
    private JLabel lbRodape = new JLabel("Aula 03 de Java");
    private JButton btPracas = new JButton("Praças");
    private JButton btTarifas = new JButton("Tarifas");
    private JButton btCategorias = new JButton("Categorias");
    private JButton btEncerrar = new JButton("Encerrar");


    public TelaPrincipal() {
        setTitle("Sistema de Gestão de Pedágios");
        setSize(400, 250);
        getContentPane().setLayout(new BorderLayout());
        JPanel painelSuperior = new JPanel();
        painelSuperior.setLayout(new GridLayout(1, 3, 5, 5));
        painelSuperior.add(btConsultar);
        painelSuperior.add(btRelatorio);
        painelSuperior.add(btConfiguracoes);
        getContentPane().add(painelSuperior, BorderLayout.NORTH);
        getContentPane().add(lbRodape, BorderLayout.SOUTH);

        JPanel painelDireita = new JPanel();
        painelDireita.setLayout(new GridLayout(4, 1));
        painelDireita.add(btPracas);
        painelDireita.add(btTarifas);
        painelDireita.add(btCategorias);
        painelDireita.add(btEncerrar);

        getContentPane().add(painelDireita, BorderLayout.EAST);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        btEncerrar.addActionListener(new AcaoBotaoEncerrar());

    }


}
