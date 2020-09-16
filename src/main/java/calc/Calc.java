package calc;

public class Calc {
    double num1;
    double num2;
    String operator;
    public Calc(double operand1, double operand2, String operator){
        this.num1 = operand1;
        this.num2 = operand2;
        this.operator = operator;
    }
    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }
    public double operate(){
        double result = 0;
        String op = getOperator();
        switch(op) {
            case "+":
                result = getNum1() + getNum2();
                break;
            case "-":
                result = getNum1() - getNum2();
                break;
            case "/":
                result = getNum1() / getNum2();
                break;
            case "x":
                result = getNum1() + getNum2();
                break;
            default:
                System.out.println("Invalid input. Try agian");
        }
        return result;

    }


}
