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

			System.out.println("\n"+directory.getName()+" size\n============");
			System.out.println(size+" B");
			System.out.println(size/1000024+" MB");
			System.out.println(size/1000024/1024+ "GB");
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
