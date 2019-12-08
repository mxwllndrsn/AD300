import java.util.*;
import java.io.*;

public class dirSize{
	public static void main(String[] args)
		throws FileNotFoundException{
			System.out.print("enter a directory: ");
			Scanner input = new Scanner(System.in);

			String dir = input.nextLine();
			File directory = new File(dir);
			long size = getSize(directory);
			int mb = (int)size/1000024;
			int gb = mb/1024;
			System.out.println("\n"+directory.getName()+" size\n============");
			System.out.printf("%10d B%n", size);
			System.out.printf("%10d MB%n", mb);
			System.out.printf("%10d GB%n", gb);
	}
	public static long getSize(File file){
		long size=0;
		if(file.isDirectory()){
			File[] files = file.listFiles();
			for(int i=0; i<files.length; i++){
				size += getSize(files[i]);
			}
		} else {
			size+=file.length();
		}
		return size;
	}
}
