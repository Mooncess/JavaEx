package lambda_expressions;

public class LambdaExpressions {
    public static void main(String[] args) {
        Operationable operationAdd = (x, y) -> x + y;
        System.out.println(operationAdd.calculate(5, 10));
    }
}

interface Operationable {
    int calculate(int x, int y);
}