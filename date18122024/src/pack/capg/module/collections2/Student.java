package pack.capg.module.collections2;

public class Student implements Comparable<Student> {

	private int studentid;
	private String name;
	private String subject;
	public Student(int studentid, String name, String subject) {
		super();
		this.studentid = studentid;
		this.name = name;
		this.subject = subject;
	}
	public int getStudentid() {
		return studentid;
	}
	public String getName() {
		return name;
	}
	public String getSubject() {
		return subject;
	}
	
	@Override
	public String toString() {
		return "Student [StudentId="+studentid+" , name= "+name+", subject= "+subject+ "]";
	}

	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return Integer.compare(this.studentid,  o.studentid); // compare by studentid
	}

}
