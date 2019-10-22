
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException{
		try {
			Scanner scanner = new Scanner(new File("C:\\Users\\myke\\eclipse-workspace\\Library\\Ýnfo.csv"));
			String temp=null;
			boolean bool=true;
			
			String name = null;
			String author=null;
			String publisher=null;
			double prize=0;	
			
			while (scanner.hasNextLine()) {
				temp=scanner.nextLine();
				String[] arr=temp.split(",");
				if(bool==true)
				{
					for(int i=0;i<arr.length;i++)
					{
						System.out.println(arr[i]);
					}
					System.out.println("------------------");
				}
				else
				{
					for(int i=0;i<arr.length;i++)
					{
						switch(i)
						{
							case 0:
								name=arr[i];
								break;
							case 1:
								author=arr[i];
								break;
							case 2:
								publisher=arr[i];
								break;
							case 3:
								double d=Double.parseDouble(arr[i]);
								prize=d;
								break;
						}
					}
					Books book=new Books(name,author,publisher,prize);
					book.ShowBooks();
				}
				bool=false;
			}
			scanner.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
	}

}
