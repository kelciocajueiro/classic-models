package com.mycompany.classicmodels.web.controller;

import lombok.Getter;
import org.springframework.stereotype.Controller;

import javax.enterprise.context.SessionScoped;
import javax.faces.context.FacesContext;
import java.io.Serializable;
import java.util.Locale;

@Controller
@SessionScoped
public class LocaleBean implements Serializable {

    private static final long serialVersionUID = 805448567721641975L;

    @Getter
    private String language = Locale.CANADA.getLanguage();

    @Getter
    private Locale locale = new Locale(language);

    public void setLanguage(String language) {
        this.language = language;
        locale = new Locale(language);
        FacesContext.getCurrentInstance().getViewRoot().setLocale(locale);
    }

}