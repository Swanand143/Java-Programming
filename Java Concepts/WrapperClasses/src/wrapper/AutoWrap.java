package wrapper;

public class AutoWrap {
	
	public static void main(String[] args) {
		
		Integer i = 10 ;//auto-boxing
		System.out.println(i);//non-primitive
		int a = i; //auto-unboxing
		System.out.println(a);//primitive
		
		Character c ='a';//auto-boxing
		char ch = c ;//auto-unboxing
		System.out.println(ch);
	}

}
