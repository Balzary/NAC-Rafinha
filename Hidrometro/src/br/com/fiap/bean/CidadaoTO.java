package br.com.fiap.bean;

public class CidadaoTO {
	
	private int codigo;
	
	private String nome;

	private String endereco;
	
	private String cpf;
	
	private int codigoHidrometro;
	
	public CidadaoTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CidadaoTO(int codigo, String nome, String endereco, String cpf, int codigoHidrometro) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.endereco = endereco;
		this.cpf = cpf;
		this.codigoHidrometro = codigoHidrometro;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public int getCodigoHidrometro() {
		return codigoHidrometro;
	}

	public void setCodigoHidrometro(int codigoHidrometro) {
		this.codigoHidrometro = codigoHidrometro;
	}
}
	
	
