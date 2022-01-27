import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class IOWriter {

	public static void main(String[] args) {
		FileWriter fw = null;
		BufferedWriter bw = null;

		try {
			File fe = new File("/home/ctp/Desktop/fileReader.txt");
			if (!fe.exists()) {
				fe.createNewFile();
			}
			fw = new FileWriter(fe, true);
			bw = new BufferedWriter(fw);
			bw.write("\ndascbjhkljclkjcl;ksdjc;lkjdclkjdclk");
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			try {
				if (bw != null && fw != null)
					bw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
