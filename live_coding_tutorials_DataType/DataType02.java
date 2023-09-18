package live_coding_tutorials_DataType;

public class DataType02 {

	public static void main(String[] args) {
		//형변환 Type Conversion
		double a = 3.0F; //자동 형변환
		float b = 3.0f;
		// 정수 byte -> short/char(2byte)->int(4byte) -> long(8)
		// 실수 float -> double
//		자동 형 변환의 원칙은 표현범위가 좁은 데이터 타입에서 
//		넓은 데이터 타입으로의 변환만 허용된다는 것이다.
		int aa = 3;
		float bb = 1.0F;
		double c = aa + bb;
		System.out.print(c);
		
		
		
		//명시적 형변환
		
//		float a = 100.0; f없이는 double로 인식.
//		int b = 100.0F; 
		
		
		float aaa = (float)100.0;
		int bbb = (int)100.0F;

	}

}
