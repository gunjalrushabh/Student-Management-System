package pojos;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class AdhaarCard {
	@Column(name="card_no",unique = true,length = 20)
	private String cardno;

	@Column(name = "created_on")
	private LocalDate createdOn;

	@Column(length = 50)
	private String city;

	public AdhaarCard() {
		// TODO Auto-generated constructor stub
	}

	public AdhaarCard(String cardno, LocalDate createdOn, String city) {
		super();
		this.cardno = cardno;
		this.createdOn = createdOn;
		this.city = city;
	}

	public String getCardno() {
		return cardno;
	}

	public void setCardno(String cardno) {
		this.cardno = cardno;
	}

	public LocalDate getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(LocalDate createdOn) {
		this.createdOn = createdOn;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "AdhaarCard [cardno=" + cardno + ", createdOn=" + createdOn + ", city=" + city + "]";
	}

}
