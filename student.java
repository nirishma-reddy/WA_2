public class student
{
String name;
String course;
int age;
public student(String name, String course,int age)
{
this.name = name;
this.course = course;
this.age = age;
}
public String getName()
{
return name;
}
public static void main(String[] args)
{
student s1 = new student("Nirishma","EEE",212);

System.out.println(s1.getName());
}
}