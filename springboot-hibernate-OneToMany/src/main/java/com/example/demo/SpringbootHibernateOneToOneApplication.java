package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.entity1.Library;
import com.example.demo.entity1.Student;
import com.example.demo.repository.LibraryRepository;
import com.example.demo.repository.StudentRepository;

@SpringBootApplication
public class SpringbootHibernateOneToOneApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootHibernateOneToOneApplication.class, args);
	}

	/*
	 * @Autowired private OrderRepository orderRepository;
	 * 
	 * @Autowired private AddressRepository addressRepository;
	 */
    @Autowired
	private StudentRepository studentRepository;
	
    @Autowired
	private LibraryRepository libraryRepository;
	
	@Override
	public void run(String... args) throws Exception {

		/*
		 * Order ord = new Order(); ord.setId(1); ord.setStatus("delivered");
		 * 
		 * Address adr = new Address(); adr.setId(1); adr.setCity("kadapa");
		 * adr.setState("Ap");
		 * 
		 * // ord.setBillingAddress(adr); adr.setOr(ord);
		 * 
		 * System.out.println("---------------------------------");
		 * orderRepository.save(ord); addressRepository.save(adr);
		 */

		System.out.println("************************************************************");

		Library lib = new Library();
		lib.setId(101);
		lib.setName("social");

		Library lib1 = new Library();
		lib1.setId(102);
		lib1.setName("maths");

		ArrayList<Library> list = new ArrayList<Library>();
		System.out.println("------------------------------");
		list.add(lib);
		list.add(lib1);

		Student stu = new Student();
		stu.setId(105);
		stu.setName("Sathis");
		stu.setBooks_issued(list);
		
		Student stu1 = new Student();
		stu1.setId(104);
		stu1.setName("sat");
		stu1.setBooks_issued(list);
		
      studentRepository.save(stu);
      studentRepository.save(stu1);
      System.out.println("tyewghbjceuvybejhwvbeourjevnkdsjcewhruvewbv");
      libraryRepository.saveAll(list);
      
	}

}
