package org.example.Homework5;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class example
{
    public static void main(String[] args)  {

        try
        {
            InputStreamReader inputStreamReader=new InputStreamReader(new FileInputStream("first.csv"), StandardCharsets.UTF_8);
            int x,i;
            i=0;
            while(i!=50) {
                x=inputStreamReader.read();
                System.out.println(x+" "+(char)x);
                i++;
            }
        } catch (FileNotFoundException e)
        {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
