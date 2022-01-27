import java.io.*;


public class IOReader {

	public static void main(String[] args) throws IOException{
		BufferedReader br = null;
		StringBuilder sb = new StringBuilder();
		BufferedWriter bw = null;
		try {
			br = new BufferedReader(new FileReader(new File("/home/ctp/Desktop/fileReader.txt")));
			String contentLine = br.readLine();
			while(contentLine != null) {
				System.out.println(contentLine);
				sb.append("\n"+contentLine.replaceAll("[^a-zA-Z0-9]",""));
				contentLine = br.readLine();
			}
			
			bw = new BufferedWriter(new FileWriter("/home/ctp/Desktop/fileReader.txt"));
			bw.write(sb.toString());
		}
		catch(IOException ex) {
			ex.printStackTrace();
		}
		finally {
			br.close();
			bw.close();
		}

	}

}
