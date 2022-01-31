package tugas_s;

import java.util.Scanner;

public class Tugas_S {
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        int masuk, baris, kolom;
        
        do
        {
            System.out.print("Masukkan Jumlah Perulangan (Min 3) = ");
            masuk = input.nextInt();
        }
        while(masuk < 3);
        
        System.out.println("");
        System.out.println("+----------Tugas S--------+");
        System.out.println("+-------------------------+");
        System.out.println("");
        
        for (baris = 0; baris < masuk; baris++) 
        {
            for (kolom = 0; kolom < masuk; kolom++) 
            {
                if( ( (kolom == baris )||(baris == 0)|| baris == masuk -1))
                {
                    System.out.print(" $ ");
                }
                else
                {
                    System.out.print(" . ");
                }
            }
            System.out.println(" ");
        }
        System.out.println("");
        System.out.println("+------- 025314020 -------+");
        System.out.println("+-------Program Java------+");
    }
    
}
