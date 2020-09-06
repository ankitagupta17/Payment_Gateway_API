package com.demo.card;

import com.demo.card.model.Card;
import com.demo.card.model.Transaction;
import org.springframework.stereotype.Repository;

import java.sql.Timestamp;


@Repository
public class TransactionRepo {

    public Transaction getData(Transaction transaction) {

        // logic for storing card details

        Transaction transaction1=new Transaction();
        transaction1.setType(transaction.getType());
        transaction1.setAmount(transaction.getAmount());
        transaction1.setCurrency(transaction.getCurrency());

        Card card=new Card();
        card.setNumber(transaction.getCard().getNumber());
        transaction1.setCard(card);
        transaction1.setAuthorization_code(getAlphaNumericString(12));
        transaction1.setStatus("success");
        transaction1.setTime(new Timestamp(System.currentTimeMillis()));
        return transaction1;
    }


    private String getAlphaNumericString(int n)
    {

        String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
                + "0123456789"
                + "abcdefghijklmnopqrstuvxyz";
        StringBuilder sb = new StringBuilder(n);

        for (int i = 0; i < n; i++) {
            int index
                    = (int)(AlphaNumericString.length()
                    * Math.random());
            sb.append(AlphaNumericString
                    .charAt(index));
        }

        return sb.toString();
    }
}
