/**
 * Encap1
 */
class Student{
	private int age;
	private String name;

	public void setAge(int age)
	{
		this.age=age;
		
	}
	public int getAge()
	{
		return age; 
	}
	public void setName(String name)
	{
		this.name="Navin";
		
	}
	public String getName()
	{
		return name; 
	}
	public void show()
	{
	System.out.println(age+" "+name);
	}
}
public class Encap1 {

    public static void main(String[] args) {
        System.out.println("Encapsulation");
        Student obj1 = new Student();
        obj1.setAge(18);
        obj1.setName("Asit");
        String obj_Name = obj1.getName();
        int obj_Age = obj1.getAge();
        System.out.println(obj_Age);

    }
}