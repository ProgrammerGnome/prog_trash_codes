/*
Készítsen programot, amely függvény segítségével meghatározza egy szövegsor hosszát.
A függvény paramétere a szöveg, visszaadott érték a hossz. A karakterek számát a main,
írja ki. A feladat megoldásához mutatókat használjon!
*/

#include<stdio.h>
 
int hossz_fgv(char*);
 
int main() {
   char str[100];
   int hossz_kiir;
   printf("\nAdja meg a szövegsort : ");
   gets(str);
   hossz_kiir = hossz_fgv(str);
   printf("A megadott szövegsor hossza : %d", hossz_kiir);
   return 0;
}
 
int hossz_fgv(char*p) /* p=&str[0] */
{
   int count = 0;
   while (*p != '\0') {
      count++;
      p++;
   }
   return count;
}
