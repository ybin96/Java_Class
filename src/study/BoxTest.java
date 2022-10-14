package study;

class Boxs
{
	private double width;
	private double length;
	private double height;
	private double volume;
	
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


class BoxTest
{
	public static void main(String[] args) 
	{
		Box b1;				// Box클래스를 사용하기 위한 참조변수를 선언
		b1 = new Box();		// Box를 객체를 생성하여 그 객체를 참조변수 b1이 참조합니다.
		//b1.width = 50;
		b1.setWidth(50);
		b1.setLength(50);
		b1.setHeight(50);
		b1.calcVolume();
		System.out.println("가로:" + b1.getWidth());
		System.out.println("세로:" + b1.getLength());
		System.out.println("높이:" + b1.getHeight());
		System.out.println("부피:" + b1.getVolume());

	}
}
