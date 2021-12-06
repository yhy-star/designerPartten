package interpreter;

/**
 * @ClassName： Client
 * @Description：
 * @Author: yhy
 * @Date： 2021/12/4 20:19
 **/
public class Client {
    public static void main(String[] args) {
        String statement = "3 * 4 / 2 % 4";

        Calculator calculator = new Calculator();

        calculator.build(statement);

        int result = calculator.compute();

        System.out.println("The result of statement is " + result);
    }
}
