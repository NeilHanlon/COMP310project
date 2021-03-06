import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;


public class Dictionary {
	
	private HashMap<String, ArrayList<String>> library = new HashMap<String, ArrayList<String>>();

	public HashMap<String, ArrayList<String>> getLibrary() {
		return library;
	}

	public void setLibrary(HashMap<String, ArrayList<String>> library) {
		this.library = library;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//filepath "resources/positivewords.txt"
		Dictionary dict = new Dictionary();
		try {
			dict.addDictionary("resources/positivewords.txt", "positive");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public Dictionary() {
		//filepath "resources/positivewords.txt"
		

	}
	
	public void addDictionary(String filePath, String dictionaryKey) throws IOException, FileNotFoundException{
		
		FileReader file = new FileReader(filePath);
		BufferedReader reader = new BufferedReader(file);
		String tmp;
		ArrayList<String> tmplist = new ArrayList<String> ();
		while(( tmp = reader.readLine())!=null ){
			tmplist.add(tmp);				
		}
		this.library.put(dictionaryKey, tmplist);
		reader.close();
	}

}
