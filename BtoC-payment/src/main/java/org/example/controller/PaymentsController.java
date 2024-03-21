package org.example.controller;

import lombok.RequiredArgsConstructor;
import org.example.service.PaymentsService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class PaymentsController {
    private final PaymentsService reviewService;

    @GetMapping("payment")
    public String test() {
        return reviewService.review();
    }
}