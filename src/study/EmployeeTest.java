package study;

import java.util.Scanner;

abstract class Employee{
	protected String name;
	protected int eno;
	protected int total;  //실수령액
	abstract public void computeSalary(); //추상메소드
	public Employee(String name, int eno){
		this.name = name;
		this.eno = eno;
	}
	public Employee(){
	}

	public int getTotal(){
		return total;
	}
	public int getEno(){
		return eno;
	}
	public String getName(){
		return name;
	}
	public void setEno(int eno){
		this.eno = eno;
	}
	public void setName(String name){
		this.name = name;
	}
}

class SalariedEmployee extends Employee{
	private int level; //호봉
	private int base; //기본급
	private int sudang; //수당

	public String toString(){
		return "이름:" + name + ",사원번호:"+eno +",호봉:"+level+
				",기본급:"+base+",수당:"+sudang+",실수령액:"+total;
	}

	public void computeSalary(){
		switch(level){
			case 1:base=1000;sudang=100;break;
			case 2:base=8000;sudang=80;break;
			case 3:base=6000;sudang=60;break;
		}
		total = base + sudang;
	}


	public SalariedEmployee(String name, int eno, int level){
		super(name, eno);
		this.level = level;
	}	
	public SalariedEmployee(){
	}
	public int getSudang(){
		return sudang;
	}
	public int getBase(){
		return base;
	}
	public int getLevel(){
		return level;
	}
	public void setLevel(int level){
		this.level = level;
	}

}


class HourlyEmployee extends Employee{
	private int base;  // 시간당 임금
	private int hours; // 일한 시간
	

	public String toString(){
		return "이름:"+name+",사원번호:"+eno+",시간당 임금:"+base+",일한 시간:" + hours + ",실수령액:"+total;
	}

	public void computeSalary(){
		total = base * hours;
	}
	public int getHours(){
		return hours;
	}
	public int getBase(){
		return base;
	}
	public void setHours(int hours){
		this.hours = hours;
	}
	public void setBase(int base){
		this.base = base;
	}
	public HourlyEmployee(String name, int eno, int base, int hours){
		super(name, eno);
		this.base = base;
		this.hours = hours;
	}
	public HourlyEmployee(){
	}

}


class EmployeeTest {
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		//3명에 사원의 정보를 입력받아 급여계산하고 출력
		Employee []arr = new Employee[3];
		
		int type;
		String name;
		int eno;
		int level;
		int base;
		int hours;

		//3명의 사원의 정보를 입력
		for(int i=0; i<arr.length; i++){
			System.out.print("사원의 종류를 입력하세요[1.월급제, 2.시간제] ==>");
			type = sc.nextInt();
			System.out.print("사원의 이름을 입력==>");
			name = sc.next();
			System.out.print("사원의 번호를 입력==>");
			eno = sc.nextInt();
			switch(type){
				case 1:
					System.out.print("호봉을 입력하세요==>");
					level = sc.nextInt();
					arr[i] = new SalariedEmployee(name, eno, level);
					break;
				case 2:
					System.out.print("시간당 급여을 입력하세요==>");
					base = sc.nextInt();										
					System.out.print("일한 시간을 입력하세요==>");
					hours = sc.nextInt();
					arr[i] = new HourlyEmployee(name,eno,base,hours);
					break;
			}
			arr[i].computeSalary();
		}

		
		//3명의 사원의 정보를 출력
		for(int i=0; i<arr.length; i++){
			System.out.println(arr[i]);
		}

	}
}

