package com.github.hr_payroll.services;

import com.github.hr_payroll.entities.Payment;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    public Payment getPaymeny(Long idWorker, int days) {
        return new Payment("Bob", 100D, days);
    }
}
