package examen;

public class MusicaHija extends MusicaPadre {

    @Override
    public void Titulo2() {
    System.out.print("\nEl titulo de la cancion es: "+ titulo); 
    
        
    }

    @Override
    public void Artista2() {
     System.out.print("\nEl Artista es: "+ artista);   
    }

    @Override
    public void Genero2() {
    System.out.print("\nEl genero es: "+ genero);   
    }

    @Override
    public void Album2() {
    System.out.print("\nEl album al que pertenece es: "+ album);   
    }

    @Override
    public void Año2() {
    System.out.print("\nEl año en que se lanzo es: "+ año);   
    }

    @Override
    public void Disquera2() {
    System.out.print("\nLa disquera es: "+ disquera);   
    }

    @Override
    public void Compositor2() {
     System.out.print("\nEl compositor es: "+ compositor);  
    }

    
}

