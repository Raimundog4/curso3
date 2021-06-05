package funcoes;

import mercado.interfaces.PermitirAcesso;

public class FuncaoAutenticar {
	
	private PermitirAcesso permitirAcesso;

	public boolean funcaoAutenticar () {
		return permitirAcesso.autenticar();
	}
	
	public FuncaoAutenticar(PermitirAcesso acesso) {
		this.permitirAcesso = acesso;
	}
}
