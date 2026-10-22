package oper01;

public class OperTest01 {
	
	// 실행되지 않는 문장으로 //, /* ... */ 등으로 표시함
	// n1++ == n = n1 + 1
	// ++n1 == n = 1 + n1 
	
	public static void main(String[] args) {
		int n1  = 3;
		int n2  = 0;
		
		System.out.println("n1=" + n1 + " n2=" + n2);
		// n2 = n1++;  4, 3
		n2= ++n1;   // 4, 4 
		System.out.println("n1=" + n1 + " n2=" + n2);
	}

}
