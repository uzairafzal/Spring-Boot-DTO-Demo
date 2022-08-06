package net.javaDto.springdto;

import net.javaDto.springdto.model.*;
import net.javaDto.springdto.repository.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringDtoApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringDtoApplication.class, args);
	}

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private LocationRepository locationRepository;

	@Override
	public void run(String... args) throws Exception{
		Location location = new Location();
		location.setPlace("ISB");
		location.setDescription("ISB is green");
		location.setLongitude(40.5);
		location.setLatitude(30.6);
		locationRepository.save(location);

		User user1 = new User();
		user1.setFirstName("Uzair");
		user1.setLastName("Afzal");
		user1.setEmail("uzairafzal1997@gmail.com");
		user1.setPassword("root");
		user1.setLocation(location);
		userRepository.save(user1);

		User user2 = new User();
		user2.setFirstName("Mustafa");
		user2.setLastName("Ayan");
		user2.setEmail("mstayan@gmail.com");
		user2.setPassword("secret");
		user2.setLocation(location);
		userRepository.save(user2);
	}


}
