package es.upm.miw.spai.ecp2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class UserTest {
    
    private User user;

    @Before
    public void setUp() throws Exception {
        user = new User(1, "John", "Doe");
    }

    @Test
    public final void testUser() {
        assertEquals(1, user.getNumber());
        assertEquals("John", user.getName());
        assertEquals("Doe", user.getFamilyName());
    }

    @Test
    public final void testGetNumber() {
        assertEquals(1, user.getNumber());
    }

    @Test
    public final void testGetName() {
        assertEquals("John", user.getName());
    }

    @Test
    public final void testGetFamilyName() {
        assertEquals("Doe", user.getFamilyName());
    }

    @Test
    public final void testFullName() {
        assertEquals("John Doe", user.fullName());
    }

    @Test
    public final void testInitials() {
        assertEquals("J.", user.initials());
    }

    @Test
    public final void testNameToUpperCase() {
        assertEquals("JOHN", user.nameToUpperCase());
    }
}
