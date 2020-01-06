package com.mycompany.classicmodels.web.converter;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@FacesConverter("localDateConverter")
public class LocalDateConverter implements Converter {

	@Override
	public Object getAsObject(FacesContext context, UIComponent component, String value) {
		return LocalDate.parse(value, DateTimeFormatter.ofPattern("MM/dd/yyyy"));
	}

	@Override
	public String getAsString(FacesContext context, UIComponent component, Object value) {
		LocalDate date = (LocalDate) value;
		return date.format(DateTimeFormatter.ofPattern("MM/dd/yyyy"));
	}

}