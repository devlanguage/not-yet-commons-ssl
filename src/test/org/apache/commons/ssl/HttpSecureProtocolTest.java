package org.apache.commons.ssl;

import org.junit.Test;

import java.io.IOException;
import java.security.GeneralSecurityException;

import static org.junit.Assert.*;

/**
 * @author rpuch
 */
public class HttpSecureProtocolTest {
    @Test
    public void testInstantiation() throws GeneralSecurityException, IOException {
        new HttpSecureProtocol();
    }
}