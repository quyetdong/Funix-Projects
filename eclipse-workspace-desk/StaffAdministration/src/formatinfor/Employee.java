package formatinfor;

/* 
 * Abstract class
 * Specify fields of an employee in general
 */

public abstract class Employee {
	private String name;
	private String section;
	private float salaryRate;
	private float workLoad;
	private String level;
	private float allowance;

	public String getLevel() {
		return level;
	}
	public void setLevel(String level) {
		this.level = level;
	}
		
	public float getWorkLoad() {
		return workLoad;
	}
	public void setWorkLoad(float workLoad) {
		this.workLoad = workLoad;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getSection() {
		return section;
	}
	public void setSection(String section) {
		this.section = section;
	}

	public float getSalaryRate() {
		return salaryRate;
	}
	public void setSalaryRate(float salaryRate) {
		this.salaryRate = salaryRate;
	}

	public float getAllowance() {
		return allowance;
	}	
	public void setAllowance(float allowance) {
		this.allowance = allowance;
	}
	
	public abstract float getSalary();
}
