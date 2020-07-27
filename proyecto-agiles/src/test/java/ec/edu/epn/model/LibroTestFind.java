package ec.edu.epn.model;
import static org.junit.Assert.*;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
public class LibroTestFind {

    private static ILibroDAO libro;
    @BeforeClass
    public static void breforeLibroClass() {
        libro = new LibroImpList();
    }
    
    @Test
    public void testFindLibro() {
        libro.addLibro(new Libro(1, "LENGUAJE","LITERATURA"));
        libro.addLibro(new Libro(2, "MECANICA","MECANICA"));
    }
    
    @Test
    public void testReadFindLibro() {
        libro.addLibro(new Libro(3, "GEOMETRÍA","MATEMATICA"));
        libro.findLibroByCodigo(1);
        assertEquals(1, libro.findAllLibro().size());
    }
    
    @AfterClass
    public static void afterLibroClass() {
        libro = null;
    }
}