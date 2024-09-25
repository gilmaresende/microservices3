package com.github.hr_payroll.services;

import com.github.hr_payroll.entities.Payment;
import com.github.hr_payroll.entities.Worker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

@Service
public class PaymentService {

    @Value("${hr-worker.host}")
    private String hostWorker;

    @Autowired
    private RestTemplate restTemplate;

    public Payment getPaymeny(Long idWorker, int days) {
        Map<String, String> params = new HashMap<>();
        params.put("id", idWorker.toString());
        Worker worker = restTemplate.getForObject(String.format("%s/workers/{id}", hostWorker), Worker.class, params);
        return new Payment(worker.getName(), worker.getDailyIncome(), days);
    }
}
