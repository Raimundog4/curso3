package curso3;

import java.util.Date;

public class Curso3 {

	private String Nome;
	
	private String sobrenome;
	
	private Date dataNascimento;
	
	private Date dataNascimento2;

	public Date getDataNascimento2() {
		return dataNascimento2;
	}

	public void setDataNascimento2(Date dataNascimento2) {
		this.dataNascimento2 = dataNascimento2;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	
}
