/*
 *  Revision Information:
 *  $Id$
 *  $Author$
 *  $DateTime$
 *
 * Copyright ©2012 ESPN.com.  All rights reserved.
 */
package com.espn.api.samples.teatrove;

import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.node.ObjectNode;
import org.teatrove.tea.runtime.Context;
import org.teatrove.teaservlet.ApplicationRequest;
import org.teatrove.teaservlet.ApplicationResponse;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
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
        this.app = espnApplication;
    }

    public List<EspnHeadline> getEspnTopHeadlines() {
        WebResource resource = app.getRestClient().resource(app.getInitParameter("baseResource"));
        ClientResponse resp = 
            resource.path("sports/news/headlines/top")
                    .queryParam("apiKey", System.getProperty("espn.api.key"))
                    .accept(MediaType.APPLICATION_JSON_TYPE)
                    .get(ClientResponse.class);
        
        if(!resp.getClientResponseStatus().getFamily().equals(Response.Status.Family.SUCCESSFUL)) {
            throw new RuntimeException("Failed: HTTP error code:" + resp.getStatus());
        }

        List<EspnHeadline> headlines = new ArrayList<EspnHeadline>();
        ObjectNode json = resp.getEntity(ObjectNode.class);
        for (JsonNode headlineNodes : json.get("headlines")) {
            if(headlineNodes.has("title") && headlineNodes.has("links")) {
                EspnHeadline headline =
                        new EspnHeadline.Builder()
                                .title(headlineNodes.get("title").asText())
                                .webUrl(headlineNodes.get("links").get("web").get("href").asText())
                                .addImage(new HeadlineImage())
                        .build();
                headlines.add(headline);
            }
        }
        return headlines;
    }
}
