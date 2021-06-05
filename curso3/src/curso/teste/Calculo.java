package curso.teste;

import javax.swing.JOptionPane;

import curso3.executavel.Fruta;
import curso3.executavel.Vegetal;
import funcoes.FuncaoAutenticar;
import superclasse.Mercado;

public class Calculo {

	public static void main(String[] args) {
//Validação
		String login = JOptionPane.showInputDialog("Qual o login?");
		String senha = JOptionPane.showInputDialog("Qual a senha?");
		
		if (new FuncaoAutenticar(new Fruta(login, senha)).funcaoAutenticar()) {
//Instanciamento 
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
			escolha = JOptionPane.showConfirmDialog(null, "Você comprou vegetal?");
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

					System.out.println("O fruta é: " + vegetal.getNome());
					System.out.println("A cor da fruta é: " + vegetal.getCor());
					System.out.println("A validade da fruta é até: " + vegetal.getValidade());
					System.out.println("O estoque inicial é: " + vegetal.getQuantidade() + " " + vegetal.getNome());
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
//Remoção dentro da main
			int remocao = JOptionPane.showConfirmDialog(null, "Deseja remover alguma fruta?");
			if (remocao == 0) {
				int posicao = 1;
				String frutaRemover = JOptionPane
						.showInputDialog("Qual fruta você deseja remover? " + mercado.getFrutas());
				mercado.getFrutas().remove(Integer.valueOf(frutaRemover) - posicao);
				posicao++;
			}
			remocao = JOptionPane.showConfirmDialog(null, "Deseja remover algum vegetal? ");
			if (remocao == 0) {
				int posicao = 1;
				String vegetalRemover = JOptionPane
						.showInputDialog("Qual vegetal você deseja remover? " + mercado.getVegetais());
				mercado.getVegetais().remove(Integer.valueOf(vegetalRemover) - posicao);
				posicao++;
			}
			// Remoção chamando o método
			remocao = JOptionPane.showConfirmDialog(null, "Deseja remover alguma fruta?");
			if (remocao == 0) {
				mercado.remocaoFruta();
			}
			remocao = JOptionPane.showConfirmDialog(null, "Deseja remover algum vegetal?");
			if (remocao == 0) {
				mercado.remocaoVegetal();
			}
			System.out.println(mercado.getFrutas());
			System.out.println("====================================================");
			System.out.println(mercado.getVegetais());
// Impressão percorrendo a lista
			for (Fruta fruta : mercado.getFrutas()) {
				System.out.println(fruta.getNome());
			}

			for (Vegetal vegetal : mercado.getVegetais()) {
				System.out.println(vegetal.getNome());
			}
			// Troca de elemento chamando o método
			escolha = JOptionPane.showConfirmDialog(null, "Deseja trocar alguma fruta?");

			if (escolha == 0) {

				boolean retorno = mercado.trocarFruta(mercado.getFrutas());

				String opcao = retorno ? "Sucesso" : "Insucesso";
				JOptionPane.showMessageDialog(null, opcao);
			}
			escolha = JOptionPane.showConfirmDialog(null, "Deseja trocar algum vegetal?");

			if (escolha == 0) {

				boolean retorno = mercado.trocarVegetal(mercado.getVegetais());

				String opcao = retorno ? "Sucesso" : "Insucesso";
				JOptionPane.showMessageDialog(null, opcao);
			}

			System.out.println("O estoque inicial do mercado é de: " + mercado.getEstoqueInicialMercado());
			System.out.println("O estoque final do mercado é de: " + mercado.getEstoqueFinalMercado());
		} else {
			JOptionPane.showMessageDialog(null, "Você digitou os dados errados!");
		}

	}
}