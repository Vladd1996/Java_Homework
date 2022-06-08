package org.example.Homework4;

import java.util.ArrayList;
import java.util.HashMap;
//123
public class Phone_Book
{
    public HashMap<String,ArrayList<Integer>> list=new HashMap<>();
    public void add(String s,Integer number)
    {
        ArrayList<Integer> ph=list.getOrDefault(s,new ArrayList<>());
        if(!ph.contains(number)) {
            ph.add(number);
            list.put(s, ph);
        }
    }
    public void get(String s)
    {
        System.out.println(list.get(s));
    }
}
