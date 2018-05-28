package com.jbisht.tutorials;

import com.jbisht.tutorials.intro.Logger;
import io.micronaut.context.BeanContext;

/**
 * @author Jitendra Singh.
 */
public class IntroApp {

    public static void main(String[] args) {
        BeanContext context = BeanContext.run();

        Logger logger = context.getBean(Logger.class);

        logger.info("Welcome in Micronaut world!!!!");
    }
}
