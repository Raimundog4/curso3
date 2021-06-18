package curso.teste;

import javax.swing.JOptionPane;

import curso3.executavel.Fruta;
import superclasse.Mercado;

public class Calculo2 extends Thread {

	public void mercado() {
		Mercado mercado = new Mercado();
		int escolha = JOptionPane.showConfirmDialog(null, "Você comprou fruta?");

		if (escolha == 0) {
			String quantidade = JOptionPane.showInputDialog("Quantas variedades de frutas?");
			for (int pos = 1; pos <= (Integer.valueOf(quantidade)); pos++) {
				String nomeFruta = JOptionPane.showInputDialog("Qual a fruta? ");
				String corFruta = JOptionPane.showInputDialog("Qual a cor? ");
				String validadeFruta = JOptionPane.showInputDialog("Qual a validade? ");
				String quantidadeFruta = JOptionPane.showInputDialog("Qual a quantidade? ");
				String compras = JOptionPane.showInputDialog("Quantas compras? ");
				String vendas = JOptionPane.showInputDialog("Quantas vendas? ");
				int saldo;

				Fruta fruta = new Fruta();
				fruta.setNome(nomeFruta);
				fruta.setCor(corFruta);
				fruta.setValidade(validadeFruta);
				fruta.setQuantidade(Integer.valueOf(quantidadeFruta));
				fruta.setCompras(Integer.valueOf(compras));
				fruta.setVendas(Integer.valueOf(vendas));
				saldo = (fruta.getQuantidade() + fruta.getCompras()) - fruta.getVendas();

				mercado.getFrutas().add(fruta);

				System.out.println("A fruta é: " + fruta.getNome());
				System.out.println("A cor da fruta é: " + fruta.getCor());
				System.out.println("A validade da fruta é até: " + fruta.getValidade());
				System.out.println("O estoque inicial é: " + fruta.getQuantidade() + " " + fruta.getNome());
				System.out.println("Foram compradas: " + fruta.getCompras() + " " + fruta.getNome());
				System.out.println("Foram vendidas: " + fruta.getVendas() + " " + fruta.getNome());
				if (saldo <= 1) {
					System.out.println("Restou: " + saldo + " " + fruta.getNome());
					System.out.println("============================================================");
				} else {
					System.out.println("Restaram: " + saldo + " " + fruta.getNome());
					System.out.println("============================================================");

				}
			}
		}
	}
}