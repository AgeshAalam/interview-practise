package exception;

public class Child extends Parent{
    @Override
    public void methodA() {
            System.out.println("this is methodA from class B");
        }

    public static void main(String[] args) {
        Child b= (Child) new Parent();
       b.methodA();
    } }