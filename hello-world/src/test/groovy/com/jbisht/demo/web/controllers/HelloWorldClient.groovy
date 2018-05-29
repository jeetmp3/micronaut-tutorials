package com.jbisht.demo.web.controllers

import io.micronaut.http.annotation.Get
import io.micronaut.http.client.Client
import io.reactivex.Single

/**
 * @author Jitendra Singh.
 */
@Client("/")
interface HelloWorldClient {

    @Get("/hello/{name}")
    String hello(String name)

    @Get("/hello/rx/{name}")
    Single<String> helloRx(String name)
}
