package homework9;

public class Student {
	
	 private int id;
	 private String fullName;
	 private String dateOfBirth;
	 private String university;
	 private String departmentCode;
	 private String departmentName;
	 private int yearOfEnrolment;
	 
	 public Student(int id, String fullName, String dateOfBirth, String university, String departmentCode, String departmentName, int yearOfEnrolment) {
		 this.id = id;
		 this.fullName = fullName;
		 this.dateOfBirth = dateOfBirth;
		 this.university = university;
		 this.departmentCode = departmentCode;
		 this.departmentName = departmentName;
		 this.yearOfEnrolment = yearOfEnrolment;
	 }

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getUniversity() {
		return university;
	}

	public void setUniversity(String university) {
		this.university = university;
	}

	public String getDepartmentCode() {
		return departmentCode;
	}

	public void setDepartmentCode(String departmentCode) {
		this.departmentCode = departmentCode;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public int getYearOfEnrolment() {
		return yearOfEnrolment;
	}

	public void setYearOfEnrolment(int yearOfEnrolment) {
		this.yearOfEnrolment = yearOfEnrolment;
	}
	 
	 
}
