package superclasse;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import curso3.executavel.Fruta;
import curso3.executavel.Vegetal;

public class Mercado {
	
	protected String nome;
	protected String cor;
	protected String validade;
	protected int quantidade;
	protected int compras;
	protected int vendas;

	private List<Fruta> frutas = new ArrayList<Fruta>();

	public List<Fruta> getFrutas() {
		return frutas;
	}

	public void setFrutas(List<Fruta> frutas) {
		this.frutas = frutas;
	}

	public int getEstoqueInicial() {
		int somaFrutas = 0;

		for (Fruta fruta : frutas) {
			somaFrutas += fruta.getQuantidade();

		}

		return somaFrutas;
	}

	public int getEstoqueFinal() {
		int subtracao = 0;

		for (Fruta fruta : frutas) {
			subtracao += (fruta.getQuantidade() + fruta.getCompras()) - fruta.getVendas();
		}

		return subtracao;

	}

	public void remocaoFruta() {
		String frutaRemover = JOptionPane.showInputDialog("Qual fruta você deseja remover? ");
		for (int i = 0; i < frutas.size(); i++) {
			Fruta f = frutas.get(i);
			if (frutaRemover.equalsIgnoreCase(f.getNome())) {

				getFrutas().remove(f);

			}
		}
	}

	public boolean trocarFruta(List<Fruta> frutas) {

		String trocar = JOptionPane.showInputDialog("Qual fruta você quer substituir?");

		int index = 0;
		boolean found = false;
		for (Fruta fruta : frutas) {
			if (fruta.getNome().equalsIgnoreCase(trocar)) {
				String novaFruta = JOptionPane.showInputDialog("Qual a nova fruta?");
				String novaCor = JOptionPane.showInputDialog("Qual a cor?");
				String novaValidade = JOptionPane.showInputDialog("Qual a validade?");
				String novaQuantidade = JOptionPane.showInputDialog("Qual a quantidade?");
				String novaCompra = JOptionPane.showInputDialog("Quantas comprou?");
				String novaVenda = JOptionPane.showInputDialog("Quantas vendeu?");
				found = true;
				fruta.setNome(novaFruta);
				fruta.setCor(novaCor);
				fruta.setValidade(novaValidade);
				fruta.setQuantidade(Integer.valueOf(novaQuantidade));
				fruta.setCompras(Integer.valueOf(novaCompra));
				fruta.setVendas(Integer.valueOf(novaVenda));
				//getFrutas().add(fruta);
				frutas.set(index, fruta);

				System.out.println(fruta);
			}
			index++;
		}

		return found;
	}

	private List<Vegetal> vegetais = new ArrayList<Vegetal>();

	public List<Vegetal> getVegetais() {
		return vegetais;
	}

	public void setVegetais(List<Vegetal> vegetais) {
		this.vegetais = vegetais;
	}

	public int getEstoqueInicialVegetais() {
		int somaVegetais = 0;

		for (Vegetal vegetal : vegetais) {
			somaVegetais += vegetal.getQuantidade();

		}
		return somaVegetais;
	}

	public int getEstoqueFinalVegetais() {
		int subtracao = 0;

		for (Vegetal vegetal : vegetais) {
			subtracao += (vegetal.getQuantidade() + vegetal.getCompras()) - vegetal.getVendas();
		}
		return subtracao;

	}

	public void remocaoVegetal() {
		String vegetalRemover = JOptionPane.showInputDialog("Qual vegetal você deseja remover? ");
		for (int i = 0; i < vegetais.size(); i++) {
			Vegetal v = vegetais.get(i);
			if (vegetalRemover.equalsIgnoreCase(v.getNome())) {

				getVegetais().remove(v);

			}
		}
	}

	public boolean trocarVegetal(List<Vegetal> vegetais) {

		String trocar = JOptionPane.showInputDialog("Qual fruta você quer substituir?");

		int index = 0;
		boolean found = false;
		for (Vegetal vegetal : vegetais) {
			if (vegetal.getNome().equalsIgnoreCase(trocar)) {
				String novoVegetal = JOptionPane.showInputDialog("Qual o novo vegetal?");
				String novaCor = JOptionPane.showInputDialog("Qual a cor?");
				String novaValidade = JOptionPane.showInputDialog("Qual a validade?");
				String novaQuantidade = JOptionPane.showInputDialog("Qual a quantidade?");
				String novaCompra = JOptionPane.showInputDialog("Quantos comprou?");
				String novaVenda = JOptionPane.showInputDialog("Quantos vendeu?");
				found = true;
				vegetal.setNome(novoVegetal);
				;
				vegetal.setCor(novaCor);
				vegetal.setValidade(novaValidade);
				vegetal.setQuantidade(Integer.valueOf(novaQuantidade));
				vegetal.setCompras(Integer.valueOf(novaCompra));
				vegetal.setVendas(Integer.valueOf(novaVenda));
				vegetais.set(index, vegetal);

				System.out.println(vegetal);
			}
			index++;
		}

		return found;
	}

	public int getEstoqueInicialMercado() {
		int estoqueInicial = getEstoqueInicial() + getEstoqueInicialVegetais();
		return estoqueInicial;
	}

	public int getEstoqueFinalMercado() {
		int estoqueFinal = getEstoqueFinal() + getEstoqueFinalVegetais();
		return estoqueFinal;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getValidade() {
		return validade;
	}

	public void setValidade(String validade) {
		this.validade = validade;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public int getCompras() {
		return compras;
	}

	public void setCompras(int compras) {
		this.compras = compras;
	}

	public int getVendas() {
		return vendas;
	}

	public void setVendas(int vendas) {
		this.vendas = vendas;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((frutas == null) ? 0 : frutas.hashCode());
		result = prime * result + ((vegetais == null) ? 0 : vegetais.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Mercado other = (Mercado) obj;
		if (frutas == null) {
			if (other.frutas != null)
				return false;
		} else if (!frutas.equals(other.frutas))
			return false;
		if (vegetais == null) {
			if (other.vegetais != null)
				return false;
		} else if (!vegetais.equals(other.vegetais))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Mercado [frutas=" + frutas + ", vegetais=" + vegetais + "]";
	}

}
