package br.com.alura.escola.dominio.aluno;

public class CPF {

	private String numero;

	public CPF(String numero) {
		if (numero == null || !numero.matches("\\d{3}\\.\\d{3}\\.\\d{3}\\-\\d{2}")) {
			throw new IllegalArgumentException("CPF inválido! ");
		}
		this.numero = numero;
	}

	public String getNumero() {
		// TODO Auto-generated method stub
		return numero;

	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

}
