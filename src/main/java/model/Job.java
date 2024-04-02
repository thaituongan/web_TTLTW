package model;

public class Job {
	private int jobId;
	private String title;
	private String description;
	private String jobRequire;
	private String interest;
	private int quantity;
	private double maxSalary;
	private double minSalary;
	private String profession;
	private String dueDate;
	private boolean confirm;
	private String city;
	private int compId;

	public Job() {
	}

	public Job(int jobId, String title, String description, String jobRequire, String interest, int quantity,
			double maxSalary, double minSalary, String profession, String dueDate, boolean confirm, String city,
			int compId) {
		super();
		this.jobId = jobId;
		this.title = title;
		this.description = description;
		this.jobRequire = jobRequire;
		this.interest = interest;
		this.quantity = quantity;
		this.maxSalary = maxSalary;
		this.minSalary = minSalary;
		this.profession = profession;
		this.dueDate = dueDate;
		this.confirm = confirm;
		this.city = city;
		this.compId = compId;
	}

	public int getJobId() {
		return jobId;
	}

	public void setJobId(int jobId) {
		this.jobId = jobId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getJobRequire() {
		return jobRequire;
	}

	public void setJobRequire(String jobRequire) {
		this.jobRequire = jobRequire;
	}

	public String getInterest() {
		return interest;
	}

	public void setInterest(String interest) {
		this.interest = interest;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getMaxSalary() {
		return maxSalary;
	}

	public void setMaxSalary(double maxSalary) {
		this.maxSalary = maxSalary;
	}

	public double getMinSalary() {
		return minSalary;
	}

	public void setMinSalary(double minSalary) {
		this.minSalary = minSalary;
	}

	public String getProfession() {
		return profession;
	}

	public void setProfession(String profession) {
		this.profession = profession;
	}

	public String getDueDate() {
		return dueDate;
	}

	public void setDueDate(String dueDate) {
		this.dueDate = dueDate;
	}

	public boolean isConfirm() {
		return confirm;
	}

	public void setConfirm(boolean confirm) {
		this.confirm = confirm;
	}

	public int getCompId() {
		return compId;
	}

	public void setCompId(int compId) {
		this.compId = compId;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
}