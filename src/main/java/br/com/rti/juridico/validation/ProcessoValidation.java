package br.com.rti.juridico.validation;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import br.com.rti.juridico.models.Processo;

public class ProcessoValidation implements Validator{

	@Override
	public boolean supports(Class<?> clazz) {
		return Processo.class.isAssignableFrom(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		ValidationUtils.rejectIfEmpty(errors, "numero", "field.required");
		ValidationUtils.rejectIfEmpty(errors, "resumo", "field.required");
		ValidationUtils.rejectIfEmpty(errors, "forum", "field.required");
		
	}
}
