package modelo.composicao;

import javax.persistence.Embeddable;

// Não tem uma tabela no banco, mas sim vai ficar dentro de uma outra tabela
@Embeddable
public class Endereco {
	private String logradouro;
	private String complemento;

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

}
