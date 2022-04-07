/*
Írjon programot, amely beolvassa e program forrásállományát (.java fájl), 
meghatározza soronként a szám karakterek számát, amit egy bináris állományban elment. 
A fájl tartalmát írja ki a képernyőre. 
*/

package gyakorlás2prog2zhra;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import static java.lang.System.err;
import static java.lang.System.out;

public class Binárisfájl_alapfeladat {
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        try {
            File file = new File("Gyakorlás2prog2zhra.java"); //creates a new file instance  
            FileReader fr = new FileReader(file); //reads the file  
            BufferedReader br = new BufferedReader(fr); //creates a buffering character input stream  
            StringBuffer sb = new StringBuffer(); //constructs a string buffer with no characters  
            String line;
            //
            FileOutputStream out = new FileOutputStream("Teszt.bin");
            while ((line = br.readLine()) != null) {
                sb.append(line); //appends line to string buffer  
                sb.append("\n"); //line feed
                    int numbers_count = 0;
                    for(int i=0; i<line.length(); i++)
                    {
                        if(Character.isDigit(line.charAt(i)))
                        {
                            numbers_count++;  
                        }
                    }
                    out.write(numbers_count);
                    //System.out.print(numbers_count);        
            }
            out.close();
            fr.close(); //closes the stream and release the resources  
            /*
            System.out.println("Contents of File: ");
            System.out.println(sb.toString()); //returns a string that textually represents the object  
            */
        } catch (IOException e) {
            e.printStackTrace();
        }
        //A bináris fájl képernyőre írása.
        try {
            FileReader in = new FileReader("Teszt.bin");
            int c;
            System.out.println("Enek a programnak a soronkénti szám karaktereinek száma "
                    + "bináris fájla mentve, és abból visszaolvasva.");
            while ((c = in .read()) != -1) {
                out.print(c);
            }
            out.println(); in .close();
        } catch (IOException error) {
            err.println("Olvasási hiba - " + error.getMessage());
        }
    }
}