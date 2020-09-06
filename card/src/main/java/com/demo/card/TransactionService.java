package com.demo.card;

import com.demo.card.model.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

@Service
public class TransactionService {
    @Autowired
    private TransactionRepo transactionRepo;

    public Transaction getTransactionData(Transaction transaction) {
        if (!Validations.isNumber(transaction.getAmount())){
            throw new CustomException("Amount should be in digits",
                    HttpStatus.BAD_REQUEST);
        }else if (!Validations.isNumber(transaction.getCard().getCvv())){
            throw new CustomException("Cvv should be in digits",
                    HttpStatus.BAD_REQUEST);
        }else if (!Validations.isNumber(transaction.getCard().getExpirationMonth())){
            throw new CustomException("month should be in digits",
                    HttpStatus.BAD_REQUEST);
        }else if (!Validations.isNumber(transaction.getCard().getExpirationYear())){
            throw new CustomException("year should be in digits",
                    HttpStatus.BAD_REQUEST);
        }else if (!Validations.isNumber(transaction.getCard().getNumber())) {
            throw new CustomException("card number should be in digits",
                    HttpStatus.BAD_REQUEST);
        } else if (transaction.getCard().getNumber().length()!=16){
            throw new CustomException("Card number should be of 16 digits",HttpStatus.BAD_REQUEST);
        }
        return transactionRepo.getData(transaction);
    }
}
