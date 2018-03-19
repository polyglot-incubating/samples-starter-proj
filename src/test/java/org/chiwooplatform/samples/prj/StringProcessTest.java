package org.chiwooplatform.samples.prj;

import static org.junit.Assert.*;

import org.chiwooplatform.samples.prj.StringProcess;
import org.junit.Test;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class StringProcessTest {
    @Test
    public void testHello() throws Exception {
        log.debug("testHello");
        String v = new StringProcess().hello();
        assertEquals("hello", v);
    }
}
