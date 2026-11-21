//package 사용자에 따라서;

public class SingletonMain
{
	public static void main(String args[])
	{
		Singleton a = Singleton.getInstance();
		Singleton b = Singleton.getInstance();
		
		if (a == b) // 참조값(주소)를 비교
		{ System.out.printf("true\n"); }
		
		a.addMoney(100);
		b.addMoney(400);
		System.out.printf("a:%d b:%d\n", a.getMoney(), b.getMoney());
		
		//Singleton c = new Singleton(); //private 이므로 사용할 수 없다.
	}
}