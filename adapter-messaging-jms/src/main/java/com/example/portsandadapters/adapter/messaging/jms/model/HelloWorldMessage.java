package com.example.portsandadapters.adapter.messaging.jms.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.UUID;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class HelloWorldMessage implements Serializable {

    public static final String TEST_QUEUE = "hello_world";

    private static final long serialVersionUID = -4983018151331005782L;

    private UUID id;

    private String message;

}
