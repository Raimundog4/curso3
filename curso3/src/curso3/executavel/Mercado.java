package curso3.executavel;

import java.util.ArrayList;
import java.util.List;

public class Mercado {
	
	private List<Fruta> frutas = new ArrayList<Fruta>();

	public List<Fruta> getFrutas() {
		return frutas;
	}

	public void setFrutas(List<Fruta> frutas) {
		this.frutas = frutas;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((frutas == null) ? 0 : frutas.hashCode());
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
		return true;
	}

	@Override
	public String toString() {
		return "Mercado [frutas=" + frutas + "]";
	}
	
	

}
