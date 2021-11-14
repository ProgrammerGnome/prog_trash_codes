#include <stdio.h>
#include <iostream>
#define MAX 5
#define MAXi 5
int main(){
	
	//statikus tömbfeltöltés és tömbelemkiiratás
	
	int tomb[MAX];
	int i,j;
	
	for (i=0;i<MAX;i++){printf("Kérem a %d. számot ", i+1);scanf("%d",&tomb[i]);}
	for (i=0; i<MAX; i++) printf("%d\n",tomb[i]);
	
	//minimum -és maximumkeresés
	
	int min, max;
	min = max = tomb[0];
	for (i=1; i<MAX; i++){
		if(tomb[i] > max)max = tomb[i];
		if(tomb[i] < min)min = tomb[i];		
	}
	printf("Minimum = %d\nMaximum = %d\n", min,max);
	
	//buborékrendezés
	
	int csere;
	for(j=0; j<MAX-1; j++)
			 for(i=0; i<MAX-1-j; i++)
			 		  if(tomb[i] > tomb[i+1]){
			 		  	csere = tomb[i];
			 		  	tomb[i] = tomb[i+1];
			 		  	tomb[i+1] = csere;
		 		  }
    for(i=0; i<MAX; i++) printf("%d\n",tomb[i]);
}
