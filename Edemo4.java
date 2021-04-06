class Employee
{
private int id;
private String name;
Employee(int id,String name)
{
this.id=id;
this.name=name;
}
public void display()
{
System.out.println("Employee Id:"+id);
System.out.println("Name:"+name);
}
}
class Edemo4
{
public static void main(String a[])
{
Employee e1=new Employee(1,"Bunny");
Employee e2=new Employee(2,"Sunny");
e1.display();
e2.display();
}
}