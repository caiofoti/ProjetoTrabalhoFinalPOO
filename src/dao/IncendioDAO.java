package dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import modelo.Cortina;
import modelo.Incendio;
import modelo.Login;

public class IncendioDAO {
	private File arq;
	private FileWriter fw;
	private BufferedWriter bw;

	public IncendioDAO()
	{
		arq=new File("pedido.txt");
	}

	public boolean enviaIncendio(Incendio inc) {

		
			try {
				fw = new FileWriter(arq, true);
				bw = new BufferedWriter(fw);

				bw.write(inc.toString());
				bw.newLine();
				bw.flush();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return false;
			}
			finally {
				try {
					fw.close();
					bw.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
			
			return true;

	}
	
	
	public boolean enviaCortina(Cortina cor) {

		
		try {
			fw = new FileWriter(arq, true);
			bw = new BufferedWriter(fw);

			bw.write(cor.toString());
			bw.newLine();
			bw.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		finally {
			try {
				fw.close();
				bw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		return true;

}
	
	public boolean consultaLogin(Login l)
	{
		boolean resp=false;
		
		try {
			FileReader fr= new FileReader(arq);
			BufferedReader br= new BufferedReader(fr);
			
			String linha=null;
			String[] campos= new String[1];
			
			while((linha=br.readLine())!=null)
			{
				campos=linha.split("#");
				
				if(campos[0].equals(l.getUsuario()) && campos[1].equals(l.getSenha()));
				{
					resp=true;
					break;
				}
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return resp;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return resp;
		}
		
		return resp;
		
	}
}
