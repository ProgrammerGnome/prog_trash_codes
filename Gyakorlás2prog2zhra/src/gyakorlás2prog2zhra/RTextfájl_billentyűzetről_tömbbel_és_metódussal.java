/*
Készítsen programot, amely a main metódusban, egymás után bekéri több téglatest három méretét 
(tetszőleges végjelig). Metódus segítségével számítsa ki a téglatestek térfogatát 
(a metódus paraméterei a három méret, a visszaadott érték a térfogat). A téglatestek méreteit 
és  a  térfogatát  a  main  kiírja  egy  random  állományba. 
A fájlból minden harmadik sort olvasson ki és írja azt a képernyőre. 
 */

package gyakorlás2prog2zhra;

import java.io.IOException;
import java.io.RandomAccessFile;
import static java.lang.System.out;
import java.util.ArrayList;
import java.util.Scanner;

public class RTextfájl_billentyűzetről_tömbbel_és_metódussal{    
    public static void main(String[] args) throws IOException {
            ArrayList<int[]> teglatestek = new ArrayList<>();
            Scanner s = new Scanner(System.in);

            while (true){
                System.out.println("szel:");
                int szel = s.nextInt();
                System.out.println("hossz:");
                int hossz = s.nextInt();
                System.out.println("mag:");
                int mag = s.nextInt();
                if (mag == 0 || hossz == 0 || szel == 0) {break;}
                teglatestek.add(new int[]{szel, hossz, mag});
            }
            s.close();
            //
            
            //RandomAccessFile raf = new RandomAccessFile("random.bin", "rw");
            RandomAccessFile file = new RandomAccessFile("Teszt.txt", "rw");
            file.setLength(0);
            Integer szám;
            for (int i = 0; i < teglatestek.size(); i++) {
                //raf.write(kiszamol(teglatestek.get(i)[0], teglatestek.get(i)[1], teglatestek.get(i)[2]));
                file.writeInt(kiszamol(teglatestek.get(i)[0], teglatestek.get(i)[1], teglatestek.get(i)[2]));
                //
                /*
                System.out.printf("%d. téglatest térfogata: %d m^2", i+1, kiszamol(teglatestek.get(i)[0], teglatestek.get(i)[1], teglatestek.get(i)[2]));
                System.out.println();
                */
                //
            }
            //Ez a soronkénti binárisból olvasás
            /*
            file.seek(0); 
            while(file.getFilePointer()!=file.length()){ 
                System.out.println(file.readInt());
            } 
            */
            out.println("-----");
            long step = 3 * Float.BYTES;
            long poz = Float.BYTES;
            while (poz < file.length()) {
                file.seek(poz);
                szám = file.readInt();
                poz += step;
                out.println(szám);
            }
            //
            file.close();
        }
        public static int kiszamol(int a, int b, int c){
            return a*b*c;
        }
}
