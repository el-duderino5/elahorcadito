package elAhorcadito;
import  java.io.*;

public class ahorcado {

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
	}
	
	boolean probar(String letra)
	{
		if(palabraArchivo.contains(letra))
			return true;
		else
			return false;
	}

}
