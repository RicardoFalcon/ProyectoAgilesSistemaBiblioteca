package ec.edu.epn.view;
import ec.edu.epn.model.*;
import ec.edu.epn.model.Libro;
import ec.edu.epn.model.LibroImpList;
public class LibroView {
    public static void main(String[] args) {
        ILibroDAO l = new LibroImpList();

        System.out.println("\n----------Sistema de Actualización de Préstamo De Biblioteca-----------");
        l.addLibro(new Libro(1, "MATEMÁTICA 1", "MATEMÁTICA"));
        l.addLibro(new Libro(2, "PROGRAMACIÓN EN JAVA", "INFORMÁTICA"));
        l.addLibro(new Libro(3, "CIENCIAS DE LA VIDA", "CIENCIAS NATURALES"));
        l.addLibro(new Libro(4, "SEXUALIDAD", "HUMANIDADES"));
        l.addLibro(new Libro(5, "DIBUJO", "ARTES"));
        l.addLibro(new Libro(6, "COMPUTACIÓN", "INFORMÁTICA"));
        l.addLibro(new Libro(7, "CONTABILIDAD", "ADMINISTRACIÓN"));
        l.addLibro(new Libro(8, "FÍSICA I", "CIENCIAS"));
        l.addLibro(new Libro(9, "BIOLOGÍA PARA NIÑOS", "CIENCIAS NATURALES"));
        l.addLibro(new Libro(10, "50 SOMBRAS DE GRAY", "NOVELA")); 

        //Mostrar lista de libros completa despues de ser añadidos a la lista
        System.out.println("\nLISTA DE LOS LIBROS DE LA BIBLIOTECA");
        for (Libro libro : l.findAllLibro()) {
            System.out.println(libro);
        }        
        //Cosnultamos y actualizamos la biblioteca
        System.out.println("\nEl libro a consultar es: "+ l.findLibroByCodigo(3).getName());
        System.out.println("Categoría: " + l.findLibroByCodigo(3).getCategoria());

        l.updateLibro(new Libro(3, "HISTORIA DE LOS ANIMALES", "CIENICAS NATURALES"), 3);    
        System.out.println("\nEl libro es prestado y reemplazado por: "+l.findLibroByCodigo(3).getName());
        System.out.println("Categoría: "+ l.findLibroByCodigo(3).getCategoria());

        //Mostramos la lista actualizada despues del ultimo UPDATE
        System.out.println("\nLISTAR LIBROS DE BIBLIOTECA ACTUALIZADO");
        for (Libro libro : l.findAllLibro()) {
            System.out.println(libro);
        }
        
        //Eliminamos el libro por una reservación
        System.out.println("\n-----MENSAJE-----");
        System.out.println("\nEl libro: "+ l.findLibroByCodigo(3).getName() + "\nDe la categoría: " + l.findLibroByCodigo(3).getCategoria() + "\nCon el código: " + l.findLibroByCodigo(3).getCodigo() + "\nHa sido reservado!");
        System.out.println("\nMOSTRAR LISTA ACTUALIZADA");
        l.deleteLibro(3);

        for (Libro libro : l.findAllLibro()) {
            System.out.println(libro);
        }
 

    }
}

    