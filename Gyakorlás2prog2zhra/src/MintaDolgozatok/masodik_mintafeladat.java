/*
Készítsen programot, amely metódus segítségével billentyűzetről bekéri a diákok nevét és testmagasságát 
(lebegőpontos szám!) egy tetszőleges végjelig, és egy szöveges állományba elmenti azokat. 
(A metódus paramétere a fájlobjektum.) Egy másik metódus segítségével egyesével beolvassa az előző állományból 
a neveket és a magasságokat, azokat kiírja a képernyőre, közben meghatározza az átlagmagasságot. 
A metódus paramétere a fájlobjektum, a visszaadott érték az átlag, amit a main ír ki. 
*/

package MintaDolgozatok;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;
import java.util.StringTokenizer;
public class masodik_mintafeladat {
    public static void main(String[] args) throws IOException {
        PrintWriter ki = new PrintWriter("adatok.txt");
        beolvas(ki);
        BufferedReader be = new BufferedReader(new FileReader("adatok.txt"));
        out.printf("Az átlag= %5.2f\n", kiir(be));
    }
    private static void beolvas(PrintWriter ki) {
        Locale locale = new Locale.Builder().setLanguage("en").setRegion("GB").build();
        NumberFormat nf = NumberFormat.getNumberInstance(locale);
        Scanner bill = new Scanner(System.in, "UTF-8");
        String név, magasság;
        out.print("A diák neve: ");
        név = bill.nextLine();
        while (név.length() != 0) {
            System.out.print("A diák magassága: ");
            magasság = nf.format(Float.valueOf(bill.nextLine()));
            ki.printf("%s;%s\n", név, magasság);
            out.print("A diák neve: ");
            név = bill.nextLine();
        }
        ki.close();
    }
    private static float kiir(BufferedReader be) throws IOException {
        String sor;
        String név;
        float magas, átlag = 0;
        int db = 0;
        StringTokenizer token;
        while ((sor = be.readLine()) != null) {
            token = new StringTokenizer(sor, ";");
            név = token.nextToken();
            magas = Float.valueOf(token.nextToken());
            átlag += magas;
            db++;
        }
        be.close();
        return átlag / db;
    }
}