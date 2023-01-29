package pojos;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="address_tbl")
public class Address  extends BaseEntity {

	private String city;
	private String state;
	private String country;
	private String zipcode;
	
	// Student ---- Address  ( 1-1 )
	// parent ---child
	
	@OneToOne
	@JoinColumn(name="student_add")
	private Students student;

	public Address(String city, String state, String country, String zipcode, Students student) {
		super();
		this.city = city;
		this.state = state;
		this.country = country;
		this.zipcode = zipcode;
		this.student = student;
	}
	
	public Address() {
		// TODO Auto-generated constructor stub
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	public Students getStudent() {
		return student;
	}

	public void setStudent(Students student) {
		this.student = student;
	}

	@Override
	public String toString() {
		return "Address [Addresss id: "+getId()+"  city=" + city + ", state=" + state + ", country=" + country + ", zipcode=" + zipcode
				+ ", student=" + student + "]";
	}
	
	
	
}
