package sorting;

public class Student 
implements Comparable<Student>
{
 int id;

String name;
int age;




public Student() {
	super();
	// TODO Auto-generated constructor stub
}


public Student(int id, String name, int age) {
	super();
	this.id = id;
	this.name = name;
	this.age = age;
}


public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}


@Override
public String toString() {
	return "Student [id=" + id + ", name=" + name + ", age=" + age + "]";
}


@Override
public int compareTo(Student o) {
	
	return this.name.compareTo(o.name);
}


//@Override

//public int compareTo(Student s) {
//	
//	return this.id-s.id;
//}

	
}
