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

    public EspnHeadline[] getEspnTopHeadlines() {
        return new EspnHeadline[]{new EspnHeadline()};
    }
}
