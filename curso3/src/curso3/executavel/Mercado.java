package curso3.executavel;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Mercado {

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

	public void remocaoVegetal() {
		String vegetalRemover = JOptionPane.showInputDialog("Qual vegetal você deseja remover? ");
		for (int i = 0; i < vegetais.size(); i++) {
			Vegetal v = vegetais.get(i);
			if (vegetalRemover.equalsIgnoreCase(v.getNome())) {

				getVegetais().remove(v);

			}
		}
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

	public int getEstoqueInicialMercado() {
		int estoqueInicial = getEstoqueInicial() + getEstoqueInicialVegetais();
		return estoqueInicial;
	}

	public int getEstoqueFinalMercado() {
		int estoqueFinal = getEstoqueFinal() + getEstoqueFinalVegetais();
		return estoqueFinal;
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
