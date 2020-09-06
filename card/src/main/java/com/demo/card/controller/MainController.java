package com.demo.card.controller;

import com.demo.card.TransactionService;
import com.demo.card.model.Transaction;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @Autowired
    private TransactionService transactionService;

    @PostMapping("/card")
    private ResponseEntity<Transaction> getCardData(@NotNull @RequestBody Transaction transaction) {
            return new ResponseEntity<>(transactionService.getTransactionData(transaction),
                    HttpStatus.CREATED);
    }
}
