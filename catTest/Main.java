import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Cat> data = new ArrayList<Cat>();
        Cat cat = new Cat(1, "Вася", "вислоухий", "Село Иваново");
        data.add(cat);
        System.out.println(cat);
        cat.sayMeow();
        cat.Jump();
        System.out.println(data);
    }
}
