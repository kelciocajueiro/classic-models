package com.mycompany.classicmodels.web.controller;

import com.mycompany.classicmodels.domain.model.entity.Customer;
import com.mycompany.classicmodels.domain.model.entity.Order;
import com.mycompany.classicmodels.domain.model.entity.Product;
import com.mycompany.classicmodels.domain.repository.CustomerRepository;
import com.mycompany.classicmodels.domain.repository.OrderRepository;
import com.mycompany.classicmodels.domain.repository.ProductRepository;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import java.io.Serializable;
import java.util.List;

@Getter
@Setter
@Controller
@ViewScoped
public class DataDiscoveryBean implements Serializable {

    private static final long serialVersionUID = 7370123246386688453L;

    private List<Customer> customers;
    private List<Customer> filteredCustomers;
    private Customer selectedCustomer;

    private List<Product> orderedProducts;
    private Product selectedProduct;

    private List<Order> orders;

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private OrderRepository orderRepository;

    @PostConstruct
    public void init() {
        customers = allCustomers();
    }

    private List<Customer> allCustomers() {
        return customerRepository.findAll();
    }

    public void productsBySelectedCustomer() {
        orderedProducts = productRepository.findByCustomerNumber(selectedCustomer.getNumber());
    }

    public void ordersBySelectedProduct() {
        orders = orderRepository.findByProductCode(selectedProduct.getCode());
    }

}
