/*
Készítsen programot, amely függvény segítségével meghatározza három szám átlagát.
Az adatokat a main kéri be, azokat paraméterként átadja a függvénynek. A függvény
meghatározza az átlagot, majd ezzel tér vissza. Az eredményt a main írja ki.
*/

#include <stdio.h>
#include <iostream>

int legkisebb(int, int, int, int);

int main(){
	setlocale(LC_ALL, "hun");
	int a, b, c, atlag, abc;
	printf("Kérem az első számot: "); scanf("%d",&a);
	printf("Kérem a második számot: "); scanf("%d",&b);
	printf("Kérem a harmadik számot: "); scanf("%d",&c);
	
	abc = legkisebb(a, b, c, atlag);
	printf("A három szám átlaga: %d",abc);
}

int legkisebb(int a, int b, int c, int atlag){
	return ((a+b+c)/3);
}
