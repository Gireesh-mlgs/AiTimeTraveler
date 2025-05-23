package com.example.aitimetraveler.repository;

	import org.springframework.data.jpa.repository.JpaRepository;

	import com.example.aitimetraveler.model.User;

	public interface UserRepository extends JpaRepository<User, Integer> {
	    // No need to write any code here — Spring Boot handles everything!
	}


