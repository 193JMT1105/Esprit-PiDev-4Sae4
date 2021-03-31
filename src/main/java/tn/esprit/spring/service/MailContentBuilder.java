package tn.esprit.spring.service;

import org.springframework.stereotype.Service;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;

@Service
public class MailContentBuilder {

	private final TemplateEngine templateEngine;
	
	public MailContentBuilder() {
		this.templateEngine = new TemplateEngine();
		// TODO Auto-generated constructor stub
	}

	public String build(String message) {
        Context context = new Context();
        context.setVariable("message", message);
        return templateEngine.process("mailTemplate", context);
    }
}
