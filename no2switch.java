package Maharani2101092052_modul6;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class no2switch 
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
        }switch(Integer.parseInt(angka))
        {case 1:System.out.println("Satu");
        break ;
        case 2:System.out.println("Dua");
        break ;
        case 3:System.out.println("TIiga");
        break ;
        case 4:System.out.println("Empat");
        break ;
        case 5:System.out.println("Lima");
        break ;
        case 6:System.out.println("Enam");
        break ;
        case 7:System.out.println("Tujuh");
        break ;
        case 8:System.out.println("Delapan");
        break ;
        case 9:System.out.println("Sembilan");
        break ;
        case 10:System.out.println("Sepuluh");
        break ;
        default:System.out.println("Invalid number");
        }
    }
}
