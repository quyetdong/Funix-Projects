package formatinfor;

/* 
 * Specify fields of a staff
 */

public class Staff extends Employee implements GetSalary{		
	public Staff() {}
	
	public Staff(String name,String section,String level,float salaryRate,float workLoad) {
		this.setName(name);
		this.setSection(section);
		this.setLevel(level);
		this.setSalaryRate(salaryRate);
		this.setWorkLoad(workLoad);
		this.setAllowance(level);
	}
	
	public void setAllowance(String position) {
		if(position.equals("staff")) {
			allowance = 500;			
		}
		else if(position.equals("deputy")) {
			allowance = 1000;
		}
		else if(position.equals("head")) {
			allowance = 2000;
		}
		else {
			allowance = 0;
		}			
	}
	
	public float getSalary() {
		return (getSalaryRate()*730 + getAllowance() + getWorkLoad()*30); 
	}
	
	public void printInfor() {
		System.out.printf("%14s|", getName());
		System.out.printf("%9s|", getSection());
		System.out.printf("%7s|", getLevel());
		System.out.printf("%21.1f|", getWorkLoad());
		System.out.printf("%11.1f|", getSalaryRate());
		System.out.printf("%10.1f|", getAllowance());
		System.out.printf("%8.1f", getSalary());
		
		System.out.println();
	}
}
