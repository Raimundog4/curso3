package curso.teste;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import curso3.executavel.Fruta;
import superclasse.Mercado;

public class Tela2 extends JDialog {

	Calculo2 calculo2 = new Calculo2();

	JPanel jPanel = new JPanel(new GridBagLayout());

	JLabel qtdFrutas = new JLabel("Quantas frutas?");
	JTextField txtFruta = new JTextField();

	JLabel nomeFruta = new JLabel("Qual o nome da fruta?");
	JTextField txtNome = new JTextField();

	JLabel corFruta = new JLabel("Qual a cor da fruta?");
	JTextField txtCor = new JTextField();

	JLabel validadeFruta = new JLabel("Qual a validade da fruta?");
	JTextField txtValidade = new JTextField();

	JLabel quantidadeFruta = new JLabel("Quantas tem?");
	JTextField txtQuantidade = new JTextField();

	JLabel compraFruta = new JLabel("Quantas comprou?");
	JTextField txtCompra = new JTextField();

	JLabel vendaFruta = new JLabel("Quantas vendeu?");
	JTextField txtVenda = new JTextField();

	JButton adcFruta = new JButton("Adicionar");

	private Runnable frut = new Runnable() {

		@Override
		public void run() {

			Mercado mercado = new Mercado();
			int qtd = Integer.valueOf(txtFruta.getText());
			for (int i = 0; i < qtd; i++) {

				int saldo;
				Fruta fruta = new Fruta();
				fruta.setNome(txtNome.getText());
				fruta.setCor(txtCor.getText());
				fruta.setValidade(txtValidade.getText());
				fruta.setQuantidade(Integer.valueOf(txtQuantidade.getText()));
				fruta.setCompras(Integer.valueOf(txtCompra.getText()));
				fruta.setVendas(Integer.valueOf(txtVenda.getText()));
				saldo = (fruta.getQuantidade() + fruta.getCompras()) - fruta.getVendas();

				mercado.getFrutas().add(fruta);
			}

		}
	};

	private Thread fruts;

	public Tela2() {
		setTitle("Sistema de Mercado");
		setSize(900, 900);
		setLocationRelativeTo(null);
		setResizable(false);

		GridBagConstraints bagConstraints = new GridBagConstraints();
		bagConstraints.gridx = 0;
		bagConstraints.gridy = 0;
		bagConstraints.insets = new Insets(0, 10, 5, 5);
		bagConstraints.anchor = GridBagConstraints.WEST;

		qtdFrutas.setPreferredSize(new Dimension(100, 100));
		jPanel.add(qtdFrutas, bagConstraints);

		txtFruta.setPreferredSize(new Dimension(240, 40));
		bagConstraints.gridx++;
		jPanel.add(txtFruta, bagConstraints);

		nomeFruta.setPreferredSize(new Dimension(150, 100));
		bagConstraints.gridx++;
		jPanel.add(nomeFruta, bagConstraints);

		txtNome.setPreferredSize(new Dimension(240, 40));
		bagConstraints.gridx++;
		jPanel.add(txtNome, bagConstraints);

		corFruta.setPreferredSize(new Dimension(150, 100));
		bagConstraints.gridy++;
		bagConstraints.gridx = 0;
		jPanel.add(corFruta, bagConstraints);

		txtCor.setPreferredSize(new Dimension(240, 40));
		bagConstraints.gridx++;
		jPanel.add(txtCor, bagConstraints);

		validadeFruta.setPreferredSize(new Dimension(150, 100));
		bagConstraints.gridx++;
		jPanel.add(validadeFruta, bagConstraints);

		txtValidade.setPreferredSize(new Dimension(240, 40));
		bagConstraints.gridx++;
		jPanel.add(txtValidade, bagConstraints);

		quantidadeFruta.setPreferredSize(new Dimension(150, 100));
		bagConstraints.gridy++;
		bagConstraints.gridx = 0;
		jPanel.add(quantidadeFruta, bagConstraints);

		txtQuantidade.setPreferredSize(new Dimension(240, 40));
		bagConstraints.gridx++;
		jPanel.add(txtQuantidade, bagConstraints);

		compraFruta.setPreferredSize(new Dimension(150, 100));
		bagConstraints.gridx++;
		jPanel.add(compraFruta, bagConstraints);

		txtCompra.setPreferredSize(new Dimension(240, 40));
		bagConstraints.gridx++;
		jPanel.add(txtCompra, bagConstraints);

		vendaFruta.setPreferredSize(new Dimension(150, 100));
		bagConstraints.gridy++;
		bagConstraints.gridx = 0;
		jPanel.add(vendaFruta, bagConstraints);

		txtVenda.setPreferredSize(new Dimension(240, 40));
		bagConstraints.gridx++;
		jPanel.add(txtVenda, bagConstraints);

		adcFruta.setPreferredSize(new Dimension(240, 40));
		bagConstraints.gridy++;
		bagConstraints.fill = GridBagConstraints.BOTH;
		bagConstraints.anchor = GridBagConstraints.CENTER;
		bagConstraints.weightx = 5;
		jPanel.add(adcFruta, bagConstraints);

		adcFruta.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				fruts = new Thread(frut);
				fruts.start();

			}
		});

//		txtNome.setPreferredSize(new Dimension(240, 40));
//		bagConstraints.gridx++;
//		jPanel.add(txtNome, bagConstraints);

		add(jPanel, BorderLayout.WEST);
		setVisible(true);

	}

}
