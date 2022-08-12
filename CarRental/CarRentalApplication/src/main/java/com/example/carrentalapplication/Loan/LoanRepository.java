package com.example.carrentalapplication.Loan;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface LoanRepository extends CrudRepository<Loan, Long> {

    @Query("SELECT l.id, l.carId, l.clientId, l.beginningOfLoan, l.endOfLoan FROM Loan l WHERE l.carId = ?1")
    public List<Loan> findLoanByCarId(long carId);
}
