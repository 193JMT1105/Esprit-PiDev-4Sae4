package tn.esprit.spring.service;

import tn.esprit.spring.entity.Appointment;
import tn.esprit.spring.entity.AppointmentFeedback;

public interface AppointmentFeedback_Service {
	
	void addAppointmentFeedback(AppointmentFeedback AppFeedback);
	void updateAppointmentFeedback(AppointmentFeedback AppFeedback);
	void deleteAppointmentFeedback(AppointmentFeedback AppFeedback);

}
