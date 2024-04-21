package com.robatist.backend.backend.exception;

public class SessionNotFoundException extends RuntimeException {
    public SessionNotFoundException(int id) {
        super("Could not find session " + id);
    }
}
