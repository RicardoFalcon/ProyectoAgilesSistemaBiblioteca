package ec.edu.epn.model;
import java.util.List;

public interface ILibroDAO {
	public boolean addLibro(Libro l);

	public boolean deleteLibro(int codigo);

	public boolean updateLibro(Libro l , int codigo);

	public List<Libro> findAllLibro();

	public Libro findLibroByCodigo(int codigo);

}
