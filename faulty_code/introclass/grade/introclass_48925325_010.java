package introclass.grade;

public class introclass_48925325_010 {

	public introclass_48925325_010() {
	}

    /*@
    @ requires (a > b && b > c && c > d);
    @ ensures ((\old(score) >= \old(a)) <==> (\result == 1));
    @ ensures ((\old(score) >= \old(b) && \old(score)<\old(a)) <==> (\result == 2));
    @ ensures ((\old(score) >= \old(c) && \old(score)<\old(b)) <==> (\result == 3));
    @ ensures ((\old(score) >= \old(d) && \old(score)<\old(c)) <==> (\result == 4));
    @ ensures ((\old(score) < \old(d)) <==> (\result == 5));
    @ signals (RuntimeException e) false;
    @
    @*/
	public int grade(int a, int b, int c, int d, int score) {
		if (score >= a) { //mutGenLimit 1
            return 1;
        } else if (score >= b) { //mutGenLimit 1
            return 2;
        } else if (score >= c) { //mutGenLimit 1
            return 3;
        } else if (score >= d) { //mutGenLimit 1
            return 4;
        } else {
            return 5; //mutGenLimit 1
        }
	}

}
