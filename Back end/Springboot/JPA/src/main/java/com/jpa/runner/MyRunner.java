package com.jpa.runner;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.jpa.entity.Passenger;
import com.jpa.repository.PassengerRepository;

@Component
public class MyRunner implements CommandLineRunner {

	@Autowired
	PassengerRepository passengerRepo;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
          
		  Passenger p = new Passenger();
		  p.setPassengerId(106);
	      p.setFirstName("P");
	      p.setLastName("S");
	      p.setEmailId("SP@gmail.com");
	      p.setSeatno(6);
	      passengerRepo.save(p);
	      
	      //display all passenger records
	      List<Passenger> passengerList = passengerRepo.findAll();
			passengerList.forEach(passenger->{
				System.out.println(passenger.getFirstName()+"------"+passenger.getLastName()+"-----"+passenger.getEmailId());
			});
			//display data based on id
			Optional<Passenger> opt=passengerRepo.findById(106);
			Passenger p1 = opt.get();
			System.out.println(p1.getFirstName()+"-----"+p1.getLastName());
			
			//display data based on methodName
			Passenger p2=passengerRepo.findByEmailId("Sunny@gmail.com");
			System.out.println(p);
			System.err.println(p2.getFirstName()+"----"+p2.getLastName());
			
			//dispay data based on first Name and last Name
			List<Passenger> p3 = passengerRepo.getPassengers("Sunny", "Nallapu");
			p3.forEach(passenger->{
				System.out.println("Passenger Email Id:....."+passenger.getEmailId());
			});
			
			List<Passenger> p4 = passengerRepo.findbyFirstName("Deepa");
			
			p4.forEach(passenger->{
				System.out.println("Passenger Email Id:....."+passenger.getEmailId());
				System.err.println(passenger.getLastName());
			});
			
	      
		}
}
