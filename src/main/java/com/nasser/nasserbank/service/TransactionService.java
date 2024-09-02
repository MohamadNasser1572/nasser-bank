package com.nasser.nasserbank.service;

import com.nasser.nasserbank.dto.TransactionDto;
import com.nasser.nasserbank.entity.Transaction;

public interface TransactionService {
    void saveTransaction(TransactionDto transactionDto);
}
