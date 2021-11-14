/*
KC)szC-tsen programot, amely fC<ggvC)ny segC-tsC)gC)vel meghatC!rozza hC!rom szC!m
sorrendjC)t. Az adatokat a main kC)ri be, azokat paramC)terkC)nt C!tadja a fC<ggvC)nynek. A
fC<ggvC)ny a paramC)tereket C)rtC)keit C:gy mC3dosC-tja, hogy azok nagysC!grendben legyenek.
Az eredmC)nyt a main C-rja ki.
*/

#include <iostream>
using namespace std;

void toAsc (int *a, int *b, int *c);


int
main ()
{
  int a, b, c;
  scanf("%d",&a);
  scanf("%d",&b);
  scanf("%d",&c);
  int *A = &a, *B = &b, *C = &c;
  toAsc (A, B, C);
  printf ("%d %d %d", a, b, c);
  return 0;
}

void toAsc (int *a, int *b, int *c)
{
  if (*a > *b)
    {
      int t = *a;
      *a = *b;
      *b = t;
    }
  if (*a > *c)
    {
      int t = *a;
      *a = *c;
      *c = t;
    }
  if (*b > *c)
    {
      int t = *b;
      *b = *c;
      *c = t;
    }
}
