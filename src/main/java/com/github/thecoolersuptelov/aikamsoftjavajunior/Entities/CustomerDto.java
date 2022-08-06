package com.github.thecoolersuptelov.aikamsoftjavajunior.Entities;

import java.io.Serializable;
import java.util.Objects;

public class CustomerDto implements Serializable {
    private final String lastName;
    private final String firstName;

    public CustomerDto(String lastName, String firstName) {
        this.lastName = lastName;
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CustomerDto entity = (CustomerDto) o;
        return Objects.equals(this.lastName, entity.lastName) &&
                Objects.equals(this.firstName, entity.firstName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lastName, firstName);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" +
                "lastName = " + lastName + ", " +
                "firstName = " + firstName + ")";
    }
}
