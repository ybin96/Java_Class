package study;

class Box
{
	private double width;
	private double length;
	private double height;
	private double volume;
	
	//클래스이름과 동일한 이름의 메소드를 생성자라고 하며 
	//객체 생성시에 자동으로 수행하여 맴버변수들의 값을 초기화 할 목적으로 사용하는 특수한 메소드
	//생성자는 호출문에 의해서 동작하는 것이 아니기 때문에 return의 개념이 없어요.
	//생성자 이름 왼쪽에 리턴타입을 쓰지 않아야 합니다. void라고 쓰면 않돼요!
	//또, 생성자는 중복하여 정의할수 있어요. 중복(overloading)하여 정의하려면 매개변수의 개수가 다르거나 자료형이 
	//달라야 합니다.
	public  Box(){
		width = 10;
		length = 10;
		height = 10;
	}

	public Box(double width, double length, double height){
		this.width = width;
		this.length = length;
		this.height  = height;
	}

	public Box(double width){
		this.width = width;
		this.length = 10;
		this.height = 10;
	}
	
/*	public Box(double length){			// double형의 매개변수 1개를 갖는 생성자가 이미 있기 때문에 중복하여 정의할 수 없어요!
		this.length = length;
		this.width = 10;
		this.height = 10;
	}
*/	
	/*

	C:\javaStudy\day0818>javac BoxTest02.java
BoxTest02.java:32: error: constructor Box(double) is already defined in class Box
        public Box(double length){
               ^
1 error

*/

	public Box(double width, double length){
		this.width = width;
		this.length = length;
		this.height = 10;
	}


	public double getVolume(){
		return volume;
	}
	public void calcVolume(){
		volume = width * length * height;
	}
	public double getHeight(){
		return height;
	}
	public double getLength(){
		return length;
	}
	public double getWidth(){
		return width;
	}
	public void setHeight(double height){
		this.height = height;
	}
	public void setLength(double length){
		this.length = length;
	}
	public void setWidth(double width){
		this.width = width;
	}
}


class BoxTest02
{
	public static void main(String[] args) 
	{
		Box b1 = new Box();
		Box b2 = new Box(50,50,50);
		Box b3 = new Box(50);
		Box b4 = new Box(50,50);		
		
		b1.calcVolume();
		b2.calcVolume();
		b3.calcVolume();
		b4.calcVolume();
			
		System.out.println("가로:" + b1.getWidth());
		System.out.println("세로:" + b1.getLength());
		System.out.println("높이:" + b1.getHeight());
		System.out.println("부피:" + b1.getVolume());
		System.out.println("==============================================");
		System.out.println("가로:" + b2.getWidth());
		System.out.println("세로:" + b2.getLength());
		System.out.println("높이:" + b2.getHeight());
		System.out.println("부피:" + b2.getVolume());
		System.out.println("==============================================");
		System.out.println("가로:" + b3.getWidth());
		System.out.println("세로:" + b3.getLength());
		System.out.println("높이:" + b3.getHeight());
		System.out.println("부피:" + b3.getVolume());
		System.out.println("==============================================");
		System.out.println("가로:" + b4.getWidth());
		System.out.println("세로:" + b4.getLength());
		System.out.println("높이:" + b4.getHeight());
		System.out.println("부피:" + b4.getVolume());
	
	}
}
