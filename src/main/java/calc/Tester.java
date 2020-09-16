package calc;

public class Tester {
    public static void main(String[] args) {
        Calc calc1 = new Calc(5,5,"+");
        System.out.println(calc1.operate());
        Calc calc2 = new Calc(5,5,"-");
        System.out.println(calc2.operate());
        Calc calc3 = new Calc(5,5,"x");
        System.out.println(calc3.operate());
        Calc calc4 = new Calc(5,5,"/");
        System.out.println(calc4.operate());
    }
}
