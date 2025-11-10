int m = 25, n = 77;
char c = '*';
int *itemp;

//m = &n;            // ERROR: assigning int* (address) to int variable m

// itemp = m;         // ERROR: assigning int value to int* pointer (type mismatch)

//*itemp = c;        // ERROR: itemp is uninitialized; dereferencing causes undefined behavior

//*itemp = &c;       // ERROR: assigning char* (address of c) to an int (type mismatch)
