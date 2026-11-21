//package 사용자에 따라서;

public class Singleton {

    // Eager initialization 방법
    private static final Singleton instance = new Singleton();

    private int money = 0;

    private Singleton() { } // 유일한 생성자를 private로 설정

    public static Singleton getInstance()
    { return instance; }

     public int getMoney()
    { return money; }

    public void addMoney(int m)
    { money += m; }
}