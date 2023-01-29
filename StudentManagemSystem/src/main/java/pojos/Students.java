package pojos;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity // unmapped exception occurs if @Entity is missing
@Table(name = "student")
public class Students extends BaseEntity {
	@Column(name = "first_name")

	private String firstname;
	@Column(name = "last_name")
	private String lastname;
	@Column(name = "email")
	private String email;
	@OneToMany(mappedBy = "student", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Admission> admlist1 = new ArrayList<Admission>();

	// Student ---- Address ( 1-1 )
	@OneToOne(mappedBy = "student", cascade = CascadeType.ALL, fetch = FetchType.LAZY, orphanRemoval = true)
	private Address address;

	// students ---- Hobbies (1-M)
	// entity-------collection value type
	@ElementCollection
	@CollectionTable(name = "hobbies_hb", joinColumns = @JoinColumn(name = "student_id"))
	private List<Hobbies> hobbies = new ArrayList<Hobbies>();

	@ElementCollection
	@CollectionTable(name = "education", joinColumns = @JoinColumn(name = "student_id"))
	private List<EducationalQual> qualification = new ArrayList<EducationalQual>();

	@Embedded
	private AdhaarCard adhar;

//@ManyToMany 
//private Projects projects;

	public List<Hobbies> getHobbies() {
		return hobbies;
	}

	public void setHobbies(List<Hobbies> hobbies) {
		this.hobbies = hobbies;
	}

	public List<EducationalQual> getQualification() {
		return qualification;
	}

	public void setQualification(List<EducationalQual> qualification) {
		this.qualification = qualification;
	}

	public AdhaarCard getAdhar() {
		return adhar;
	}

	public void setAdhar(AdhaarCard adhar) {
		this.adhar = adhar;
	}

	public List<Admission> getAdmlist1() {
		return admlist1;
	}

	public void setAdmlist1(List<Admission> admlist1) {
		this.admlist1 = admlist1;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

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
