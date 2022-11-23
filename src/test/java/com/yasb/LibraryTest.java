package com.yasb;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.not;
import static org.hamcrest.Matchers.nullValue;
import static org.mockito.Mockito.mock;

import org.junit.jupiter.api.Test;

class LibraryTest {
    @Test 
    void someLibraryMethodReturnsTrue() {
        Library classUnderTest = new Library();
        assertTrue(classUnderTest.someLibraryMethod(), "someLibraryMethod should return 'true'");
    }

    @Test
    void someTestWithHamcrest() {
        assertThat(true, is(true));
    }

    @Test
    void someTestWithMockito() {
        Library classUnderTestMock = mock(Library.class);
        assertThat(classUnderTestMock, not(nullValue()));
    }

}
