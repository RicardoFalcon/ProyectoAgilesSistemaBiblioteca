package ec.edu.epn.model;
import static org.junit.Assert.*;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
public class LibroTestDelete {
	private static ILibroDAO libro;
	@BeforeClass
	public static void breforeLibroClass() {
		libro = new LibroImpList();
	}

	@Test
	public void testDeleteLibro() {
		libro.addLibro(new Libro(1, "HISTORIA","CIENCIAS NATURALES"));
		libro.addLibro(new Libro(2, "DIBUJO","ARTES"));
	}

	@Test
	public void testReadDeleteLibro() {
		libro.deleteLibro(1);
		assertEquals(1, libro.findAllLibro().size());
	}

	@AfterClass
	public static void afterLibroClass() {
		libro = null;
	}

}