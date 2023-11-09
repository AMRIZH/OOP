package UTS;

public class FractionDemo {
  public static void main(String[] args) {
    // Create 3 fractions
    Fraction p = new Fraction(3,5);
    Fraction q = new Fraction(p);
    Fraction r = new Fraction();

    //print value of each fraction
    System.out.println("Value of object p is = "+p.getNumerator()+"/"+p.getDenominator()+"\n");
    System.out.println("Value of object q is = "+q.getNumerator()+"/"+q.getDenominator()+"\n");
    System.out.println("Value of object r is = "+r.getNumerator()+"/"+r.getDenominator()+"\n");

    //add two fractions and store the result in a third fraction
    Fraction s = new Fraction();

    //Multiplication of 2 Fraction : p*r
    System.out.println("Mulitiplication of "
    +p.getNumerator()+"/"+p.getDenominator()+" and "+r.getNumerator()+"/"+r.getDenominator());
    //calculating p*r
    s.times(p.getNumerator(), p.getDenominator(), r.getNumerator(), r.getDenominator());
    System.out.println("F1 = "+s.getNumerator()+"/"+s.getDenominator()+"\n");

    //addition of 2 fraction : q+r
    System.out.println("addition of "
    +q.getNumerator()+"/"+q.getDenominator()+" and "+r.getNumerator()+"/"+r.getDenominator());
    //calculating q+r
    s.plus(p.getNumerator(), p.getDenominator(), r.getNumerator(), r.getDenominator());
    System.out.println("F2 = "+s.getNumerator()+"/"+s.getDenominator()+"\n");
  }
}
