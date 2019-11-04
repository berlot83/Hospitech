package com.molokotech.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RestController;
import com.molokotech.model.Person;

@RestController
public interface PersonRepository extends JpaRepository<Person, Long>{

}
