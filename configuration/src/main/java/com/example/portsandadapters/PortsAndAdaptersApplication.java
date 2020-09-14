package com.example.portsandadapters;

import org.apache.activemq.artemis.core.config.Configuration;
import org.apache.activemq.artemis.core.config.impl.ConfigurationImpl;
import org.apache.activemq.artemis.core.server.ActiveMQServer;
import org.apache.activemq.artemis.core.server.ActiveMQServers;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PortsAndAdaptersApplication {

    public static void main(String[] args) throws Exception {

        //see https://activemq.apache.org/components/artemis/documentation/1.0.0/embedding-activemq.html
        //see https://activemq.apache.org/components/artemis/documentation/latest/embedding-activemq.html


        Configuration config = new ConfigurationImpl().setPersistenceEnabled(false)
                                                      .setJournalDirectory("target/data/journal")
                                                      .setSecurityEnabled(false)
                                                      .addAcceptorConfiguration("invm", "vm://0");

        ActiveMQServer server = ActiveMQServers.newActiveMQServer(config);

        server.start();

        SpringApplication.run(PortsAndAdaptersApplication.class, args);

    }

}