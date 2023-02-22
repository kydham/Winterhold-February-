package com.winterhold.Entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "Loan")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

public class Loan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    private Long id;

    @Column(name = "CustomerNumber")
    private String customerNumber;

    @Column(name = "BookCode")
    private String bookCode;

    @Column(name = "LoanDate")
    private LocalDate loanDate;

    @Column(name = "DueDate")
    private LocalDate dueDate;

    @Column(name = "ReturnDate")
    private LocalDate returnDate;

    @Column(name = "note")
    private String note;

    @JoinColumn(name = "CustomerNumber", insertable = false, updatable = false)
    private Customer customer;
    @JoinColumn(name = "BookCode", insertable = false, updatable = false)
    private Book book;

    public Loan(Long id,
                String customerNumber,
                String bookCode,
                LocalDate loanDate,
                LocalDate dueDate,
                LocalDate returnDate,
                String note) {
        this.id = id;
        this.customerNumber = customerNumber;
        this.bookCode = bookCode;
        this.loanDate = loanDate;
        this.dueDate = dueDate;
        this.returnDate = returnDate;
        this.note = note;
    }
}
