package x38WritingFiles;
import java.io.*;
import java.util.*;
public class write2File {
    static private Formatter frm;
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("dugong.txt" , true);
            frm = new Formatter(fw);
        } catch (Exception e) {
            System.out.println("Aaargh");
        }
        frm.format(" %s %d \n" , "Taylor" , 22);
        frm.close();
        extension();
    }
/* Write a program to record the name and phone
number ( cov-vid style )for all the diners
at McDonalds  */



    static private Formatter dt;
    private static void extension(){
        try{
            FileWriter McLog = new FileWriter("addLog.txt", true);
            dt = new Formatter("McLog.txt");
        }catch(Exception e){
            System.out.println("Sorry, not working because of "+e);
        }
        Scanner getData = new Scanner(System.in);
        for(int x = 0;x<3;x++){
            System.out.println("What is your name?");
            String name = getData.nextLine();
            System.out.println("What is your number");
            String number = getData.nextLine();
            System.out.println("Do you want fries with that ?");
            dt.format(" %s %s \n",name,number);
        }
        dt.close();
    }
}