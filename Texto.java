
import java.io.*;
import java.util.*;

import javax.swing.JOptionPane;
public class Texto {

	public static void main(String[] args) {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		String texto;
		
		try{
			FileWriter arq = new FileWriter("C:\\Users\\DAn Dan\\Documents\\CERTIFICADO\\ingles.txt");
			PrintWriter grava = new PrintWriter(arq);
				
				texto = JOptionPane.showInputDialog(null, "Mensagem");
				grava.print(texto);
				java.awt.Desktop.getDesktop().open( new File( "ingles.txt" ) );
			
		arq.close();
		grava.close();
		}catch(Exception e){
			System.out.println("Erro");
			}
	}

}
