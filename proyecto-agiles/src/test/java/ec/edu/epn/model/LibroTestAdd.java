package ec.edu.epn.model;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class LibroTestAdd {
	private static ILibroDAO libro;
	@BeforeClass
	public static void breforeLibroClass() {
		libro = new LibroImpList();
	}

	@Test
	public void testAddLibro() {
		assertTrue(libro.addLibro(new Libro(1, "SEXUALIDAD 1","HUMANIDAD")));
	}
	@Test
	public void testReadAllLibro() {
		
		libro.addLibro(new Libro(1, "SEXUALIDAD 1","HUMANIDAD"));
		libro.addLibro(new Libro(2, "DIBUJO TÉCNICO","ARTES"));
		assertEquals(3, libro.findAllLibro().size());		
	}
	@Test
	public void testUpdateLibro() {
		
		//libro.addLibro(new Libro(1, "SEXUALIDAD 1","HUMANIDAD"));
		libro.updateLibro(new Libro(1, "BIOLOGÍA", "HUMANIDAD"), 1);			
		assertEquals(0, libro.findAllLibro().size());		
	}
	
	
	
	@AfterClass
	public static void afterLibroClass() {
		libro = null;
	}
	

}
