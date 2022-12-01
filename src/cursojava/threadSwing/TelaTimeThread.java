package cursojava.threadSwing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaTimeThread extends JDialog {

    private JPanel jPanel = new JPanel(new GridBagLayout()); //Painel de componentes


    private JLabel nomeLabel = new JLabel("Nome");
    private JTextField mostraTempo = new JTextField();

    private JLabel emailLabel = new JLabel("E-mail");
    private JTextField mostraTempo2 = new JTextField();

    private JButton jButtonListaAdd = new JButton("Add Lista");
    private JButton jButtonStop = new JButton("Stop");
    private ImplementacaoFilaThread fila = new ImplementacaoFilaThread();

    private void configInicial() {
        //Configurações iniciais
        setTitle("Minha tela de time com thread");//titulo
        setSize(new Dimension(240, 240));//Seta o tamanho da janela
        setLocationRelativeTo(null);//Deixa a janela no meio da tela
        setResizable(false);//Não deixa alterar as dimensões da tela
    }

    public TelaTimeThread() { //Executa o que tiver dentro da abertura ou execução (CONSTRUTOR)
        configInicial();
        //------------------------------------Primeira parte concluída------------------------------------

        GridBagConstraints gridBagConstraints = new GridBagConstraints();//Controlador de posicionamento de componentes
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.insets = new Insets(5, 10, 5, 5);
        gridBagConstraints.anchor = GridBagConstraints.WEST;

        nomeLabel.setPreferredSize(new Dimension(200, 25));
        jPanel.add(nomeLabel, gridBagConstraints);

        mostraTempo.setPreferredSize(new Dimension(200, 25));
        gridBagConstraints.gridy++;//Torna o y 1 para não ficar em cima do label
        jPanel.add(mostraTempo, gridBagConstraints );

        emailLabel.setPreferredSize(new Dimension(200, 25));
        gridBagConstraints.gridy++;
        jPanel.add(emailLabel, gridBagConstraints);

        mostraTempo2.setPreferredSize(new Dimension(200, 25));
        gridBagConstraints.gridy++;
        jPanel.add(mostraTempo2, gridBagConstraints );

        gridBagConstraints.gridwidth = 1;

        jButtonStop.setPreferredSize(new Dimension(92, 25));
        gridBagConstraints.gridy++;
        jPanel.add(jButtonStop, gridBagConstraints);

        jButtonListaAdd.setPreferredSize(new Dimension(92, 25));
        gridBagConstraints.gridx++;
        jPanel.add(jButtonListaAdd, gridBagConstraints);

        jButtonListaAdd.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {//Executa click no botão
                if (fila == null) {
                    fila = new ImplementacaoFilaThread();
                    fila.start();
                }
                for (int i = 0; i <= 2; i++) { //simulando 300 envios em massa
                    ObjetoFilaThread objetoFilaThread = new ObjetoFilaThread();
                    objetoFilaThread.setNome(mostraTempo.getText());
                    objetoFilaThread.setEmail(mostraTempo2.getText() + "-" + i);

                    fila.add(objetoFilaThread);
                }
            }
        });

        jButtonStop.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {//Executa click no botão
                fila.stop();
                fila = null;
            }
        });


        fila.start();
        add(jPanel, BorderLayout.WEST);
        setVisible(true); //Torna a tela visível para o usuário(SEMPRE SERÁ O ÚLTIMO COMANDO EM JAVA SWING)
    }
}
