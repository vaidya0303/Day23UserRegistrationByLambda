package com.day23;
/**
 * UC1 :- As a User need to enter a valid First Name
 *        - First name starts with Cap and has minimum 3 characters
 * UC2 :- As a User need to enter a valid Last Name
 *        - Last name starts with Cap and has minimum 3 character
 * UC3 :- As a User need to enter  a valid email
 *        - E.g. abc.xyz@bl.co.in
 *        - Email has 3 mandatory parts (abc, bl& co) and 2 optional (xyz & in) with precise @ and . positions
 */

/**
 * import matcher class and pattern class
 */

import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 * create a class name as UserRegistration
 */
public class UserRegistration {

    /**
     * Create a method name as firstName, this method is boolean type that means its return op is true or false
     * type, also this is parameterized method
     *
     * @param firstName
     * @return firstname matched the regex
     */
    public boolean firstName(String firstName) {
        /**
         * Regex to check valid firstname
         * 1) First name starts with Cap and has minimum 3 characters
         */
        String regex = "^[A-Z]{1}[a-z]{3,}";
        /**
         * First, the pattern is created using the Pattern.compile() method
         * The first parameter indicates which pattern is being searched for
         */
        Pattern pattern = Pattern.compile(regex);
        /**
         * The matcher() method is used to search for the pattern in a string.
         * It returns a Matcher object which contains information about the search that was performed.
         */
        Matcher match = pattern.matcher(firstName);
        /**
         * Return if the firsName matched the Regex
         */
        return match.matches();
    }

    /**
     * Create a method name as lastName, this method is boolean type that means its return op is true or false
     * type, also this is parameterized method
     *
     * @param lastName
     * @return userlastname matched the Regex
     */

    public boolean lastName(String lastName) {
        /**
         *  Regex to check valid userlastname.
         *  1) Last name starts with Cap and has minimum 3 character
         */
        String regex = "^[A-Z]{1}[a-z]{3,}";
        /**
         *  Compile the Regex
         */
        Pattern pattern = Pattern.compile(regex);
        /**
         * Pattern class contains matcher() method to find matching between given userlastname
         * and regular expression.
         */
        Matcher matcher = pattern.matcher(lastName);
        /**
         * Return if the userlastname matched the Regex
         */
        return matcher.matches();
    }

    /**
     * Create a method name as emailAddress, this method is boolean type that means its return op is true or false
     * type, also this is parameterized method
     * @param email
     * @return useremail matched the Regex
     */
    public boolean emailAddress(String email) {
        /**
         * regex pattern for email
         * 1)must contain character before @
         * 2)must contain @ symbol after char
         * 3)must contain char after @
         * 4)must contain "."  symbol before com or in
         */
        String regex = "^[a-zA-Z0-9]+([+_.-][a-zA-Z0-9]+)*[@][a-zA-Z0-9]+[.][a-zA-Z]{2,4}([.][a-zA-Z]{2,4})?";
        /**
         * Compile the Regex
         */
        Pattern pattern = Pattern.compile(regex);
        /**
         * Pattern class contains matcher() method to find matching between given useremail
         * and regular expression.
         */
        Matcher matcher = pattern.matcher(email);
        /**
         * Return if the useremail matched the Regex
         */
        return matcher.matches();
    }

}