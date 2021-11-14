/*
Készítsen programot, amely függvény segítségével meghatározza, hogy a megadott
oldalhosszakból szerkeszthető-e háromszög (bármely két oldal összege nagyobb a
harmadiknál). Az oldalak hosszát a main kéri be, azokat paraméterként átadja a
függvénynek. A függvény meghatározza a szerkeszthetőséget és ennek megfelelően egy
logikai értékkel tér vissza. Az eredményt a main írja ki.
*/

#include <stdio.h>
#include <string>
 
int szamolo_fgv(int, int, int, int);

int main(){
	int a, b, c, v, abc;
    printf("a:\n"); scanf("%d",&a);
    printf("b:\n"); scanf("%d",&b);
    printf("c:\n"); scanf("%d",&c);  
    
    abc = szamolo_fgv(a, b, c, v);
    printf("A háromszög szerkeszthetőségének logikai értéke: %d",abc);
}

int szamolo_fgv(int a, int b, int c, int v){
    int i = 0;
    int n = 1;
    if(a+b >= c && a+c >= b && b+c >= a) v=i;
    else; v=n;
    return v;
}
