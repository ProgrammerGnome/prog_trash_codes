/*
Készítsen egy kereső függvényt, amely egy szövegben megkeresi egy tetszőleges
karakter első előfordulását. A szöveget és egy karaktert a main kéri be, ezeket átadja a
függvénynek, amely megkeresi, hogy a karakter hányadik a szövegben. A karakter
sorszámát átadja a main-nek, amely kiírja azt.
*/

#include <stdio.h>
#include <iostream>

int fgv(char*, int, char);

int main(){
    setlocale(LC_ALL, "hun");
    char astring[10];
    int value, abc;
    scanf( "%s", astring );
    char k;
    scanf(" %c",&k);
    abc = fgv(astring,value,k);
    printf("%d",abc);
    
}
 
int fgv(char astring[50],int value, char k)
{
    //char astring[10];
    int i = 0;
    int one = 1;
    //int value = 0;
    //int one = 1;
    for ( i = 0; i < 50; ++i )
    {
        if ( astring[i] == k )
        {
            value = i+one;
            break;
        }
    }
    getchar();
    return value;
}
