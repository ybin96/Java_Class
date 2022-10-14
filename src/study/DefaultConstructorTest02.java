package study;

class Personer{
	private String name;
	private int age;	
	public Personer(String name, int age){
		this.name = name;
		this.age = age;
	}
	public String toString(){
		return name + "," + age;
	}
}

class DefaultConstructorTest02 {
	public static void main(String[] args) {
		//Person p1 = new Person();
		Personer p1 = new Personer("홍길동", 20);
		System.out.println(p1);
	}
}
/*
	C:\javaStudy\day0818>javac DefaultConstructorTest02.java
DefaultConstructorTest02.java:15: error: constructor Person in class Person cannot be applied to given types;
                Person p1 = new Person();
                            ^
  required: String,int
  found:    no arguments
  reason: actual and formal argument lists differ in length
1 error	

	사용자가 생성자를 하나라도 만들기 시작하면
	매개 변수를 갖지 않는 기본생성자는 제공되지 않습니다.

	내가 정의한 생성자 대로만 객체를 생성할 수 있어요!
	만약, 기본생성자도 필요하다면 정의 해야 합니다!


*/
