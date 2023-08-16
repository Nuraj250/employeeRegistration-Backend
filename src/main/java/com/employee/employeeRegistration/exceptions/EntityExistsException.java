package com.employee.employeeRegistration.exceptions;

public class EntityExistsException extends RuntimeException {
    /**
     * Instantiates a new Entity exists exception.
     *
     * @param id the id
     */
    public EntityExistsException(Long id) {
        super("this ID is alresdy excits  - " + id);
    }

    public EntityExistsException(String property, String value) {
        super("this " + property + " is alresdy excits - " + value);
    }

}
