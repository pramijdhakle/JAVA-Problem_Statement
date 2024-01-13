package com.lead.exception;

import java.util.Collections;
import java.util.List;

public class ErrorConstants {
    public static final String LEAD_NOT_FOUND_ERROR_CODE = "E10011";
    public static final List<String> LEAD_NOT_FOUND_ERROR_MESSAGE = Collections.singletonList("No Lead found with the Mobile Number");

    public static final String LEAD_ALREADY_EXISTS_ERROR_CODE = "E10010";
    public static final List<String> LEAD_ALREADY_EXISTS_ERROR_MESSAGE = Collections.singletonList("Lead Already Exists in the database with the lead id");
}
