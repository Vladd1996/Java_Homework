package org.example.Homework4;
import java.util.ArrayList;
import java.util.HashMap;
//123
public class main
{
    public static void main(String[] args)
    {
        String firstbook[]=new String[12];
        firstbook[0]="test";
        firstbook[1]="test1";
        firstbook[2]="test2";
        firstbook[3]="test3";
        firstbook[4]="test4";
        firstbook[5]="test5";
        firstbook[6]="test6";
        firstbook[7]="test7";
        firstbook[8]="test3";
        firstbook[9]="test3";
        ArrayList<String> secondbook=new ArrayList<>();
        HashMap<String, Integer> Mymap = new HashMap<>();
        for(int i=0;i<10;i++)
        {
            if(Mymap.containsKey(firstbook[i]))
            {
                Mymap.put(firstbook[i],Mymap.get(firstbook[i])+1);
            }
            else
            {
                Mymap.put(firstbook[i],1 );
            }
        }
        System.out.println(Mymap);
        Phone_Book list=new Phone_Book();
        list.add("Kremko",123);
        list.add("Kremko",234);
        list.add("Kremko",123);
        list.add("Kovalsky",123);
        list.get("Kremko");
        list.get("Kovalsky");
    }
}