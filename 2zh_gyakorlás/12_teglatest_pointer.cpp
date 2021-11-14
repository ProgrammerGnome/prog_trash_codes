/*
Készítsen programot, amely függvény segítségével kiszámítja egy téglatest felszínét és
térfogatát. A téglatest adatait a main kéri be, azokat paraméterként átadja a
függvénynek. A függvény kiszámítja a felszínt és a térfogatot, majd paraméterek
segítségével visszaadja azokat. Az eredményt a main írja ki.
*/

#include <stdio.h>
#include <iostream>
void tegla(int, int, int, int*, int*);
int main(){
	setlocale(LC_ALL, "hun");
	int a, b, c, felszin, terfogat;
	printf("Kérem a téglatest egyik oldalának hosszát: "); scanf("%d", &a);
	printf("Kérem a téglatest egyik oldalának hosszát: "); scanf("%d", &b);
	printf("Kérem a téglatest egyik oldalának hosszát: "); scanf("%d", &c);
	tegla(a, b, c, &felszin, &terfogat);
	printf("A téglalap kerülete=%d, a területe= %d\n", felszin, terfogat);
}
void tegla(int a, int b, int c, int *A, int *V){
	 *A = 2*(a*b+a*c+b*c);
	 *V = a*b*c;
}
