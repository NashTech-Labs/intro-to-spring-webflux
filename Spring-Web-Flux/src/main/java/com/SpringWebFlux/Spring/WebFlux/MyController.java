package com.SpringWebFlux.Spring.WebFlux;

import org.reactivestreams.Publisher;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

/**
 * The type My controller.
 */
@RestController
public class MyController {

    /**
     * Home publisher.
     *
     * @return the publisher
     */
    @GetMapping("/")
    public Publisher<String> home() {

        return Mono.just("Home page");
    }
}










