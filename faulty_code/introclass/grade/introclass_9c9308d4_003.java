package introclass.grade;

public class introclass_9c9308d4_003 {

	public introclass_9c9308d4_003() {
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
		int grade = 0; //mutGenLimit 1
		if (score >= a) { //mutGenLimit 1
            grade = 1;
        } else if (score >= b) { //mutGenLimit 1
            grade = 2;
        } else if (score >= c) { //mutGenLimit 1
            grade = 3;
        } else {
            grade = 4; //mutGenLimit 1
        }
        return grade;
	}

}
