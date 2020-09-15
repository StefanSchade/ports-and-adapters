package com.example.portsandadapters.application.command.customer.create;

import com.example.portsandadapters.port.inbound.command.CommandRequest;
import lombok.Data;

@Data
public class CreateCustomerRequest implements CommandRequest {

    private String firstName;

    private String lastName;

}
