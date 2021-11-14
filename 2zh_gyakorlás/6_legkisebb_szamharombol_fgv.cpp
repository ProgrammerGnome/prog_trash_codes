/*
Készítsen programot, amely függvény segítségével meghatározza három szám közül a
legkisebbet. Az adatokat a main kéri be, azokat paraméterként átadja a függvénynek. A
függvény meghatározza a legkisebb értéket, majd ezzel tér vissza. Az eredményt a main
írja ki.
*/

#include <stdio.h>
#include <iostream>

int legkisebb(int, int, int, int);

int main(){
	setlocale(LC_ALL, "hun");
	int a, b, c, min, abc;
	printf("Kérem az első számot: "); scanf("%d",&a);
	printf("Kérem a második számot: "); scanf("%d",&b);
	printf("Kérem a harmadik számot: "); scanf("%d",&c);
	
	abc = legkisebb(a, b, c, min);
	printf("A legkisebb szám a(z): %d",abc);
}

int legkisebb(int a, int b, int c, int min){
	if(a<=b && a<=c) min=a;
	else if(b<=a && b<=c) min=b;
	else min=c;
	return min;
}
