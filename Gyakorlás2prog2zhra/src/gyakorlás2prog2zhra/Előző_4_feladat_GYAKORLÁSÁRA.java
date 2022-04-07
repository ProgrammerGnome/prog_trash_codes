/*
Írjon  programot,  amelyben  a  main  metódus  beolvas  billentyűzetről  valós  számokat (tetszőleges végjelig), 
és azokat egy bináris fájlban tárolja. Majd egy metódus segítségével visszaolvassa a fájl tartalmát és kiszámítja 
a tárolt értékek átlagát. A metódus paramétere a fájlobjektum, a visszaadott érték az átlag, amit a main ír ki. 
*/
package gyakorlás2prog2zhra;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Előző_4_feladat_GYAKORLÁSÁRA {
    public static void main(String[] args) throws IOException {
        //
        Scanner bill = new Scanner(System.in);
        int szam;
        FileOutputStream bki = new FileOutputStream("Binarisfajl.bin");
        try (DataOutputStream ki = new DataOutputStream(bki)) {
            do {
                System.out.print("Kérek egy számot: ");
                try {
                    szam = bill.nextInt();
                    //System.out.println(szam); ellenőrzés gyanánt
                    ki.writeInt(szam);
                } catch (InputMismatchException error) {
                    break;
                }
            } while (szam != 0);
        }
        System.out.print("Az átlag: " + szamolo(bki) + "\n");
    }
    
    /*
    Visszaolvassa a fájl tartalmát és kiszámítja a tárolt értékek átlagát. 
    A metódus paramétere a fájlobjektum, a visszaadott érték az átlag.
    */
    public static float szamolo(FileOutputStream bki) throws IOException{
        FileReader in = new FileReader("Binarisfajl.bin"); 
        float c; float n = 0; float summ = 0;
        while ((c = in .read()) != -1) {
            if(c != 0){
            //System.out.print(c + " ");
            summ += c;
            n = n += 1;
            }
        }
        //System.out.print(c/n);
        //
        float atlag = summ/n;
        return atlag;
    }
}