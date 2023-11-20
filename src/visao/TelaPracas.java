package visao;

import javax.swing.*;

public class TelaPracas extends JFrame {
    private static TelaPracas instancia;

    private TelaPracas(){
        setTitle("Controle de Praças");
        setSize(350, 180);
        JLabel lbTexto = new JLabel("Tela de Praças");
        getContentPane().add(lbTexto);

    }
    public static TelaPracas getInstancia() {
        if (instancia == null) {
            instancia = new TelaPracas();
        }
        return instancia;
    }


}
