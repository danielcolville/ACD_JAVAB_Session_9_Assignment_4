package session9;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Employee implements Comparable<Employee> {
	private String name;
	private String designation;
	private int salary;
	public Employee(String name,String designation,int salary) {
		this.name=name;
		this.designation=designation;
		this.salary=salary;
	}
	public static class  empComp implements Comparator<Employee> {
		@Override
		public int compare(Employee e1,Employee e2) {
			if(e1.name.compareTo(e2.name)>0) {
				return 1;
			}
			else if(e1.name.compareTo(e2.name)<0) {
				return -1;
			}
			else {
				if(e1.designation.compareTo(e2.designation)>0) {
					return 1;
				}
				else if(e1.designation.compareTo(e2.designation)<0) {
					return -1;
				}
				
				
			}
			return 0;
		}
	}
	@Override
	public int compareTo(Employee e) {
		// TODO Auto-generated method stub
		if(salary>e.salary) {
			return 1;
		}
		else if(e.salary>salary) {
			return -1;
		}
		else {
			if(this.name.compareTo(e.name)>0) {
				return 1;
			}
			else if(this.name.compareTo(e.name)<0) {
				return -1;
			}
			else {
				if(this.designation.compareTo(e.designation)>0) {
					return 1;
				}
				else if(this.designation.compareTo(e.designation)<0) {
					return -1;
				}
				
				
			}
		}
		return 0;
	}
	@Override
	public String toString() {
		String str="\nName:"+name+", Designation:"+designation+", Salary:"+salary;
		return str;
	}
	public static void main(String[] args) {
		Set<Employee> s=new TreeSet<Employee>();
		s.add(new Employee("Andrew","Accounts",123));
		s.add(new Employee("Bill","HR",1000));
		s.add(new Employee("Bill","Accounts",1001));
		s.add(new Employee("Charles","IT",500));
		s.add(new Employee("David","HR",500));
		System.out.println(s);
		Set<Employee> s2=new TreeSet<Employee>(new empComp());
		s2.add(new Employee("Andrew","Accounts",123));
		s2.add(new Employee("Bill","HR",1000));
		s2.add(new Employee("Bill","Accounts",1001));
		s2.add(new Employee("Charles","IT",500));
		s2.add(new Employee("David","HR",500));
		System.out.println(s2);
	}
	
}