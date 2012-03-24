/*
 *  Revision Information:
 *  $Id$
 *  $Author$
 *  $DateTime$
 *
 * Copyright ©2012 ESPN.com.  All rights reserved.
 */
package com.espn.api.samples.teatrove;

import org.teatrove.tea.runtime.Context;
import org.teatrove.teaservlet.ApplicationRequest;
import org.teatrove.teaservlet.ApplicationResponse;

import java.util.Arrays;
import java.util.List;

/**
 * Tea functions for using the ESPN API.
 */
public class EspnContext {

    private ApplicationRequest request;
    private ApplicationResponse response;
    private EspnApplication app;

    public EspnContext(ApplicationRequest request, ApplicationResponse response, EspnApplication espnApplication) {
        this.request = request;
        this.response = response;
        this.app = app;
    }

    public List<EspnHeadline> getEspnTopHeadlines() {
        return Arrays.asList(new EspnHeadline(),new EspnHeadline());
    }
}
