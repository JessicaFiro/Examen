
package examen;

import java.util.Scanner;

public class MusicaPrincipal {
 
public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    MusicaPadre titulo = new MusicaHija();
    MusicaPadre artista = new MusicaHija();
    MusicaPadre genero = new MusicaHija();
    MusicaPadre album = new MusicaHija();
    MusicaPadre año = new MusicaHija();
    MusicaPadre disquera = new MusicaHija();
    MusicaPadre compositor = new MusicaHija();
    
    String resultado;
    
     System.out.print("Quieres organizar la informacion de la musica que te gusta (si-no):  ");
        resultado = s.next();

        while (resultado.equals("si")) {
            
        titulo.Titulo();
        artista.Artista();
        genero.Genero();
        album.Album();
        año.Año();
        disquera.Disquera();
        compositor.Compositor();
        
        System.out.print("\n--------------------------------------------------");
        System.out.println("\n"+"Informacion de la Musica que escuchas");
        
        System.out.print("\n"); 
        System.out.print("--------------------------------------------------\n");
        titulo.Titulo2();
        artista.Artista2();
        genero.Genero2();
        album.Album2();
        año.Año2();
        disquera.Disquera2();
        compositor.Compositor2();
        System.out.print("\n--------------------------------------------------");
        System.out.print("\n");
        
        System.out.print("\n\nQuieres organizar la informacion de la musica que te gusta otra vez (si-no): ");
            resultado = s.next();
   
            }
}
}
