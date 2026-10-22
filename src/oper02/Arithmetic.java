package oper02;

public class Arithmetic {

	public static void main(String[] args) {
		int n1 = 3 + 4 * 2;
		System.out.println(n1);
		
		System.out.println(7/2);
		System.out.println(7/2.0);
		
		System.out.println(0 == 0.0); // '==' 비교 연산자로 참, 거짓을 판단 '0'은 4바이트, '0.0'은 8바이트인데 자동변환됨
		
		int n2 = 0 / 3;
		System.out.println(n2);
		
		// 예외처리 하는 법 - 블록 지정하고 surround 블록에서 try/catch 
		try { //오픈
			int n3 = 3 / 0;    //  '0'을 '1'로 하면 출력됨
			System.out.println(n3);
		} catch (ArithmeticException e) { // 예외 있을 때
			System.out.println("계산 예외발생:" + e);
		} catch (Exception e) { 
			System.out.println("예외발생" + e.getMessage());
			// TODO Auto-generated catch block
			//e.printStackTrace();
		}
        // Exception in thread "main" java.lang.ArithmeticException: / by zero 
		//   at oper01.OperTest02.main(OperTest02.java:16)
		// RunTimeError 실행시 발생하는 오류(자바에서는 Exception) 
		// 이 후 프로그램은 종료되며 실행되지 않는다 > 예외처리를 하지 않으면.. 
		
		finally { // 클로즈
			System.out.println("예외 상관없이 무조건 출력된다");
		}
		System.out.println("메롱");
	}

}
