package com.demo;

import com.demo.rules.SystemOutResource;
import org.junit.Rule;
import org.junit.Test;

import static org.junit.Assert.*;

public class MyCLITest {

    @Rule public SystemOutResource systemOutResource = new SystemOutResource();

    @Test
    public void everythingOK() {

        String name = "bar";
        MyCLI cli = new MyCLI();

        cli.sayHello(name);

        assertTrue(systemOutResource.standardOutputAsString().contains(name));
    }
}
