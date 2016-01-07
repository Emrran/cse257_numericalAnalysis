// the testing function here is :
// f(x) = sin(x) - 1/x
// using [1, 1.5]
// We'll be using 10 iterations here


package bisectionMethodIteration;

public class BisectionIterativeBracket {
	
	private double negativeBracket;
	private double positiveBracket;
	private double approxRoot;
	private double absError;
	private static final int count = 10;
	
	// constructor
	
	public BisectionIterativeBracket() {
		negativeBracket = 1;
		positiveBracket = 1.5;
		approxRoot = (negativeBracket + positiveBracket) / 2.0;
		absError = 0;
	}
	
	
	// getters and setters
	
	public double getNegativeBracket() {
		return negativeBracket;
	}
	
	public void setNegativeBracket(double negativeBracket) {
		this.negativeBracket = negativeBracket;
	}
	public double getPositiveBracket() {
		return positiveBracket;
	}
	public void setPositiveBracket(double positiveBracket) {
		this.positiveBracket = positiveBracket;
	}
	public double getApproxRoot() {
		return approxRoot;
	}
	public void setApproxRoot(double approxRoot) {
		this.approxRoot = approxRoot;
	}
	public double getAbsError() {
		return absError;
	}
	public void setAbsError(double absError) {
		this.absError = absError;
	}
	
	// working methods
	
	private double getFx(double x) {
		double retVal = 0;
		
		retVal = Math.sin(x) - (1.0 / x);
		
		return retVal;
	}
	
	
	public void doWork() {
		for(int i = 0; i < count; i++) {
			double fx = getFx(approxRoot);
			
			System.out.println(String.format("For Iteration #%-2d  Negative = %-20f  Positive = %-20f  ApproxRoot = %-20f  f(x) = %-30f", (i + 1), negativeBracket, 
					positiveBracket, approxRoot, fx));
			
			if(fx < 0.0) negativeBracket = approxRoot;
			else if(fx > 0.0) positiveBracket = approxRoot;
			else if(fx == 0.0) {
				// that's a root!
				System.out.println("Root found @ Iteration #" + i + " ::: root = " + fx);
				break;
			}
			
			approxRoot = (negativeBracket + positiveBracket) / 2.0;
		}
	}

}
