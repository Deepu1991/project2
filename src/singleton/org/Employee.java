package singleton.org;


public class Employee {

	static Employee e;
	//constructor
	private Employee() {
		
	}
	public void empId() {
		System.out.println("Emp Id is 1234");
		
	}
	public static Employee getInstance() {
		System.out.println(e);
		if(e==null) {
		e=new Employee();
		
	}
	System.out.println(e);
	return e;
	
	}
	public static void main(String[] args) {
		
		//Employee e1=new Employee();
		//e1.empId();
		Employee obj=getInstance();
		System.out.println(obj);
		obj.empId();
	}
		
		
		
		
		
		
		
		
	}
