/*
Készítsen programot, amely függvény segítségével beolvas egy szövegsort, majd
meghatározza a szavak számát. A szavak számát átadja a main-nek, amely kiírja azt.
*/

#include <stdio.h>
#include <string.h>
 
int szovegszamlalo(char *s)
{
    int i,szavak=0;
	for(i=0;s[i];i++)  
    {
    	if(s[i]==32)
    	 szavak++;
 	}
 	if(i>0)
      szavak++;
	return szavak; 	
}
int main()
{
    char s[1000];  
    int szoszamlalo;
    printf("Enter  the string: ");
    gets(s);
    szoszamlalo=szovegszamlalo(s);
    printf("no of words in string = %d\n",szoszamlalo);
}
