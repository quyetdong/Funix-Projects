package formatinfor;

/* 
 * Specify fields of a staff
 */

public class Staff extends Employee implements CalAllowance{		
	public Staff() {}
	
	public Staff(String name,String section,String level,float salaryRate,float workLoad) {
		this.setName(name);
		this.setSection(section);
		this.setLevel(level);
		this.setSalaryRate(salaryRate);
		this.setWorkLoad(workLoad);
		this.calAllowance(level);
	}
	
	public void calAllowance(String position) {
		if(position.equals("staff")) {
			this.setAllowance(500);			
		}
		else if(position.equals("deputy")) {
			this.setAllowance(1000);		
		}
		else if(position.equals("head")) {
			this.setAllowance(2000);		
		}
		else {
			this.setAllowance(0);		
		}			
	}
	
	public void printInfor() {
		System.out.printf("%15s|", getName());
		System.out.printf("%10s|", getSection());
		System.out.printf("%7s|", getLevel());
		System.out.printf("%21.1f|", getWorkLoad());
		System.out.printf("%11.1f|", getSalaryRate());
		System.out.printf("%10.1f|", getAllowance());
		System.out.printf("%8.1f", getSalary());
		
		System.out.println();
	}
	
	public float getSalary() {
		return (getSalaryRate()*730 + getAllowance() + getWorkLoad()*30);
	}
}
