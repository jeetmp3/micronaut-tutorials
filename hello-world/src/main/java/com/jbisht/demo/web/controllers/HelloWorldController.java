package com.jbisht.demo.web.controllers;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.reactivex.Single;

/**
 * @author Jitendra Singh.
 */
@Controller("/")
public class HelloWorldController {

    @Get("/hello/{name}")
    public String hello(String name) {
        return "Hello "+name;
    }

    @Get("/hello/rx/{name}")
    public Single<String> helloRx(String name) {
        return Single.just("Hello "+name);
    }
}
