package com.user_define;

public class AgeTooLow {

    public static class AgeTooLowException extends RuntimeException {

        
        public AgeTooLowException() {
            super();
        }

        // Constructor that accepts a custom message
        public AgeTooLowException(String message) {
            super(message);
        }
    }
}
