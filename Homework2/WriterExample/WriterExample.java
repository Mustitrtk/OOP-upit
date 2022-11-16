package Homework2.WriterExample;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class WriterExample{
    public static void main(String[] args) {    
        String line="";
        int i =1;
        
        BufferedReader reader;
        BufferedWriter writer;

        try{
            reader = new BufferedReader(new FileReader("one.txt"));
            writer = new BufferedWriter(new FileWriter("two.txt"));

            while((line=reader.readLine())!=null){
                writer.write(i+". "+line.toString()+"\n");
                i++;
            }
            writer.close(); 
        }
        catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}