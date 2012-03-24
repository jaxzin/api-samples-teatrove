package com.espn.api.samples.teatrove;

import org.junit.Before;
import org.junit.Test;
import org.teatrove.teaservlet.ApplicationRequest;
import org.teatrove.teaservlet.ApplicationResponse;

import java.util.List;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.core.AllOf.allOf;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.mock;

/**
 * Unit tests for EspnContext
 */
public class EspnContextTest {

    EspnContext context;

    @Before
    public void setup() {
        context = new EspnContext(mock(ApplicationRequest.class), mock(ApplicationResponse.class), mock(EspnApplication.class));
    }

//    @Test
    public void shouldReturnHeadlines() {
        assertThat(
                "espn headlines",
                context.getEspnTopHeadlines(),
                    allOf(is(notNullValue()),
                          is(instanceOf(List.class))
                    )
        );
    }
}
