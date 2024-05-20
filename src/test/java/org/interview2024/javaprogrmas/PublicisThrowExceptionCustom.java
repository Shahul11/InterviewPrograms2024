package org.interview2024.javaprogrmas;

public class PublicisThrowExceptionCustom {

    public static void main(String[] args) {
        String browserName = "dsd";


        if (browserName.equals("Chrome")) {
            System.out.println("Chrome Browser launched");
        } else {

            try {
                throw new CustomBrowserException("Unsupported Browser");
            } catch (CustomBrowserException e) {
                System.out.println(e.getMessage());
            }
        }

    }

    static class CustomBrowserException extends Exception {
        public CustomBrowserException(String msg) {
            super(msg);
        }

    }

}
