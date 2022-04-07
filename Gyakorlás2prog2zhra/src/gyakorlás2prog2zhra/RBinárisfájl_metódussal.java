/*
Írjon programot, amely metódus segítségével beolvassa e program forrásállományát (.java fájl) 
és meghatározza soronként a szám karakterek számát. A metódus visszaadott értéke a 
megszámolt karakterek száma legyen, amit a main egy random állományba ír ki. 
A fájl tartalmát írja ki a képernyőre. 
*/

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.RandomAccessFile;
import static java.lang.System.err;

public class RBinárisfájl_metódussal {

  public static int getNumbersInString(String ss) {
    return ss.replaceAll("\\D", "").length();
  }

  public static int count() throws IOException {
    File file = new File("Gyakorlás2prog2zhra.java");
    FileReader fr = new FileReader(file);
    BufferedReader br = new BufferedReader(fr);
    StringBuilder sb = new StringBuilder();
    String line;
    int totalNumbers = 0;
    while ((line = br.readLine()) != null) {
        totalNumbers += RBinárisfájl_metódussal.getNumbersInString(line);
    }
    return totalNumbers;
  }
  
  public static void main(String[] args) throws IOException {
      int outNumbers = 0;
      RandomAccessFile file = null; 
      try{
          file = new RandomAccessFile("Teszt.txt", "rw"); 
          file.writeInt(count());
          //
          file.seek(0);
          while (file.getFilePointer() != file.length()) {
              outNumbers = file.readInt();
              System.out.println(outNumbers);
          }
      }
      catch (IOException error){ err.println("Fájl hiba - " + error.getMessage());} 
      finally {   try { if (file != null) file.close(); } 
            catch (IOException error) {err.println(error.getMessage());}
      }
  }
}