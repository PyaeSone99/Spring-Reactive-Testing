package com.example.mongodbreactive.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Value;

@Value
public class PostMedel {

    String body;
    String title;
    String id;
    String userId;

    @JsonCreator
    public PostMedel(@JsonProperty("body") String body,
                     @JsonProperty("title") String title,
                     @JsonProperty("id") String id,
                     @JsonProperty("userId") String userId) {
        this.body = body;
        this.title = title;
        this.id = id;
        this.userId = userId;
    }
}
