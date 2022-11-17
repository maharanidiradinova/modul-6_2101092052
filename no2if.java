package Maharani2101092052_modul6;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class no2if
{
    public static void main(String[] args)
    {
        BufferedReader dataIn=new BufferedReader(new InputStreamReader(System.in));
        String angka="";
        String huruf="";
        System.out.print("Input Angka : ");
        try{angka=dataIn.readLine();
        }catch(IOException e)
        {System.out.println("Error!");
        }if(1==Integer.parseInt(angka))
        {System.out.println("Satu");
        }else if(2==Integer.parseInt(angka))
        {System.out.println("Dua");
        }else if(3==Integer.parseInt(angka))
        {System.out.println("Tiga");
        }else if(4==Integer.parseInt(angka))
        {System.out.println("Empat");
        }else if(5==Integer.parseInt(angka))
        {System.out.println("Lima");
        }else if(6==Integer.parseInt(angka))
        {System.out.println("Enam");
        }else if(7==Integer.parseInt(angka))
        {System.out.println("Tujuh");
        }else if(8==Integer.parseInt(angka))
        {System.out.println("Delapan");
        }else if(9==Integer.parseInt(angka))
        {System.out.println("Sembilan");
        }else if(10==Integer.parseInt(angka))
        {System.out.println("Sepuluh");
        }
        else{System.out.println("Invalid number");}
    }
}
