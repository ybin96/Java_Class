package study;

class Person
{
	private String name;
	private int age;
	
	public String toString(){
		return name + "," + age;
	}
}

class DefaultConstructorTest 
{
	public static void main(String[] args) 
	{
		Person p1 = new Person(); 
		//사용자가 생성자를 한개도 만들지 않으면
		//기본 생성자가 제공되기 때문의 위와 같은 객체를 생성할 수 있어요!
		//String 은 null, int 0으로 초기화가 되어요!

		System.out.println(p1);

	}
}
