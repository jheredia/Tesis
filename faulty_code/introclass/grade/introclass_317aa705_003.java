package introclass.grade;

public class introclass_317aa705_003 {

	public introclass_317aa705_003() {
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
		if (score == 0) { //mutGenLimit 1
            return 5;
        } else if (score >= a) { //mutGenLimit 1
            grade = 1;
        } else if ((score < a) && (score >= b)) { //mutGenLimit 1
            grade = 2;
        } else if ((score < b) && (score >= c)) { //mutGenLimit 1
            grade = 3;
        } else if ((score < c) && (score >= d)) { //mutGenLimit 1
            grade = 4;
        } else if ((score < d) && (score > 0)) { //mutGenLimit 1
            grade = 5;
        }
        if (score != 0) { //mutGenLimit 1
            return grade;
        }
        return 0; //mutGenLimit 1
	}

}
