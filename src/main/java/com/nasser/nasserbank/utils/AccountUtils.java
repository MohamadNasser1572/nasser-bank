package com.nasser.nasserbank.utils;

import java.time.Year;

public class AccountUtils {

    public static final String ACCOUNT_EXISTS_CODE = "001";
    public static final String ACCOUNT_EXISTS_MESSAGE = "This user has already an account created.";
    public static final String ACCOUNT_CREATION_SUCCESS = "002";
    public static final String ACCOUNT_CREATION_MESSAGE = "Account has been successfully created.";
    public static final String ACCOUNT_NOT_EXISTS_CODE = "003";
    public static final String ACCOUNT_NOT_EXISTS_MESSAGE = "User with the provided account number does not exist.";
    public static final String ACCOUNT_FOUND_CODE = "004";
    public static final String ACCOUNT_FOUND_SUCCESS = "User account found.";

    public static String generateAccountNumber() {
        //2024 + randomSixDigits

        Year currentYear = Year.now();
        int min = 100000;
        int max = 999999;


        //generate a random number between min and max
        int randNumber = (int) Math.floor(Math.random() * (max - min + 1) + min);
        //convert the current and randomNumber to strings, then concatenate them

        String year = String.valueOf(currentYear);
        String randomNumber = String.valueOf(randNumber);
        StringBuilder accountNumber = new StringBuilder();

        return accountNumber.append(year).append(randomNumber).toString();
    }
}
