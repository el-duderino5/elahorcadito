package elAhorcadito;
import  java.io.*;
import java.util.Random;

public class ahorcado {
	
	Random rnd = new Random();
	String palabraArchivo;
	RandomAccessFile archPalabras;
	public ahorcado(String ruta) 
	{
		try
		{
			archPalabras = new RandomAccessFile(ruta, "rw");
			
		}catch(IOException ex)
        {
          System.err.println("Error -- " + ex.toString());
         }
		archPalabras.seek(random);
	}
	
	boolean probar(String letra)
	{
		if(palabraArchivo.contains(letra))
			return true;
		else
			return false;
	}

}
