package pojos;

import javax.persistence.Embeddable;

@Embeddable
public class EducationalQual {

	private String qualification;
	private int passingYear;
	private double marks;
	
	public EducationalQual() {
		// TODO Auto-generated constructor stub
	}
	
	public EducationalQual(String qualification, int passingYear, double marks) {
		super();
		this.qualification = qualification;
		this.passingYear = passingYear;
		this.marks = marks;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public int getPassingYear() {
		return passingYear;
	}

	public void setPassingYear(int passingYear) {
		this.passingYear = passingYear;
	}

	public double getMarks() {
		return marks;
	}

	public void setMarks(double marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "EducationalQual [qualification=" + qualification + ", passingYear=" + passingYear + ", marks=" + marks
				+ "]";
	}
	
	
	
	
}
