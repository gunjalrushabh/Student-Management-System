package pojos;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity  //unmapped exception occurs if @Entity is missing
@Table(name="admission_tbl")
public class Admission extends BaseEntity {
	private LocalDate admissionDate;
	private int course_id;
	private int student_id;
	@ManyToOne
	@JoinColumn(name = "coursejoin")
	private Courses course;
	@ManyToOne
	@JoinColumn(name = "studentjoin")
	private Students student;
	
	@Enumerated(EnumType.STRING)
	private Status status;

	
	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public Courses getCourse() {
		return course;
	}

	public void setCourse(Courses course) {
		this.course = course;
	}

	public Students getStudent() {
		return student;
	}

	public void setStudent(Students student) {
		this.student = student;
	}

	public Admission() {

	}

	public Admission(LocalDate admissionDate, int course_id, int student_id) {
		super();
		this.admissionDate = admissionDate;
		this.course_id = course_id;
		this.student_id = student_id;

	}

	public LocalDate getAdmissionDate() {
		return admissionDate;
	}

	public void setAdmissionDate(LocalDate admissionDate) {
		this.admissionDate = admissionDate;
	}

	public int getCourse_id() {
		return course_id;
	}

	public void setCourse_id(int course_id) {
		this.course_id = course_id;
	}

	public int getStudent_id() {
		return student_id;
	}

	public void setStudent_id(int student_id) {
		this.student_id = student_id;
	}

	@Override
	public String toString() {
		return "Admission [Admission id: " + getId() + ", admissionDate=" + admissionDate + ", course_id=" + course_id
				+ ", student_id=" + student_id + "]";
	}

}
