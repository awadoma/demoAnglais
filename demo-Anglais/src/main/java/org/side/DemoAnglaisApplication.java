package org.side;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoAnglaisApplication  implements CommandLineRunner{
	@Autowired
	private SectionRepository sectionRepository;
	public static void main(String[] args) {
		SpringApplication.run(DemoAnglaisApplication.class, args);
		
	}
	@Override
	public void run(String... args) throws Exception {
		//System.out.println("hello");
		sectionRepository.save( new Section( "send","You Can send"));
		
		UserInput user = new UserInput();
		 String res =user.userEntrey();
		
		 System.out.println((res));
			//sc.close();
		 List<Section> list= sectionRepository.chercher(res);
		 
		for ( Section  li: list) {
			
			 System.out.println((li));
		}
	}

}
