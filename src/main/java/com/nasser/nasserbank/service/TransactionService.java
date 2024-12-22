package com.nasser.nasserbank.service;

import com.nasser.nasserbank.dto.TransactionDto;

public interface TransactionService {
    void saveTransaction(TransactionDto transactionDto);
}
