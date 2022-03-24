
import java.util.Arrays;

/*
Készítsen egy Matrix osztályt. 
Az osztályban írja meg a indexesOfNullColumns és a indexOfMaximum metódusokat. 
Mindkét metódus meghatározza egy 2-dimenziós egész mátrixban: előbbi a null oszlopainak sorszámait, 
utóbbi a legnagyobb elem pozícióját (több egyenlő elem esetén a legelsőt)!
*/
public class Matrix {
    public static void main(String[] args) {
        // create a 2d array
        int[][] two_dimensional_matrix = {
            {8, 2, 3}, 
            {4, 5, 6, 9}, 
            {7, 4}, 
            {3, 8, 0},
            {23},
            {17,6,1},
            {0, 7, 1},
        };
        //
        System.out.print("A null oszlopainak sorszámai:\n");
        indexesOfNullColumns(two_dimensional_matrix);
        System.out.print("A legnagyobb elem pozíciója:\n");
        indexOfMaximum(two_dimensional_matrix);
    }
    public static void indexesOfNullColumns(int[][] two_dimensional_matrix){
        for (int[] data: two_dimensional_matrix) {
            int counter = 0;
            for (int element: data){
                counter++;
                if(element == 0) {
                    System.out.println(counter+".oszlop");
                }
            }
        }
    }
    public static void indexOfMaximum(int[][] two_dimensional_matrix){
        //
        int max = two_dimensional_matrix[0][0];
        //
        int max_column = 0;
        int row_counter = 0; int max_row = 0;
        for (int i = 0; i < two_dimensional_matrix.length; ++i) {
            int column_counter = 0;
            row_counter++;
            if(two_dimensional_matrix[i] != null){
                for(int j = 0; j < two_dimensional_matrix[i].length; ++j) {
                    column_counter++;
                    if(two_dimensional_matrix[i][j] > max){max = two_dimensional_matrix[i][j];
                    max_column = column_counter; max_row = row_counter;}
                }
            }
        }
        //System.out.println(max);
        System.out.print("oszlop: "+max_column+", ");
        System.out.print("sor: "+max_row+"\n");
    }
}