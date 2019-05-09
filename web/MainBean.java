package web;

public class MainBean {
	public static void main(String[] args) {

		//インスタンス化
		SampleBean kou = new SampleBean();

		//setでsalaryに値をいれる
		kou.setSalary(20);

		//コンソールに表示
		System.out.println(kou.getSalary());
	}

}

