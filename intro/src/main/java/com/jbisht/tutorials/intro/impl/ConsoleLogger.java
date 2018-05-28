package com.jbisht.tutorials.intro.impl;

import com.jbisht.tutorials.intro.Logger;

import javax.inject.Singleton;
import java.util.function.Supplier;

/**
 * @author Jitendra Singh.
 */
@Singleton
public class ConsoleLogger implements Logger {

    @Override
    public void info(Supplier<String> supplier) {
        info(supplier.get());
    }

    @Override
    public void info(String message) {
        System.out.println(message);
    }
}
