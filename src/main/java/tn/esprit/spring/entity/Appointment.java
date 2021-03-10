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
	
	@OneToOne
	AppointmentFeedback appointmentFeedback;
	
	@ManyToOne
	@JoinColumn(name="Costomer")
	private Costomer Costomer;
	
	
	
	
	

}
