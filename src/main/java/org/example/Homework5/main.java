package org.example.Homework5;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class main
{
    public static void main(String[] args)
    {
        AppData data =new AppData();
        int dt[][]={{123,456,789},{111,222,333}};
        String hdr[]={"value1","value2","value3"};
        data.setData(dt);
        data.setHeader(hdr);
        File first=new File("first.csv");
        {
            try {
                FileOutputStream stream1 = new FileOutputStream(first);
                for(int i=0;i<data.getHeader().length;i++)
                {
                    stream1.write((data.getHeader()[i]).getBytes(StandardCharsets.UTF_8));
                    stream1.write(";".getBytes(StandardCharsets.UTF_8));
                }
                stream1.write("\n".getBytes(StandardCharsets.UTF_8));
                Integer j;
                for(int i=0;i<data.getData()[0].length;i++)
                {
                    j=data.getData()[0][i];
                    stream1.write(j.toString().getBytes(StandardCharsets.UTF_8));
                    stream1.write(";".getBytes(StandardCharsets.UTF_8));
                }
                stream1.write("\n".getBytes(StandardCharsets.UTF_8));
                for(int i=0;i<data.getData()[1].length;i++)
                {
                    j=data.getData()[1][i];
                    stream1.write(j.toString().getBytes(StandardCharsets.UTF_8));
                    stream1.write(";".getBytes(StandardCharsets.UTF_8));
                }
                FileInputStream stream2=new FileInputStream(first);
                int count =0;
                while(count!=-1) {
                        count=stream2.read();
                        System.out.print((char) count);
                }
                } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

}
