package curso.teste;

import javax.swing.JOptionPane;

import curso3.executavel.Fruta;
import curso3.executavel.Mercado;

public class Calculo {

	public static void main(String[] args) {

		Mercado mercado = new Mercado();

		for (int pos = 1; pos <= 1; pos++) {
			String nomeFruta = JOptionPane.showInputDialog("Qual a fruta? ");
			String corFruta = JOptionPane.showInputDialog("Qual a cor? ");
			String validadeFruta = JOptionPane.showInputDialog("Qual a validade? ");
			String quantidadeFruta = JOptionPane.showInputDialog("Qual a quantidade? ");

			Fruta fruta = new Fruta();
			fruta.setNome(nomeFruta);
			fruta.setCor(corFruta);
			fruta.setValidade(validadeFruta);
			fruta.setQuantidade(Integer.valueOf(quantidadeFruta));

			mercado.getFrutas().add(fruta);
			
			System.out.println(fruta.getNome());
			System.out.println(fruta.getCor());
			System.out.println(fruta.getValidade());
			System.out.println(fruta.getQuantidade());
		}
	}
}	