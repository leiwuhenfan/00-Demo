package ink.zhongshao.www;

public class Test {

	public static void main(String[] args) {

		System.out.println("-------------我修改了文件--------------");

		System.out.println("-------------我定版本了V1.0.0--------------");
		
		System.out.println("-------------我是branch1分支，修改的文件--------------");

	}

	/**
	 * “|”运算符：不论运算符左侧为true还是false，右侧语句都会进行判断
	 */
	public static void test1() {
		int a = 1, b = 1;
		if (a++ == 1 | ++b == 2)
			System.out.println("true");
		System.out.println("a= " + a + "  ,b=  " + b);
	}

	/**
	 * “||”运算符：若运算符左边为true，则不再对运算符右侧进行运算
	 */
	public static void test2() {
		int a = 1, b = 1;
		if (a++ == 1 || ++b == 2)
			System.out.println("true");
		System.out.println("a= " + a + "  ,b=  " + b);
	}

	/**
	 * &运算符与|运算符类似：不论运算符左侧为true还是false，右侧语句都会进行判断
	 */
	public static void test3() {
		int a = 1, b = 1;
		if (a++ == 2 & ++b == 2)
			System.out.println(true);
		else
			System.out.println(false);
		System.out.println("a= " + a + "  ,b=  " + b);
	}

	/**
	 * “&&”运算符与“||”运算符类似：若运算符左侧为false则不再对右侧语句进行判断
	 */
	public static void test4() {
		int a = 1, b = 1;
		if (a++ == 2 && ++b == 2)
			System.out.println(true);
		else
			System.out.println(false);
		System.out.println("a= " + a + "  ,b=  " + b);
	}

}
