package com.demo.rules;

import org.junit.rules.ExternalResource;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class SystemOutResource extends ExternalResource {

    private PrintStream consoleSysOut;
    private final ByteArrayOutputStream standardOutContent = new ByteArrayOutputStream();

    @Override
    protected void before() {
        consoleSysOut = System.out;
        System.setOut(new PrintStream(standardOutContent));
    }

    @Override
    protected void after() {
        System.setOut(consoleSysOut);
    }

    public String standardOutputAsString() {
        return standardOutContent.toString();
    }
}
