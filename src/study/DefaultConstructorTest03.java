package study;

class Persons{
	private String name;
	private int age;	
	public Persons(String name, int age){
		this.name = name;
		this.age = age;
	}
	public Persons(){
	}
	public String toString(){
		return name + "," + age;
	}
}

class DefaultConstructorTest03 {
	public static void main(String[] args) {
		Persons p1 = new Persons("홍길동", 20);
		Persons p2 = new Persons();
		System.out.println(p1);
		System.out.println(p2);
	}
}
