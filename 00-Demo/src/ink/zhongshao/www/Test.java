package ink.zhongshao.www;

public class Test {

	public static void main(String[] args) {

	}

	/**
	 * ��|���������������������Ϊtrue����false���Ҳ���䶼������ж�
	 */
	public static void test1() {
		int a = 1, b = 1;
		if (a++ == 1 | ++b == 2)
			System.out.println("true");
		System.out.println("a= " + a + "  ,b=  " + b);
	}

	/**
	 * ��||�������������������Ϊtrue�����ٶ�������Ҳ��������
	 */
	public static void test2() {
		int a = 1, b = 1;
		if (a++ == 1 || ++b == 2)
			System.out.println("true");
		System.out.println("a= " + a + "  ,b=  " + b);
	}

	/**
	 * &�������|��������ƣ�������������Ϊtrue����false���Ҳ���䶼������ж�
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
	 * ��&&��������롰||����������ƣ�����������Ϊfalse���ٶ��Ҳ��������ж�
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