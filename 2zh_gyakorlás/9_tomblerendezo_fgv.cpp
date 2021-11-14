/*
Készítsen programot, amely függvény segítségével lerendezi egy tömb elemeit. A tömb
értékeit a main kéri be, majd a rendezett tömböt kiírja. A függvényben mutatókat
használjon!
*/

#include <stdio.h>
#include <iostream>

// Function to sort the numbers using pointers
void sort(int n, int* ptr)
{
	int i, j, t;
	// Sort the numbers using pointers
	for (i = 0; i < n; i++) {
		for (j = i + 1; j < n; j++) {
			if (*(ptr + j) < *(ptr + i)) { //itt lehet állítani a sorrendet
				t = *(ptr + i);
				*(ptr + i) = *(ptr + j);
				*(ptr + j) = t;
			}
		}
	}

	// print the numbers
	for (i = 0; i < n; i++)
		printf("%d ",*(ptr + i));
}
// Driver code
int main()
{
    setlocale(LC_ALL, "hun");
    int h;
    printf("A tömb elemszáma: "); scanf("%d",&h);
    printf("Gépelje be a tömb elemeit egyesével: ");
    int value[h];  
    for(int i = 0; i < h; ++i) {
        scanf("%d", &value[i]);
    }
	int n = h;
	//int arr[] = { 0, 23, 14, 12, 9 };
	printf("A tömb elemei lerendezve: ");
	sort(n, value);
	return 0;
}
