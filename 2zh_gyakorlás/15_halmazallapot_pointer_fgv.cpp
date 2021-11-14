/*
Készítsen programot, amely függvény segítségével meghatározza a víz halmazállapotát.
A hőmérsékletet a main kéri be, azt paraméterként átadja a függvénynek. A függvény a
megfelelő (jég, víz, gőz) szöveg-mutatóval tér vissza, amit a main ír ki.
*/

#include <iostream>
#include <string>
#include <cstring>

using namespace std;

char *allapot_fgv(int a);

int main() {
    int a;
    scanf("%d",&a);
    char *abc = allapot_fgv(a);
    printf("%s",abc);
    free(abc);
    return 0;
}

char *allapot_fgv(int a) {
    string res;
    char * ret = (char*)malloc(17);
    if (a<=0) {res = "Jég";}
    else if(a>=0 && a<=100){res = "Víz";}
    else{res = "Gőz";}
    return strcpy(ret, res.c_str());
}
