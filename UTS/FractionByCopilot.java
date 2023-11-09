package UTS;

public class FractionByCopilot {
  private int numerator, denominator;
    
    public FractionByCopilot(int n, int d) throws ArithmeticException{
      if (d == 0){
            throw new ArithmeticException("Cannot divide by zero");
        } else {
          this.numerator = n;
          this.denominator = d;
        }
    }
    //getters and setters
    public void setNumerator(int num){this.numerator=num;}
    public void setDenominator(int denom){this.denominator=denom;}
    public int getNumerator(){return this.numerator;}
    public int getDenominator(){return this.denominator;}
  
    //addition
    public FractionByCopilot addFraction(FractionByCopilot frac2){
      int sumNum=(frac2.getNumerator()*this.denominator)+(this.numerator*frac2.getDenominator());
      int sumDeno=this.denominator * frac2.getDenominator();
      return new FractionByCopilot(sumNum, sumDeno);
    }
    //subtraction
    public FractionByCopilot subtractFraction(FractionByCopilot frac2){
      int diffNum=(frac2.getNumerator()*this.denominator)-(this.numerator*frac2.getDenominator());
      int diffDeno=this.denominator * frac2.getDenominator();
      return new FractionByCopilot(diffNum, diffDeno);
    }
    //multiplication
    public FractionByCopilot multiplyFraction(FractionByCopilot frac2){
      int prodNum=this.numerator * frac2.getNumerator();
      int prodDeno=this.denominator * frac2.getDenominator();
      return new FractionByCopilot(prodNum, prodDeno);
    }
    //division
    public FractionByCopilot divideFraction(FractionByCopilot frac2){
      int quotientNum=this.numerator * frac2.getDenominator();
      int quotientDeno=this.denominator * frac2.getNumerator();
      return new FractionByCopilot(quotientNum, quotientDeno);
    }
}
