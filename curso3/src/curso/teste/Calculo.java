package curso.teste;

import javax.swing.JOptionPane;

import curso3.executavel.Fruta;
import curso3.executavel.Mercado;

public class Calculo {

	public static void main(String[] args) {

		Mercado mercado = new Mercado();

		for (int pos = 1; pos <= 2; pos++) {
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

			System.out.println("O fruta é: "+fruta.getNome());
			System.out.println("A cor da fruta é: "+fruta.getCor());
			System.out.println("A validade da fruta é até: "+fruta.getValidade());
			System.out.println("O estoque inicial é: "+fruta.getQuantidade()+" "+fruta.getNome());
			System.out.println("Foram compradas: "+fruta.getCompras()+" "+fruta.getNome());
			System.out.println("Foram vendidas: "+fruta.getVendas()+" "+fruta.getNome());
			System.out.println("Restaram: "+saldo+" "+fruta.getNome());
			System.out.println("============================================================");
		}
		System.out.println("O estoque inicial do mercado é de: " + mercado.getEstoqueInicial());
		System.out.println("O estoque final do mercado é de: " +mercado.getEstoqueFinal());
	}
}