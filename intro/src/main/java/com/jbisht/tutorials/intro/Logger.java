package com.jbisht.tutorials.intro;

import java.util.function.Supplier;

/**
 * @author Jitendra Singh.
 */
public interface Logger {

    void info(Supplier<String> supplier);

    void info(String message);
}
