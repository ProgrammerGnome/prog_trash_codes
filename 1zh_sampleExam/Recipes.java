
import java.util.ArrayList;
import java.util.Scanner;

/*
Implementálja a Recipes osztályt, ami ételek receptjeit kezeli (name, description). 
Az osztálynak rendelkeznie kell egy add (új recept hozzáadása), egy delete (adott elem törlése)
és egy getItems (String formátumban visszaadja az aktuálisan tárolt receptek adatait) metódussal.
*/

public class Recipes {
    
    public static void add(ArrayList<String> name, ArrayList<String> description) {
        //
        Scanner sc = new Scanner(System.in);
        int var = sc.nextInt();
        for(int i=0; i<var; i++){
        
        while (true) {
            System.out.println("Kérem adja meg a recept nevét: ");
            name.add(sc.next());
            System.out.println("Kérem adja meg a recepthez tartozó rövid leírást: ");
            description.add(sc.next());
            break;
        }}
        //
    }
    public static void delete(ArrayList<String> name, ArrayList<String> description){
        //
        try{
        Scanner sc = new Scanner(System.in);
        String var = sc.next();
        int pos = name.indexOf(var);
        name.remove(var);
        description.remove(pos);
        }
        catch (Exception e) {
            System.out.print("Ön nem adott törlésre érvényes elemet.\n");
        }
    }
    
    public static void getItems(ArrayList<String> name, ArrayList<String> description){
        for (int i = 0 ; i < description.size(); i++) {
            System.out.printf("%s\t%s\n", name.get(i), description.get(i));
        }
    }
}