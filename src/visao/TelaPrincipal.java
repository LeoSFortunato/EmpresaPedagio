package visao;

import javax.swing.*;
import javax.swing.table.TableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
    private final JTextField tfValor = new JTextField(10);


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

       /* tbDados.setModel(new javax.swing.table.DefaultTableModel(
        new Object [] [] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
        },      new String[] {"Código", "Nome", "Valores"}
        ));*/

        getContentPane().add(tfValor, BorderLayout.CENTER);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        btEncerrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent e) {
                System.exit(0);
            }
        });

        btPracas.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent e) {
                TelaPracas tPracas = TelaPracas.getInstancia();
                tPracas.setVisible(true);
            }

        });

        btTarifas.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent e) {

                try {
                    Integer numero = Integer.valueOf(tfValor.getText());
                    Integer dobro = numero * 2;
                    JOptionPane.showMessageDialog(null, "O dobro do valor é " + dobro);
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Aoenas números são permitidos nesse campo!");
                    tfValor.requestFocus();
                    tfValor.selectAll();
                }
            }

        });
    }
}