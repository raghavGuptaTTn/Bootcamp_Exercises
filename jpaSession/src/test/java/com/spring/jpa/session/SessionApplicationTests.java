package com.spring.jpa.session;

import com.spring.jpa.session2.entities.Customer;
import com.spring.jpa.session2.entities.PhoneNumber;
import com.spring.jpa.session2.repos.CustomerRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.util.*;

@SpringBootTest
class SessionApplicationTests {

    @Autowired
    CustomerRepository repository;

    @Test
    public void contextLoads(){

    }

    @Test
    public void testCreateCustomer(){

        Customer customer = new Customer("ramesh");

        PhoneNumber ph1 = new PhoneNumber("9000000005", "cell");
        PhoneNumber ph2 = new PhoneNumber("9000000000", "work");
        PhoneNumber ph3 = new PhoneNumber("9007777777", "home");

        customer.addPhoneNumber(ph1);
//        customer.addPhoneNumber(ph2);

        repository.save(customer);
    }

    @Test
//    @Transactional  // from spring - for lazy
    public void testLoadCustomer(){
        Customer customer = repository.findById(11L).get();
        System.out.println(customer.getName());

        Set<PhoneNumber> numbers = customer.getNumbers();
                numbers.stream()
                .forEach(e-> System.out.println(e));
    }

    @Test
    @Transactional
    public void testUpdateCustomer(){
        Customer customer = repository.findById(8L).get();
        customer.setName("john bush");

        Set<PhoneNumber> numbers = customer.getNumbers();
        numbers.forEach(e->e.setType("cell"));
        repository.save(customer);
    }

    @Test
    public void testDelete(){
        repository.deleteById(5L);
    }

//    @Test
//    public void testCreate(){
//        Student student = new Student();
//        student.setFname("raghav");
//        student.setLname("gupta");
//        student.setScore(1000);
//
//        repository.save(student);
//    }

//    @Test
//    public void testFindAllStudents() {
//        repository.findAllStudents();
//    }

//    @Test
//    public void testFindAllStudents() {
//        repository.findAllStudents(PageRequest.of(0,1));
//    }

//    @Test
//    public void testFindAllStudentsPartial(){
//        repository.findAllStudentsPartial();
//    }

//    @Test
//    public void testFindAllStudentsByName(){
//        repository.findAllStudentsByName("raghav");
//    }

//    @Test
//    public void testDeleteEmp(){
//        repository.delEmp();
//    }


















    /*

	@Autowired
	ProductRepository repository;

	@Test
	void contextLoads() {

	}

	@Test
	public void testCreate(){
		Product product = new Product();
		product.setId(1);
		product.setName("iphone x");
		product.setDesc("awesome");
		product.setPrice(100d);

		repository.save(product);
	}

	@Test
	public void testUpdate(){
		Optional<Product> product = repository.findById(1);
		product.get().setName("one plus 6t");
		repository.save(product.get());
	}

	@Test
	public void testRead(){
		Optional<Product> product = repository.findById(1);
		System.out.println(">>>>>>>>>>>>>>>>> object found = " + product.get().getDesc());
	}

	@Test
	public void testDelete(){
		repository.deleteById(1);
	}

	@Test
	public void testDelete_withExists(){
		if(repository.existsById(1)){
			System.out.println("object deleted");
			repository.deleteById(1);
		}
	}

	@Test
	public void countDelete(){
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>. total count = "+ repository.count());
	}

//	@Test
//	public void testFindByIdsIn(){
//		List<Product> products = repository.findByIdIn(Arrays.asList(1, 2, 3));
//		products.forEach(p -> System.out.println(p.getName()));
//	}

//	@Test
//	public void testFindAllPaging(){
//
//	}

//	@Test
//	public void findAllSorting(){
//		repository.findAll(Sort.by(Sort.Direction.ASC, "price")).forEach(p-> System.out.println(p.getName()));
//	}


     */

}
