/*
Készítsen programot, amely függvény segítségével meghatározza az évszakok nevét. A
hónap sorszámát a main kéri be, azt paraméterként átadja a függvénynek. A függvény a
megfelelő (tavasz, nyár, ősz, tél) szöveg-mutatóval tér vissza, amit a main ír ki.
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
    if (a<=2 || a==12) {res = "Tél";}
    else if(a>=3 && a<=5){res = "Tavasz";}
    else if(a>=6 && a<=8){res = "Nyár";}
    else{res = "Ősz";}
    return strcpy(ret, res.c_str());
}
