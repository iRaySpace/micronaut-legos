package com.irayspace.page;

import io.micronaut.serde.annotation.Serdeable;
import lombok.Data;


@Data
@Serdeable
public class Page {

    private String name;

}
