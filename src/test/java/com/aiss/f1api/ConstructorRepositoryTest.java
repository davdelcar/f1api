package com.aiss.f1api;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.aiss.f1api.models.ConstructorModel;
import com.aiss.f1api.repositories.ConstructorRepository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)

public class ConstructorRepositoryTest {    

    @Autowired
    private ConstructorRepository repo;
    @Test
	void testSaveConstructor() {
		ConstructorModel Mini = new ConstructorModel(2L,"Mini", 69, 2080);
		repo.save(Mini);
		assertEquals("Mini", Mini.getTeam());
	}
}