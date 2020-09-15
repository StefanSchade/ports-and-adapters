package com.example.portsandadapters.application.command.customer.create;

import com.example.portsandadapters.port.inbound.command.CommandResponse;
import lombok.Data;

@Data
public class CreateCustomerResponse implements CommandResponse {

    private String customerId;

}
