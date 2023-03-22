package classes;

public class EMP 
{
	int id;
	String name;
	double sal;
	EMP(){}
	public EMP(int id, String name, double sal) {
		super();
		this.id = id;
		this.name = name;
		this.sal = sal;
	}
	@Override
	public String toString() {
		return "EMP [id=" + id + ", name=" + name + ", sal=" + sal + "]";
	}
	

}
