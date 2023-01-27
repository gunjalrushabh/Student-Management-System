package pojos;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import pojos.Admission;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;




@Entity  //unmapped exception occurs if @Entity is missing
@Table(name="course")
public class Courses extends BaseEntity {
	@Column(name="course",unique = true,length = 100)
	private String course_Title;
	@Column(name="start_date")

	private LocalDate start_date;
	
	@Column(name="end_date")
	private LocalDate end_date;
	
	private double fees;
	
	private int capacity;
//course 1----*admisssion(M-M)
	@OneToMany(mappedBy = "course",cascade = CascadeType.ALL,orphanRemoval = true)
	private List<Admission>admlist=new ArrayList<Admission>();
	
	
	public String getCourse_Title() {
		return course_Title;
	}

	public void setCourse_Title(String course_Title) {
		this.course_Title = course_Title;
	}

	public List<Admission> getAdmlist() {
		return admlist;
	}

	public void setAdmlist(List<Admission> admlist) {
		this.admlist = admlist;
	}

	
	//Course----Student (M-M relation)
	//i want m-m realtion but addditonal column so for that add new entity admission (pojo)

	
	
	public Courses() {

	}

	public Courses(String title, LocalDate start_date, LocalDate end_date, double fees, int capacity) {
		super();
		this.course_Title = title;
		this.start_date = start_date;
		this.end_date = end_date;
		this.fees = fees;
		this.capacity = capacity;
	}

	

	@Override
	public String toString() {
		return "Courses [ course id : "+getId()+",course_Title=" + course_Title + ", start_date=" + start_date + ", end_date=" + end_date
				+ ", fees=" + fees + ", capacity=" + capacity + "]";
	}

	public String getTitle() {
		return course_Title;
	}

	public void setTitle(String title) {
		this.course_Title = title;
	}

	public LocalDate getStart_date() {
		return start_date;
	}

	public void setStart_date(LocalDate start_date) {
		this.start_date = start_date;
	}

	public LocalDate getEnd_date() {
		return end_date;
	}

	public void setEnd_date(LocalDate end_date) {
		this.end_date = end_date;
	}

	public double getFees() {
		return fees;
	}

	public void setFees(double fees) {
		this.fees = fees;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

}
