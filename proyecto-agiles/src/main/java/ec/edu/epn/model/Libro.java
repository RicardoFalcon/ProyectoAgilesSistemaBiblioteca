package ec.edu.epn.model;

public class Libro {
	private int codigo;
	private String name;
	private String categoria;

	public Libro(int codigo, String name, String categoria) {
		
		this.codigo = codigo;
		this.name = name;
		this.categoria = categoria;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setAge(int codigo) {
		this.codigo = codigo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "" + this.codigo + ".- " + this.name + " Categoria: " + this.categoria;
	}


}
