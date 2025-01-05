package com.irayspace.page;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import jakarta.inject.Inject;


@Controller("/pages")
public class PageController {
    
    @Inject
    private PageService pageService;

    @Get("/{name}")
    public Page getPage(String name) {
        return pageService.getPage(name);
    }

}
