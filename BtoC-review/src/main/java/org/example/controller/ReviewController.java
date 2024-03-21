package org.example.controller;

import lombok.RequiredArgsConstructor;
import org.example.service.ReviewService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class ReviewController {
    private final ReviewService reviewService;

    @GetMapping("review")
    public String test() {
        return reviewService.review();
    }
}