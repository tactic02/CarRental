package com.example.carrentalapplication.Loan;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LoanService {
    private LoanRepository carRepository;

    public LoanService(LoanRepository carRepository){
        this.carRepository = carRepository;
    }

    public List<Loan> storyOfLoanCarById(long id){
        return carRepository.findLoanByCarId(id);
    }

    public List<Loan> showEntireCarLoan(){
        List<Loan> result = new ArrayList<>();
        carRepository.findAll().forEach(result::add);
        return result;
    }
}
