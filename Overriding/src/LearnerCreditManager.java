public class LearnerCreditManager extends BaseCreditManager{
 public final double calculate(double price) {
     return price * 1.10;
 }
    //Overriding bas üzerine yeni bir kod yazdık
    // bir class ın herhangi bir methodu default olarak overridable'dır.
    //overridable ı ancak final keyword ü ile engelleyebiliriz. final değişmez

}
