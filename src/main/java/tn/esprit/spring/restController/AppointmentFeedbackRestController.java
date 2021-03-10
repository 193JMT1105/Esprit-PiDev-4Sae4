package tn.esprit.spring.restController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tn.esprit.spring.entity.Appointment;
import tn.esprit.spring.entity.AppointmentFeedback;
import tn.esprit.spring.service.AppointmentFeedback_Service;
import tn.esprit.spring.service.Appointment_Service;


@RestController
@RequestMapping("/AppointmentFeedback")
public class AppointmentFeedbackRestController {
	
	@Autowired
	AppointmentFeedback_Service AppointmentFeedbackService;

	@PostMapping("/addAppointmentFeedback")
	public void addAppointment(@RequestBody  AppointmentFeedback a)
	{
		AppointmentFeedbackService.addAppointmentFeedback(a);	
	}
	
	@PutMapping("/updateAppointmentFeedback")
	public void updateAppointmentFeedback(@RequestBody  AppointmentFeedback a)
	{
		AppointmentFeedbackService.updateAppointmentFeedback(a);
	}
	
	@DeleteMapping("/deleteAppointmentFeedback")
	public void deleteAppointment(@RequestBody AppointmentFeedback a)
	{
		AppointmentFeedbackService.deleteAppointmentFeedback(a); 
	}

}
