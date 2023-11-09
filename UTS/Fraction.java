package UTS;

public class Fraction {
  private int numerator, denominator;

  //constructor
  public Fraction(){
    this.numerator = 1;
    this.denominator = 2;
  }

  //parameter constructor
  public Fraction(int numerator,int  denominator){
    if (denominator == 0) throw new ArithmeticException("Denominator cannot be zero");
      else{
        this.numerator = numerator;
        this.denominator = denominator;
      }
    }

  //object parameter constructor
  public Fraction(Fraction otherFraction){
    this.numerator = otherFraction.getNumerator();
    this.denominator = otherFraction.getDenominator();
  }
  
    //getter
  public int getNumerator() { 
    return this.numerator;
  }
  public int getDenominator() {
    return this.denominator;
  }

  //addition method
  public void plus(int num1,int denom1, int num2, int denom2){
    this.numerator = num1*denom2 + num2*denom1;
    this.denominator = denom1*denom2;
  }

  //multiplier method
  public void times(int num1, int denom1, int num2, int denom2){
    this.numerator = num1*num2;
    this.denominator = denom1*denom2;
  }
}
