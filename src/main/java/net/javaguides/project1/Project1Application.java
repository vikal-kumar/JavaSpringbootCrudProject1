package net.javaguides.project1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import net.javaguides.project1.model.Employee;
import net.javaguides.project1.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Project1Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Project1Application.class, args);
	}

	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public void run(String... args) throws Exception {
		Employee employee = new Employee();
		employee.setFirstName("Ramesh");
		employee.setLastName("Fadatare");
		employee.setEmailId("ramesh@gmail.com");
		employeeRepository.save(employee);

		Employee employee1 = new Employee();
		employee1.setFirstName("John");
		employee1.setLastName("Cena");
		employee1.setEmailId("cena@gmail.com");
		employeeRepository.save(employee1);

		Employee employee3 = new Employee();
		employee3.setFirstName("dhileep");
		employee3.setLastName("don");
		employee3.setEmailId("cena@gmail.com");
		employeeRepository.save(employee3);
	}
}