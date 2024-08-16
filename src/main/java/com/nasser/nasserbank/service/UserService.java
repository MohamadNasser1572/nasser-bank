package com.nasser.nasserbank.service;

import com.nasser.nasserbank.dto.BankResponse;
import com.nasser.nasserbank.dto.UserRequest;

public interface UserService {
    BankResponse createAccount(UserRequest userRequest);
}
