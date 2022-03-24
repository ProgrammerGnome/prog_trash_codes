import java.util.ArrayList;

/*
Származtasson egy UpdateRecipes osztályt a Recipes osztályból, 
melynek update metódusával lehessen módosítani a Recipes objektumban tárolt elemeket.
*/

public class UpdateRecipes extends Recipes{
    public static void main(String[] args) {

        ArrayList<String> name = new ArrayList<>();
        ArrayList<String> description = new ArrayList<>();
        
        System.out.print("Kérem adja meg, hogy hány darab receptet szeretne most megadni:\n");
        add(name,description);
        
        System.out.print("Kérem adja meg a törlendő receptek pontos nevét:"
                + " (Ha nem akar élni az opcióval írjon - jelet) \n");
        delete(name, description);
        
        System.out.print("Az aktuálisan tárolt receptek adatai:\n");
        getItems(name,description);
    }
}