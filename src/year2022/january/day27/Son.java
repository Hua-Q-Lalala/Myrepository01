package year2022.january.day27;

/**
 * @create 2022-02-09 12:15
 */
public class Son extends Father{

    @Override
    public void a(int aVal) {
        System.out.println("son aaaaa");
    }

    public static void main(String[] args) {
        Son son = new Son();
        son.a();
        son.a(10);
    }
}
