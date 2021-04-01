package tn.esprit.spring.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Appointment implements Serializable {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idAppointment;
	private Date dateAppointment;
	private String status;
	
	
	@OneToOne
	AppointmentFeedback appointmentFeedback;
	
	@ManyToOne
	@JoinColumn(name="Costomer")
	private Costomer Costomer;

	public Appointment(Long idAppointment, Date dateAppointment, String status,
			tn.esprit.spring.entity.Costomer costomer) {
		super();
		this.idAppointment = idAppointment;
		this.dateAppointment = dateAppointment;
		this.status = status;
		Costomer = costomer;
	}

	public Appointment() {
		super();
	}

	public Long getIdAppointment() {
		return idAppointment;
	}

	public void setIdAppointment(Long idAppointment) {
		this.idAppointment = idAppointment;
	}

	public Date getDateAppointment() {
		return dateAppointment;
	}

	public void setDateAppointment(Date dateAppointment) {
		this.dateAppointment = dateAppointment;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	
	
	
	
	
	
	

}
