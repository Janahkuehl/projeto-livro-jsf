package br.com.projetoLivroJsf.model;

public class Livro {


	private int id;
	private String titulo;
	private String editora;
	private String genero;
	private Boolean estado;
	private String descricao;
	
	public Livro() {
		
	}
	
	public Livro(int id, String titulo, String editora, String genero, Boolean estado, String descricao) {
		
		this.id = id;
		this.titulo = titulo;
		this.editora = editora;
		this.genero = genero;
		this.estado = estado;
		this.descricao = descricao;
		
		}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getEditora() {
		return editora;
	}

	public void setEditora(String editora) {
		this.editora = editora;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public Boolean getEstado() {
		return estado;
	}

	public void setEstado(Boolean estado) {
		this.estado = estado;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
		
	
	}


