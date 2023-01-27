package pojos;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity //unmapped exception occurs if @Entity is missing
@Table(name="student")
public class Students extends BaseEntity {
	@Column(name="first_name")
	
	private String firstname;
	@Column(name="last_name")
	private String lastname;
	@Column(name="email")
	private String email;
	@OneToMany(mappedBy = "student",cascade = CascadeType.ALL,orphanRemoval = true)
	private List<Admission>admlist1=new ArrayList<Admission>();
	
	
	public List<Admission> getAdmlist() {
		return admlist1;
	}

	public void setAdmlist(List<Admission> admlist) {
		this.admlist1 = admlist;
	}

	public Students() {
		
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Students [student id: " + getId() + ", firstname=" + firstname + ", lastname=" + lastname + ", email="
				+ email + "]";
	}

}
