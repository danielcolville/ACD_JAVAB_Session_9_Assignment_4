package session9;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Employee implements Comparable {
	private String name;
	private int designation;
	private int salary;
	public Employee(String name,int designation,int salary) {
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
				if(e1.designation>e2.designation) {
					return 1;
				}
				else if(e1.designation<e2.designation) {
					return -1;
				}
				
			}
			return 0;
		}
	};
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		if(o!=null && o instanceof Employee) {
			Employee e=(Employee)o;
			if(salary>e.salary) {
				return 1;
			}
			else if(e.salary>salary) {
				return -1;
			}
			
		}
		return 0;
	}
	@Override
	public String toString() {
		String str="Name:"+name+", Designation:"+designation+", Salary:"+salary;
		return str;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Employee> s=new TreeSet<Employee>();
		s.add(new Employee("Andrew",1,123));
		s.add(new Employee("Bill",3,1000));
		s.add(new Employee("Bill",2,1001));
		s.add(new Employee("Charles",1,500));
		System.out.println(s);
		Set<Employee> s2=new TreeSet<Employee>(new empComp());
		s.add(new Employee("Andrew",1,123));
		s.add(new Employee("Bill",3,1000));
		s.add(new Employee("Bill",2,1001));
		s.add(new Employee("Charles",1,500));
		System.out.println(s2);
	}
	
}
