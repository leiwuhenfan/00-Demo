package ink.zhongshao.www;

import java.util.ArrayList;
import java.util.List;

public class Demo2 {

	public static void main(String[] args) {

		Demo2 kl = new Demo2();

		List<String> datas = new ArrayList<>();
		System.out.println(datas);
		
		kl.listg(datas);

		System.out.println("����listg������,datas = "+datas);
	}

	public void listg(List<String> datas) {
		datas.add("1");
		
		System.out.println("listg��������ļ�¼1="+datas);
		
		datas = new ArrayList<>();
		
		System.out.println("listg��������ļ�¼2="+datas);
	}

}
