import java.io.*;
public class Array_Insertion
{
    public static void main(String Args[])
    {
        int AI[]=new int[3];
        System.out.println("array insertion");
        for(int i=0;i<3;i++)
        {
            AI[i]=i+2;
            System.out.println("AI[" + i + "] = "+AI[i]);
        }
    }
}