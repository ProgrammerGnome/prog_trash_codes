//KERESÉS
 
    #include <stdio.h>
     
    main()
    {
    	int tomb[] = {8, 9, 3, 5, 4, 2, 7};
    	int n=7;
    	int ker=5;
    	int i=0;
    	while(i<n && tomb[i] != ker)
    		i++;
    	if(i<n)
    	{
    		printf("Van ilyen\n");
    		printf("A helye: %d\n", i);
    	}
    	else
    		printf("Nem található\n");
    }
    
    
//MEGSZÁMOLÁS

    #include <stdio.h>
     
    main()
    {
    	int tomb[] = {8, 9, 3, 5, 4, 2, 7};
     
    	int szamol=0;
    	int i;
    	for(i=0; i<7;i++)
    		if(tomb[i] < 5)
    			szamol++;
    	printf("5-nél kisebb számok: %d\n", szamol);
     
    }
    
