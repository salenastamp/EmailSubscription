package com.salena.emaillist.subscriber;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.CreationTimestamp;

@Entity
public class Subscriber {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String name;
	private String email;
	@Column
	@CreationTimestamp
	private Date signedUp;
	
	public Subscriber() {
		
	}
	
	public Subscriber(String name, String email, Date signedUp){
			this.name = name;
			this.email = email;
			this.signedUp = signedUp;
	}

	public Long getId() {
		return id;
	}
	public String getname() {
		return name;
	}

	public void setname(String name) {
		this.name = name;
	}

	public String getemail() {
		return email;
	}

	public void setemail(String email) {
		this.email = email;
	}

	public Date getSignedUp() {
		return signedUp;
	}

	public void setSignedUp(Date signedUp) {
		this.signedUp = signedUp;
	}

	@Override
	public String toString() {
		return "Subscriber [id=" + id + ", name=" + name + ", email=" + email
				+ ", signedUp=" + signedUp + "]";
	}	
	
}