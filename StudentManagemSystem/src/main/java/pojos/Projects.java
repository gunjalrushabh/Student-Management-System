package pojos;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.hibernate.annotations.UpdateTimestamp;

@Entity
@Table(name="projects")
public class Projects  extends BaseEntity{

	@Column(name="project_name")
	private String projectName;
	@Column(name="completed_on")
	@UpdateTimestamp
	private LocalDate completionDate;
	
	
	@ManyToMany
	@JoinTable(name="Project_students",
	joinColumns = @JoinColumn(name="project_id"),
	inverseJoinColumns = @JoinColumn(name="student_id"))
	private Set<Students>studentset=new HashSet<Students>();

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public LocalDate getCompletionDate() {
		return completionDate;
	}

	public void setCompletionDate(LocalDate completionDate) {
		this.completionDate = completionDate;
	}

	public Set<Students> getStudentset() {
		return studentset;
	}

	public void setStudentset(Set<Students> studentset) {
		this.studentset = studentset;
	}

	@Override
	public String toString() {
		return "Projects [projectName=" + projectName + ", completionDate=" + completionDate + ", studentset="
				+ studentset + "]";
	}
	
	
	
}
