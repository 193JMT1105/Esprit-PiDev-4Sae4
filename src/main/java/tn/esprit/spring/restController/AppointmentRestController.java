package tn.esprit.spring.restController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tn.esprit.spring.entity.Appointment;
import tn.esprit.spring.entity.Loan;
import tn.esprit.spring.service.Appointment_Service;
import tn.esprit.spring.service.Loan_Service;

@RestController
@RequestMapping("/Appointment")
public class AppointmentRestController {
	
	
	@Autowired
	Appointment_Service AppointmentService;

	@PostMapping("/addAppointment")
	public void addAppointment(@RequestBody  Appointment a)
	{
		AppointmentService.addAppointment(a);	
	}
	
	@PutMapping("/updateAppointment")
	public void updateAppointment(@RequestBody  Appointment a)
	{
		AppointmentService.updateAppointment(a);
	}
	
	@DeleteMapping("/deleteAppointment")
	public void deleteAppointment(@RequestBody Appointment a)
	{
		AppointmentService.deleteAppointment(a); 
	}

	

}
