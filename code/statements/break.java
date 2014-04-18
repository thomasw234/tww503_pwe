for (i in Sequence{1..3}) { 
	if (i = 1) 
		continue;
	
	for (j in Sequence{1..4}) {
		if (j = 2) 
			break;
			
		if (j = 3) 
			breakAll;
		 		
		(i + "," + j).println();		
	}
}