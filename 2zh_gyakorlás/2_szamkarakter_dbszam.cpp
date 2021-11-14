/*
Készítsen programot, amely függvény segítségével beolvas egy karaktersort (stringet). A
beolvasott karakterek közül megszámolja a szám karaktereket. A karakterek számát
átadja a main-nek, amely kiírja azt.
*/

#include <stdio.h>
#include <iostream>

int legkisebb(int, char);

int main(){
	setlocale(LC_ALL, "hun");
	int n, c, szamkarakter;
    printf("Adjon meg karaktereket, majd üssön entert!\n");
	
	szamkarakter = legkisebb(n, c);
	printf("Ön ennyi szám karaktert gépelt be az előbb: %d",szamkarakter);
}

int legkisebb(int n, char c){
    do
    {
        c = getchar();
       if(c>= char('0') && c<= char('9' )) n=n+1;
       else n=n+0;
    } while (c!=0x0A);
    return n;
}
