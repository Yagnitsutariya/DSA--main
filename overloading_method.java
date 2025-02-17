package Basic;

public class overloading_method {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.sum(2,4));
        System.out.println(calc.sum((float)12.3,(float)24.4));   
    }
}

class  Calculator{
    int sum(int a ,int b ){
        return a+b;
    }
    float sum(float a , float b){
        return a+b;
    }

}
