var col : Sequence = Sequence{"a", 1, 2, 2.5, "b"};

for (r : Real in col) {
	r.print();	
	if (hasMore){
		",".print();
	}
}