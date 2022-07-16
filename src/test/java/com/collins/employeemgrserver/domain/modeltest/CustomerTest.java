package com.collins.employeemgrserver.domain.modeltest;

import com.collins.employeemgrserver.domain.model.Customer;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CustomerTest {

    @Test
    @DisplayName("Employee Lombok Constructor test")
    public void constructorTest01(){
        // Given
        Customer customer = new Customer("Test","User","test@user.com" );
        customer.setId(1l);

        // When
        String expected = "1 Test User test@user.com";
        String actual = customer.toString();

        // Then
        Assertions.assertEquals(expected, actual);
    }
}
