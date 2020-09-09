package x39ReadingFiles;
import java.io.*;
import java.util.*;
public class readingFiles {
    static Scanner x;
    public static void main(String[] args) {
        try{
            x = new Scanner(new File("avaMax.txt"));
        }catch(Exception e){
            System.out.println("Help, I need somebody");
        }
        while(x.hasNextLine()){
            System.out.println(x.nextLine());
        }
        x.close();
    }
}
