package tn.esprit.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import tn.esprit.spring.entity.Appointment;
import tn.esprit.spring.entity.Bank;
import tn.esprit.spring.repository.AppointmentRepository;
@Service
public class Appointment_Service_Impl implements Appointment_Service {
	@Autowired
	AppointmentRepository appRep;

	@Override
	public void addAppointment(Appointment appointment) {
		//appointment.setStatus("In Progress");
		appRep.save(appointment);
	}

	@Override
	public void updateAppointment(Appointment appointment ,Long idAppointment) {
		
		Appointment app =new Appointment();
		app.setIdAppointment(idAppointment);
		appRep.save(appointment);
		
	}

	@Override
	public void deleteAppointment(Appointment appointment) {
		appRep.delete(appointment);
		
	}

	@Override
	public Appointment validateAppointment(Appointment appointment) {
		appointment.setStatus("Validated");
		
		return appointment;
	}

	@Override
	public List<Appointment> retrieveAllAppointments() {
		
		return(List<Appointment>) appRep.findAll();
	}

	@Override
	public ResponseEntity<?>  deleteAppointmentById(Long idAppointment) {
		
		// TODO Auto-generated method stub
		Appointment app =appRep.findById(idAppointment).orElse(null);
					if(app != null)
					{
						appRep.deleteById(idAppointment);
				
						return ResponseEntity.ok("Message est bien supprimer ");
					}
						else {
							return ResponseEntity.ok("Message n'existe pas");
						}
		
	}


	
	

}
