package tn.esprit.spring.service;

import org.springframework.stereotype.Service;

import tn.esprit.spring.entity.Appointment;
import tn.esprit.spring.repository.AppointmentRepository;
@Service
public class Appointment_Service_Impl implements Appointment_Service {
	AppointmentRepository appRep;

	@Override
	public void addAppointment(Appointment appointment) {
		appRep.save(appointment);
	}

	@Override
	public void updateAppointment(Appointment appointment) {
		appRep.save(appointment);
		
	}

	@Override
	public void deleteAppointment(Appointment appointment) {
		appRep.delete(appointment);
		
	}
	
	

}
