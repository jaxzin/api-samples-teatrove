/*
 *  Revision Information:
 *  $Id$
 *  $Author$
 *  $DateTime$
 *
 * Copyright ©2012 ESPN.com.  All rights reserved.
 */
package com.espn.api.samples.teatrove;

import org.teatrove.teaservlet.Application;
import org.teatrove.teaservlet.ApplicationConfig;
import org.teatrove.teaservlet.ApplicationRequest;
import org.teatrove.teaservlet.ApplicationResponse;

import javax.servlet.ServletException;

/**
 * A Tea Application for using the ESPN API
 */
public class EspnApplication implements Application {

    private ApplicationConfig config;

    public void init(ApplicationConfig config) throws ServletException {
        this.config = config;
    }

    public void destroy() {
        // nothing to do
    }

    public Object createContext(ApplicationRequest request, ApplicationResponse response) {
        return new EspnContext(request, response, this);
    }

    public Class getContextType() {
        return EspnContext.class;
    }

    /**
     * Allow functions in the context get at the initialization parameters.
     * @param param The key of the initial parameter
     * @return The value of the initial parameter
     */
    protected String getInitParameter(String param) {
        return config.getInitParameter(param);
    }
}
