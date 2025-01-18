package com.irayspacii;

import java.util.HashMap;
import java.util.Map;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.runtime.server.EmbeddedServer;
import io.micronaut.views.View;


@Controller
public class AppController {

    protected final String host;

    public AppController(EmbeddedServer embeddedServer) {
        this.host = embeddedServer.getHost();
    }

    @View("index")
    @Get
    public Map<String, Object> getIndex() {
        final Map<String, Object> data = new HashMap<String, Object>();
        data.put("title", "You are viewing " + this.host);
        return data;
    }

}