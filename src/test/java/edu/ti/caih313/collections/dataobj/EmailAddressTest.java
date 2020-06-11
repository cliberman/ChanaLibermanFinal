package edu.ti.caih313.collections.dataobj;

import org.junit.Test;

import static org.junit.Assert.*;

public class EmailAddressTest {
    //These are worth 2 points each
    //TODO test that null email address is not valid
    @Test
    public void testValidateEmailAddressNull() {
        assertFalse(EmailAddress.validate(null));
    }

    //TODO test that a normal email address is valid
    @Test
    public void testValidateEmailAddressRegular() {
        assertTrue(EmailAddress.validate("chana@gmail.com"));
    }

    //TODO test that missing '@' in address is not valid
    @Test
    public void testValidateEmailAddressNoAt() {
        assertFalse(EmailAddress.validate("chanagmail.com"));
    }

    //TODO test that wrong ending of email address is not valid
    @Test
    public void testValidateEmailAddressWrongEnd() {
        assertFalse(EmailAddress.validate("chana@gmail"));
    }
}