package ec.edu.epn.model;

import java.util.ArrayList;
import java.util.List;

public class LibroImpList implements ILibroDAO{
	private List<Libro> libro;

	public LibroImpList() {
		this.libro = new ArrayList<Libro>();
	}

	
	public boolean addLibro(Libro l) {
		return this.libro.add(l);
	}

	
	public boolean deleteLibro(int codigo) {
		List<Libro> data = findAllLibro();
		int index = 0;
		for (Libro libro : data) {
			index = data.indexOf(libro);
			if (libro.getCodigo() == codigo) {
				data.remove(index);
				return true;
			}
		}
		return false;
	}

	
	public boolean updateLibro(Libro l, int codigo) {
		List<Libro> data = findAllLibro();
		int index = 0;
		for (Libro libro : data) {
			index = data.indexOf(libro);
			if (libro.getCodigo() == codigo) {
				data.set(index, l);
				return true;
			}
		}
		return false;
	}

	
	public List<Libro> findAllLibro() {
		return this.libro;
	}

	
	public Libro findLibroByCodigo(int codigo) {
		List<Libro> data = findAllLibro();
		Libro result = null;
		for (Libro libro : data) {
			if (libro.getCodigo() == codigo) {
				result = libro;
			}
		}
		return result;
	}
	

}
