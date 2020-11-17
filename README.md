# Classic Models

Classic Models is a software which scale models of a classic cars database. It contains typical business data such as customers, products, sales orders, sales order line items, etc.

## Technologies

* Java 8
* JoinFaces 4
* Spring Boot 2.2.1 (Spring Data, Security)
* Primefaces 7.0
* Primefaces Extensions 7.0.3
* Lombok 1.18.10
* CDI 2.0
* Flyway 6.0.8
* QueryDSL 4.2.2
* Mapstruct 1.3.1.Final
* Passay 1.5.0
* MySQL
* Apache Tomcat 9.0.30

## Database

The MySQL sample database schema consists of the following tables:

* **Customers:** stores customer’s data.
* **Products:** stores a list of scale model cars.
* **ProductLines:** stores a list of product line categories.
* **Orders:** stores sales orders placed by customers.
* **OrderDetails:** stores sales order line items for each sales order.
* **Payments:** stores payments made by customers based on their accounts.
* **Employees:** stores all employee information as well as the organization structure such as who reports to whom.
* **Offices:** stores sales office data.

![GitHub Logo](https://www.mysqltutorial.org/wp-content/uploads/2009/12/MySQL-Sample-Database-Schema.png)

You can get more information and download a base version of the database here: [MySQL Sample Database](https://www.mysqltutorial.org/mysql-sample-database.aspx)

## How to Build
**Under construction**

## Next steps

* Finish this monolithic application
* Add an User/Role/Permission feature to the application
* Add Docker
* Implement a CI/CD structure
* Create a REST API version (another project)
* Create a Angular client
