package introclass.median;


public class introclass_30074a0e_000 {

	public introclass_30074a0e_000() {
    }
	
	/*@
    @ requires true;
    @ ensures ((\result == a) || (\result == b) || (\result == c));
    @ ensures ( (a == b) ==> ((\result == a) || (\result == b) ) );
    @ ensures ( (b == c) ==> ((\result == b) || (\result == c) ) );
    @ ensures ( (a == c) ==> ((\result == a) || (\result == c) ) );
    @ ensures ((a!=b && a!=c && b!=c) ==> (\exists int n; (n == a) || (n == b) || (n == c); \result>n));
    @ ensures ((a!=b && a!=c && b!=c) ==> (\exists int n; (n == a) || (n == b) || (n == c); \result<n));
    @ signals (RuntimeException e) false;
    @
    @*/
    public int median( int a, int b, int c ) {
    	if ((a < b && b < c) || (b < a && c < b)) { 
            return b; 
        }
        if ((b < a && a < c) || (a < b && c < a)) { 
            return a; 
        }
        if ((a < c && c < b) || (b < c && c < a)) { 
            return c; 
        }
        return 0; 
    }
	
}
