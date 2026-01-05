
package com.example.employee;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class EmployeeTest {
    @Test
    void testEmployeeSettersAndGetters() {
        Employee e = new Employee();
        e.setName("John");
        e.setDepartment("IT");

        assertThat(e.getName()).isEqualTo("John");
        assertThat(e.getDepartment()).isEqualTo("IT");
    }
}
