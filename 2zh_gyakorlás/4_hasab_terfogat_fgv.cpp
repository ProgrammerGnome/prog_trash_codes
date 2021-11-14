/*
Készítsen programot, amely függvény segítségével kiszámítja egy hasáb térfogatát. A
hasáb adatait a main kéri be, azokat paraméterként átadja a függvénynek. A függvény
kiszámítja a térfogatot, majd visszaadja azt. Az eredményt a main írja ki.
*/

#include <stdio.h>
 
int szamolo_fgv(int, int);

int main(){
	int t_a, m;
    printf("Adjon meg karaktereket, majd üssön entert!\n"); scanf("%d",&t_a);
    printf("Adjon meg karaktereket, majd üssön entert!\n"); scanf("%d",&m);
    printf("A megadott hasáb térfogata: %d",t_a*m);
}

int szamolo_fgv(int t_a, int m){
    return t_a*m;
}
