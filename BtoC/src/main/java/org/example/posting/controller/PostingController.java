package org.example.posting.controller;

import lombok.RequiredArgsConstructor;
import org.example.posting.service.PostingService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class PostingController {
    private final PostingService postingService;

    @GetMapping("posting")
    public String test() {
        return postingService.test();
    }
}