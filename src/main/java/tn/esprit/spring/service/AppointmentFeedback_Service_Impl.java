package tn.esprit.spring.service;

import org.springframework.stereotype.Service;

import tn.esprit.spring.entity.AppointmentFeedback;
import tn.esprit.spring.repository.AppointmentFeedbackRepository;

@Service
public class AppointmentFeedback_Service_Impl implements AppointmentFeedback_Service {
	
	AppointmentFeedbackRepository appFeedbackRep ;
	
	@Override
	public void addAppointmentFeedback(AppointmentFeedback AppFeedback) {
		appFeedbackRep.save(AppFeedback)	;	
	}

	@Override
	public void updateAppointmentFeedback(AppointmentFeedback AppFeedback) {
		appFeedbackRep.save(AppFeedback)	;	
		
	}

	@Override
	public void deleteAppointmentFeedback(AppointmentFeedback AppFeedback) {
		appFeedbackRep.delete(AppFeedback)	;	
		
	}

}
