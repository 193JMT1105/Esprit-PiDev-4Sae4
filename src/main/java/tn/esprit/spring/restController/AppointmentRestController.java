package tn.esprit.spring.restController;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import tn.esprit.spring.entity.Appointment;
import tn.esprit.spring.entity.Bank;
import tn.esprit.spring.entity.Loan;
import tn.esprit.spring.repository.AppointmentRepository;
import tn.esprit.spring.service.Appointment_Service;
import tn.esprit.spring.service.Loan_Service;

@RestController
public class AppointmentRestController {
	
	
	@Autowired
	Appointment_Service AppointmentService;
	
	@Autowired
	AppointmentRepository appointmentRepo;

	@RequestMapping(value="/addAppointment",method = RequestMethod.POST)
	public void addAppointment(@RequestBody  Appointment a)
	{
		a.setStatus("In Progress");
		AppointmentService.addAppointment(a);	
	}
	
	/*
	 * @PutMapping(value="/updateAppointment/{id}") public void
	 * updateAppointment(@PathVariable("id") Long idAppointment,@RequestBody
	 * Appointment a ) { Appointment
	 * appointment=appointmentRepo.getAppointmentByIdAppointment(idAppointment);
	 * a.setStatus("In Progress");
	 * a.setDateAppointment(appointment.getDateAppointment());
	 * //AppointmentService.addAppointment(a);
	 * 
	 * AppointmentService.updateAppointment(a); }
	 */
	
	  @PutMapping("/validateAppointment/{id}") 
	  public void validerAppointment(@PathVariable("id") Long idAppointment)
	  
	  { 
		  Appointment a=appointmentRepo.getAppointmentByIdAppointment(idAppointment);
		  a.setStatus("Validate"); 
		  AppointmentService.updateAppointment(a,idAppointment); }
	 
	
	
	@DeleteMapping("/deleteAppointment/{id}")
	public void deleteAppointment(@PathVariable("id") Long idAppointment)
	{
		AppointmentService.deleteAppointmentById(idAppointment); 
	}
	
	@RequestMapping(value ="/retrieveAllAppointments",method= RequestMethod.GET)
	public List<Appointment> retrieveAllAppointments()
	{
		return AppointmentService.retrieveAllAppointments();
	}
	
	
	

	

}
