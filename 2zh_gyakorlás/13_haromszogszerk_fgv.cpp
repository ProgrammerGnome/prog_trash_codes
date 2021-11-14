/*
Készítsen programot, amely függvény segítségével meghatározza, hogy a megadott
oldalhosszakból szerkeszthető-e háromszög (bármely két oldal összege nagyobb a
harmadiknál). Az oldalak hosszát a main kéri be, azokat paraméterként átadja a
függvénynek. A függvény meghatározza a szerkeszthetőséget és ennek megfelelően egy
szöveg-mutatóval (szerkeszthető, nem szerkeszthető) tér vissza. Az eredményt a main írja ki.
*/

#include <iostream>
#include <string>
#include <cstring>

using namespace std;

char *isTriangle(int a, int b, int c);

int main() {
    int a, b, c;
    scanf("%d",&a); scanf("%d",&b); scanf("%d",&c);
    char *abc = isTriangle(a,b,c);
    printf("%s",abc);
    free(abc);
    return 0;
}

char *isTriangle(int a, int b, int c) {
    string res;
    char * ret = (char*)malloc(17);
    if (a + b > c && a + c > b && b + c > a) {
        res = "Szerkeszthető";
    } else {
        res = "Nem szerkeszthető";
    }
    return strcpy(ret, res.c_str());
}
