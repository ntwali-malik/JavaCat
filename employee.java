class Employee
{
	double salary;
	int id;
	String name;
	Address add;
	public void Employee(double salary,int id,String name,Address add)
	{
this.salary=salary;
this.id=id;
this.name=name;
this.add=add;
System.out.print(id+" ");
System.out.print(name+" ");
System.out.print(salary+"");
System.out.print(add.country+"");
System.out.print(add.city+"");
System.out.print(add.zipcode+"");
	}
	public static void main(String[] args) 
	{
		Address obj=new Address();
		obj.Address("rwanda","kigali","kg23");
		Employee obje= new Employee();
		obje.Employee(1100000,1,"Didier",obj);
	}
}