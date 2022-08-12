package com.example.carrentalapplication.Loan;

import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class LoanController {
    private LoanService loanService;

    public LoanController(LoanService loanService){
        this.loanService = loanService;
    }

    public List<Loan> storyOfLoanCarById(Long id){
        return loanService.storyOfLoanCarById(id);
    }

    public List<Loan> showEntireCarLoan(){
        return loanService.showEntireCarLoan();
    }
}
