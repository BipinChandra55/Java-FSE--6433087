package com.cognizant.loan;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController // Marks this class as a Spring REST Controller
public class LoanController {

    @GetMapping("/loans/{number}") // Maps HTTP GET requests to /loans/{number}
    public Map<String, Object> getLoanDetails(@PathVariable String number) {
        Map<String, Object> loanDetails = new HashMap<>();
        loanDetails.put("number", number);
        loanDetails.put("type", "car");
        loanDetails.put("loan", 400000);
        loanDetails.put("emi", 3258);
        loanDetails.put("tenure", 18);
        return loanDetails; // Spring automatically converts this Map into a JSON response
    }
}