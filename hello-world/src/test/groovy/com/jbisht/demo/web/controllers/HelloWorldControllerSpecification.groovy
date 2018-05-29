package com.jbisht.demo.web.controllers

import io.micronaut.context.ApplicationContext
import io.micronaut.runtime.server.EmbeddedServer
import spock.lang.AutoCleanup
import spock.lang.Shared
import spock.lang.Specification

/**
 * @author Jitendra Singh.
 */
class HelloWorldControllerSpecification extends Specification {

    @Shared @AutoCleanup EmbeddedServer server =
            ApplicationContext.run(EmbeddedServer)

    @Shared HelloWorldClient client = server.applicationContext.getBean(HelloWorldClient)

    def "Test hello world"() {
        expect:
            client.hello("Jitendra") == "Hello Jitendra"
    }

    def "Test hello world reactive"() {
        expect:
        client.helloRx("Jitendra").blockingGet() == "Hello Jitendra"
    }

}
