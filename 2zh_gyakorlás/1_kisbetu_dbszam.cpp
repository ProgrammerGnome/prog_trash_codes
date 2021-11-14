/*
Készítsen programot, amely függvény segítségével beolvas egy karaktersort (stringet). A
beolvasott karakterek közül megszámolja a kisbetű karaktereket. A karakterek számát
átadja a main-nek, amely kiírja azt.
*/

#include <stdio.h>
#include <iostream>

int legkisebb(int, char);

int main(){
	setlocale(LC_ALL, "hun");
	int n, c, kisbetu;
    printf("Adjon meg karaktereket, majd üssön entert!\n");
	
	kisbetu = legkisebb(n, c);
	printf("Ön ennyi kisbetűt gépelt be az előbb: %d",kisbetu);
}

int legkisebb(int n, char c){
    do
    {
        c = getchar();
       if(c>= char('a') && c<= char('z' )) n=n+1;
       else n=n+0;
    } while (c!=0x0A);
    return n;
}
