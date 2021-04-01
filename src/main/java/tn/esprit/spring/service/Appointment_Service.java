package tn.esprit.spring.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import tn.esprit.spring.entity.Appointment;
import tn.esprit.spring.entity.Bank;

public interface Appointment_Service {
	void addAppointment(Appointment Appointment);
	void updateAppointment(Appointment Appointment,Long idAppointment);
	public ResponseEntity<?>  deleteAppointmentById(Long idAppointment);
	void deleteAppointment(Appointment Appointment);
	Appointment validateAppointment (Appointment appointment);
	List <Appointment> retrieveAllAppointments();


}
