/*
Készítsen programot, amely metódus segítségével magyar városneveket, valamint a lakosok számát (tetszőleges végjelig)
beolvas a billentyűzetről, és egy szöveges állományba elmenti azokat. (A metódus paramétere a fájlobjektum.) 
Egy másik metódus segítségével egyesével beolvassa az előző állományból a neveket és a lélekszámot, 
azokat kiírja a képernyőre, közben meghatározza a legnagyobb lélekszámú várost. 
A metódus paramétere a fájlobjektum, a visszaadott érték a legnépesebb város neve, amit a main ír ki. 
*/

package MintaDolgozatok;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import static java.lang.System.out;
import java.util.Scanner;
import java.util.StringTokenizer;
public class elso_mintafeladat {
    public static void main(String[] args) throws IOException {
        PrintStream ki = new PrintStream("Adatok.txt");
        kiir(ki);
        Scanner be = new Scanner(new File("Adatok.txt"));
        out.println("A legnépesebb város: " + nagy(be));
    }
    private static void kiir(PrintStream f) {
        Scanner sc = new Scanner(System.in, "ISO8859_2");
        String város;
        int lakó;
        out.print("Kérem a város nevét: ");
        város = sc.nextLine();
        while (város.length() != 0) {
            out.printf("Kérem %s lakosainak számát: ", város);
            lakó = sc.nextInt();
            f.println(város + " - " + lakó);
            sc.nextLine();
            out.print("Kérem a város nevét: ");
            város = sc.nextLine();
        }
        f.close();
    }
    private static String nagy(Scanner f) {
        int szám, legnagyobb = -1;
        String város, sor;
        String Lváros = "";
        StringTokenizer token;
        while (f.hasNext()) {
            sor = f.nextLine();
            token = new StringTokenizer(sor, " - ");
            város = token.nextToken();
            szám = Integer.valueOf(token.nextToken());
            if (szám > legnagyobb) {
                legnagyobb = szám;
                Lváros = város;
            }
        }
        f.close();
        return Lváros;
    }
}