package com.mycompany.classicmodels.web.controller;

import com.mycompany.classicmodels.infra.util.Pages;
import org.springframework.stereotype.Controller;

import javax.enterprise.context.ApplicationScoped;

@Controller
@ApplicationScoped
public class PagesBean {

    public String dashboard() {
        return Pages.DASHBOARD.getUrl();
    }

    public String customers() {
        return Pages.CUSTOMERS.getUrl();
    }

    public String employees() {
        return Pages.EMPLOYEES.getUrl();
    }

}