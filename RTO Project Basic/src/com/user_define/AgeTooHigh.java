package com.user_define;

public class AgeTooHigh {

    public static class AgeTooHighException extends RuntimeException {

       
        public AgeTooHighException() {
            super();
        }

        // Constructor that accepts a custom message
        public AgeTooHighException(String message) {
            super(message);
        }
    }
}
