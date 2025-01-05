package com.irayspace.page;

import jakarta.inject.Singleton;


@Singleton
public class PageService {

    public Page getPage(String name) {
        final Page mockPage = new Page();
        mockPage.setName(name);
        return mockPage;
    }

}
