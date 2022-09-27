package examen;

import java.util.Scanner;

public abstract class  MusicaPadre {
protected String titulo, artista, genero,album, año, resultado, disquera, compositor; 

Scanner entrada = new Scanner(System.in);
        
        
  public MusicaPadre () {  
    
    }
    
 public void Titulo(){
 System.out.print("\nIngresa el titulo de la cancion: ");  
  titulo= entrada.next();}
 
  
 public void Artista (){
 System.out.print("\nIngresa el artista de la cancion: ");  
  artista= entrada.next();
 }
 
 
public void Genero (){
 System.out.print("\nIngresa el genero de la cancion: ");  
  genero= entrada.next();
 }

public void Album (){
 System.out.print("\nIngresa el album de la cancion: ");  
  album= entrada.next();
 }

public void Año(){
 System.out.print("\nIngresa el año de lanzamiento de la cancion: ");  
  año= entrada.next();
 }

public void Disquera(){
 System.out.print("\nIngresa la disquera quien publico la cancion: ");  
  disquera= entrada.next();
 }

public void Compositor(){
 System.out.print("\nIngresa el compositor de la cancion: ");  
  compositor= entrada.next();
 }
  
public abstract void Titulo2 ();
public abstract void Artista2 ();
public abstract void Genero2 ();
public abstract void Album2 ();
public abstract void Año2 ();
public abstract void Disquera2 ();
public abstract void Compositor2 ();


} 


    


