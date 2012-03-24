/*
 *  Revision Information:
 *  $Id$
 *  $Author$
 *  $DateTime$
 *
 * Copyright ©2012 ESPN.com.  All rights reserved.
 */
package com.espn.api.samples.teatrove;

import java.util.List;

/**
 * TODO: Add documentation for EspnHeadline
 */
public class EspnHeadline {
    private String webUrl;
    private List<HeadlineImage> images;
    private String title;

    public String getWebUrl() {
        return webUrl;
    }

    public List<HeadlineImage> getImages() {
        return images;
    }

    public String getTitle() {
        return title;
    }
}
