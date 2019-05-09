package web;

public class EmpBean {

	private String name = null;
	private int age = 0;

	//引数として受けとった値をカプセル化した値に代入している
	public void setAge(int age) {
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	public String getName() {
		return name;
	}

	//引数として受けとった値をカプセル化した値に代入している
	public void setName(String name) {
		this.name = name;

	}

}
