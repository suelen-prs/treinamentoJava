import java.io.*;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Servidor {

	public static void main(String[] args) {
		ObjectInputStream in;
		ServerSocket servidor;
		
		try {
			servidor = new ServerSocket(9696);
			
			
			while(true) {
				System.out.println("Aguardando cliente...");
				
				Socket socket = servidor.accept();
				in = new ObjectInputStream(socket.getInputStream());
				
				String fileName = in.readUTF();
				long size = in.readLong();
				FileOutputStream fos = new FileOutputStream(fileName);
				byte[] buf = new byte[4096];
				while(true) {
					int len = in.read(buf);
					if (len == -1) break;
					fos.write(buf, 0, len);
				}
				
				fos.flush();
				fos.close();
				//in.reset();
				System.out.println("Arquivo Recebido!");
				
			}
			
		}catch (Exception ex) {
			ex.printStackTrace();
		}

	}

}
