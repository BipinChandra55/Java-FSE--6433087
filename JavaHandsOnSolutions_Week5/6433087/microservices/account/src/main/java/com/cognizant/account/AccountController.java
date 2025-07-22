package com.cognizant.account;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController // Marks this class as a Spring REST Controller
public class AccountController {

    @GetMapping("/accounts/{number}") // Maps HTTP GET requests to /accounts/{number}
    public Map<String, Object> getAccountDetails(@PathVariable String number) {
        // @PathVariable extracts the 'number' from the URL path
        Map<String, Object> accountDetails = new HashMap<>();
        accountDetails.put("number", number);
        accountDetails.put("type", "savings");
        accountDetails.put("balance", 234343);
        return accountDetails; // Spring automatically converts this Map into a JSON response
    }
}