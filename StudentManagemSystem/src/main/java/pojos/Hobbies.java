package pojos;

import javax.persistence.Embeddable;
import javax.persistence.ManyToOne;



@Embeddable
public class Hobbies {

// students ---- Hobbies (1-M) 	
private String hobby;

public Hobbies() {
	// TODO Auto-generated constructor stub
}

public Hobbies(String hobby) {
	super();
	this.hobby = hobby;
}

public String getHobby() {
	return hobby;
}

public void setHobby(String hobby) {
	this.hobby = hobby;
}

@Override
public String toString() {
	return "Hobbies [ hobby=" + hobby + "]";
}

//@ManyToOne dont do it its collection value type 








}
