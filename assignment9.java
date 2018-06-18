package assignment9;
import java.io.*;

public class assignment9 {

	public static void main(String[] args) throws IOException {
		FileWriter f=new FileWriter("C:\\Users\\DELL\\eclipse-workspace\\assignment9\\src\\assignment9\\def.txt",true);
		BufferedWriter bf=new BufferedWriter(f);
		
		FileReader R=new FileReader("C:\\Users\\DELL\\eclipse-workspace\\assignment9\\src\\assignment9\\abc.txt");
		BufferedReader br=new BufferedReader(R);
		int ch;
		
		while((ch=br.read())!=-1)
		{
			bf.write(ch);
			
		}
		
		bf.close();
		br.close();
		FileReader Re=new FileReader("C:\\Users\\DELL\\eclipse-workspace\\assignment9\\src\\assignment9\\def.txt");
		BufferedReader bt=new BufferedReader(Re);
		int c;
		while((ch=bt.read())!=-1)
		{
			System.out.print((char)ch);
			
		}
		bt.close();
		
}

}
