package ec.edu.epn.model;
import static org.junit.Assert.*;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
public class LibroTestUpdate {
	private static ILibroDAO libro;
	@BeforeClass
	public static void breforeLibroClass() {
		libro = new LibroImpList();
	}
	@Test
	public void testUpdateLibro() {
		libro.addLibro(new Libro(1, "SEXUALIDAD 1","HUMANIDAD"));
		//assertEquals(libro.updateLibro(new Libro(1,"HISTORIA" , "CIENCIAS SOCIALES"), 1), 1);
	}
	@Test
	public void testReadUpdateLibro() {
		libro.updateLibro(new Libro(1,"HISTORIA" , "CIENCIAS SOCIALES"), 1);
		assertEquals(1, libro.findAllLibro().size());
	}
	@AfterClass
	public static void afterLibroClass() {
		libro = null;
	}
}