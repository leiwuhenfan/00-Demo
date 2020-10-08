package ink.zhongshao.www;

import java.util.ArrayList;
import java.util.List;

public class Demo2 {

	public static void main(String[] args) {

		Demo2 kl = new Demo2();

		List<String> datas = new ArrayList<>();
		System.out.println(datas);
		
		kl.listg(datas);

		System.out.println("经过listg方法后,datas = "+datas);
	}

	public void listg(List<String> datas) {
		datas.add("1");
		
		System.out.println("listg方法里面的记录1="+datas);
		
		datas = new ArrayList<>();
		
		System.out.println("listg方法里面的记录2="+datas);
	}

}
