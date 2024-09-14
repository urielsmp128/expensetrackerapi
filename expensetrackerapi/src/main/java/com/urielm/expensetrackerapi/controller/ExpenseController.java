package com.urielm.expensetrackerapi.controller;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExpenseController {

    public String getAllExpenses(){
        return "List of all expenses";
    }
}
