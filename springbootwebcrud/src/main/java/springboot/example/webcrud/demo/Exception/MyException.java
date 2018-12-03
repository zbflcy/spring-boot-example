package springboot.example.webcrud.demo.Exception;

public class MyException extends Exception {
    public MyException() {
        super("用户不存在");
    }
}
