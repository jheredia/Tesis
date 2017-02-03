package introclass.median;

public class introclass_c716ee61_001 {

    public introclass_c716ee61_001() {
    }
    
    /*@
    @ requires true;
    @ ensures ((\result == \old(a)) || (\result == \old(b)) || (\result == \old(c)));
    @ ensures ((\old(a)!=\old(b) || \old(a)!=\old(c)) ==> ( ((\old(a)==\old(b)) ==> (\result == \old(a))) && ((\old(b)==\old(c)) ==> (\result ==\old(b)))));
    @ ensures ((\old(a)!=\old(b) && \old(a)!=\old(c) && \old(b)!=\old(c)) ==> (\exists int n; (n == \old(a)) || (n == \old(b)) || (n == \old(c)); \result>n));
    @ ensures ((\old(a)!=\old(b) && \old(a)!=\old(c) && \old(b)!=\old(c)) ==> (\exists int n; (n == \old(a)) || (n == \old(b)) || (n == \old(c)); \result<n));
    @ signals (RuntimeException e) false;
    @
    @*/
    public int median( int a, int b, int c ) {
    	if (a > b && a < c) { 
            return a;
        }
        if (a > c && a < b) { 
            return a;
        }
        if (b > c && b < a) { 
            return b;
        }
        if (b > a && b < c) { 
            return b;
        }
        if (c > a && c < b) { 
            return c;
        }
        if (c > b && c < a) { 
            return c;
        }
        return 0; 
    }
	
}
