package curso.teste;

import javax.swing.JOptionPane;

import curso3.executavel.Fruta;
import curso3.executavel.Mercado;
import curso3.executavel.Vegetal;

public class Calculo {

	public static void main(String[] args) {

		String senha = JOptionPane.showInputDialog("Qual a senha?");

		if (senha.equals("teamo")) {

			Mercado mercado = new Mercado();
			int escolha = JOptionPane.showConfirmDialog(null, "Voc� comprou fruta?");

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

					System.out.println("A fruta �: " + fruta.getNome());
					System.out.println("A cor da fruta �: " + fruta.getCor());
					System.out.println("A validade da fruta � at�: " + fruta.getValidade());
					System.out.println("O estoque inicial �: " + fruta.getQuantidade() + " " + fruta.getNome());
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
			escolha = JOptionPane.showConfirmDialog(null, "Voc� comprou vegetal?");
			if (escolha == 0) {
				String quantidade = JOptionPane.showInputDialog("Quantas variedades de vegetais?");
				for (int pos = 1; pos <= (Integer.valueOf(quantidade)); pos++) {
					String nomeVegetal = JOptionPane.showInputDialog("Qual o vegetal? ");
					String corVegetal = JOptionPane.showInputDialog("Qual a cor? ");
					String validadeVegetal = JOptionPane.showInputDialog("Qual a validade? ");
					String quantidadeVegetal = JOptionPane.showInputDialog("Qual a quantidade? ");
					String comprasVegetal = JOptionPane.showInputDialog("Quantas compras? ");
					String vendasVegetal = JOptionPane.showInputDialog("Quantas vendas? ");
					int saldoVegetal;

					Vegetal vegetal = new Vegetal();
					vegetal.setNome(nomeVegetal);
					vegetal.setCor(corVegetal);
					vegetal.setValidade(validadeVegetal);
					vegetal.setQuantidade(Integer.valueOf(quantidadeVegetal));
					vegetal.setCompras(Integer.valueOf(comprasVegetal));
					vegetal.setVendas(Integer.valueOf(vendasVegetal));
					saldoVegetal = (vegetal.getQuantidade() + vegetal.getCompras()) - vegetal.getVendas();

					mercado.getVegetais().add(vegetal);

					System.out.println("O fruta �: " + vegetal.getNome());
					System.out.println("A cor da fruta �: " + vegetal.getCor());
					System.out.println("A validade da fruta � at�: " + vegetal.getValidade());
					System.out.println("O estoque inicial �: " + vegetal.getQuantidade() + " " + vegetal.getNome());
					System.out.println("Foram compradas: " + vegetal.getCompras() + " " + vegetal.getNome());
					System.out.println("Foram vendidas: " + vegetal.getVendas() + " " + vegetal.getNome());
					if (saldoVegetal <= 1) {
						System.out.println("Restou: " + saldoVegetal + " " + vegetal.getNome());
						System.out.println("============================================================");
					} else {
						System.out.println("Restaram: " + saldoVegetal + " " + vegetal.getNome());
						System.out.println("============================================================");

					}

				}

			}
			int remocao = JOptionPane.showConfirmDialog(null, "Deseja remover alguma fruta?");
			if (remocao == 0) {
				int posicao = 1;
				String frutaRemover = JOptionPane
						.showInputDialog("Qual fruta voc� deseja remover? " + mercado.getFrutas());
				mercado.getFrutas().remove(Integer.valueOf(frutaRemover) - posicao);
				posicao++;
			}
			remocao = JOptionPane.showConfirmDialog(null, "Deseja remover algum vegetal? ");
			if (remocao == 0) {
				int posicao = 1;
				String vegetalRemover = JOptionPane
						.showInputDialog("Qual vegetal voc� deseja remover? " + mercado.getVegetais());
				mercado.getVegetais().remove(Integer.valueOf(vegetalRemover) - posicao);
				posicao++;
			}
			remocao = JOptionPane.showConfirmDialog(null, "Deseja remover alguma fruta?");
			if (remocao == 0) {
				mercado.remocaoFruta();
			}

			System.out.println("O estoque inicial do mercado � de: " + mercado.getEstoqueInicialMercado());
			System.out.println("O estoque final do mercado � de: " + mercado.getEstoqueFinalMercado());
		}
	}
}