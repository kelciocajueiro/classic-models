package com.mycompany.classicmodels.web.controller;

import com.mycompany.classicmodels.web.primefaces.CustomerLazyDataModel;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import java.io.Serializable;

@Controller
@ViewScoped
public class CustomerBean implements Serializable {

    private static final long serialVersionUID = -324819096492864397L;

    @Getter @Setter
    @Autowired
    private CustomerLazyDataModel customerLazyDataModel;

    @PostConstruct
    public void init() {

    }

}
