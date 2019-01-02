package TwoDay;

public interface Furit{
	static void panduan(String name) {
		if (name.equals("Apple"))
			new Apple();
		else if(name.equals("Banana"))
			new Banana();
		else if (name.equals("Grape"))
			new Grape();
		else 
			System.out.println("无法识别的水果种类");
	}
}
