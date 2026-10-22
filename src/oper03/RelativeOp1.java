package oper03;

public class RelativeOp1 {

	public static void main(String[] args) {
		// 관계연산자 : <, <=, =>, > , ==, !=
		// < : less than, > : greater than 
		int age = 20;
		System.out.println(age < 19);
		if( age > 19)
			System.out.println("성인");
		else {
			System.out.println("미성년자");
		}
	}

}
