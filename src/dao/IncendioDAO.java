package dao;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import modelo.Incendio;

public class IncendioDAO {
	private File arq;
	private FileWriter fw;
	private BufferedWriter bw;

	public IncendioDAO()
	{
		arq=new File("pedido_incendio.txt");
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
}
