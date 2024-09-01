package com.nasser.nasserbank.service;

import com.nasser.nasserbank.dto.EmailDetails;

public interface EmailService {
    void sendEmailAlert(EmailDetails emailDetails);
}
