## Building a simple app whit basic security connecting to Database (MySQL in this case) using Spring Boot, Spring Security, and REST Service

This application contains an implementation of Auditing and an implementation of a user profile that requires Spring Security

## Please follow the next steps:

1. **Clone the application**

	```bash
	git clone https://github.com/mcorverasoft/spring-security-db-app.git
	cd spring-security-db-app
	```

2. **Create a MySQL database**

	```bash
	create database myapp
	```

3. **Change MySQL username and password as per your MySQL installation**

	+ open `src/main/resources/application.properties` file.

	+ change `spring.datasource.username` and `spring.datasource.password` properties as per your mysql installation


4. **Run the file SpringSecurityBDAppApplicationTests as J Unit (4)**
	
	Run a test unit for create users or roles
	
5. **Run the app**

	You can run the spring boot app by typing the following command -

	```bash
	mvn spring-boot:run
	```
	
	The server will start on port 8081 (please go the aplication.properties file for edit it).
	
6. **Please go to localhost:8081/list-user**
	
	Input email or username and password registered and your table users.
	you will see a list users
	

6. **Please go to localhost:8081/auth-user**

    you will see a full profile of your signed user	
	
	


