
package com.example.employee;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
class EmployeeRepositoryTest {

    @Autowired
    private EmployeeRepository repository;

    @Test
    void testSaveAndFind() {
        Employee e = new Employee();
        e.setName("Jane");
        e.setDepartment("HR");

        Employee saved = repository.save(e);
        assertThat(repository.findById(saved.getId())).isPresent();
    }
}
