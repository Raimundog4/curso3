package excecoes;

public class ExcecaoProcessarFruta extends Exception {//Classe filha

	public ExcecaoProcessarFruta(String erro) {//Cria o construtor dela e recebe uma String e depois passa para a classe pai
		super("Erro no processamento da fruta do mercado! "+erro);//Implementa o construtor da classe pai
	}

}
