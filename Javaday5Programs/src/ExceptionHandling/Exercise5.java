package ExceptionHandling;
class chocolate2 {
    void candy() {
        System.out.println("Tastes chocolately");
    }
}
class Choc2 extends chocolate2 {
   @Override
    void candy() {
        System.out.println("Tastes Sweet!");
    }
}
public class Exercise5 {
    public static void main(String[] args) {
        chocolate2 chocolate = new chocolate2();
        chocolate.candy(); 
        chocolate2 c2 = new chocolate2();
        c2.candy(); 
        chocolate2 choc2Obj = new Choc2();
        choc2Obj.candy(); 
    }
}

