/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import java.lang.Runnable;
/**
 *
 * @author a.yusupova
 */
public class T5 implements Runnable{
    
    protected String name;
    T5(String name)
    {
        this.name = name;
    }
    
    public int threadNum = 1;
    public void run(){
        
        for(threadNum = 1; threadNum<100; )
        {
            threadNum = print10(10,threadNum,name);
            System.out.println("");
        }
        
        System.out.println(name + " exited");

    }
    
    public static synchronized int print10(int count, int val, String name){
        System.out.print(name + ": {");
        for(int i = 1; i <= count; ++i){
            System.out.print(val + " ");
            val++;
        }
        System.out.print("} ");
        return val;
    }
}