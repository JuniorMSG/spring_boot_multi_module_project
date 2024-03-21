package org.example.review.controller;

import lombok.RequiredArgsConstructor;
import org.example.review.service.ReviewService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class ReviewController {
    private final ReviewService reviewService;

    @GetMapping("review")
    public String test() {
        System.out.println("8080: Test Controller Hello world!");
        return reviewService.review();
    }
}