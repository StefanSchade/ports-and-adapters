package com.example.portsandadapters.configuration;

import com.example.portsandadapters.application.services.command.sprint.uc001.UC001Service;
import com.example.portsandadapters.application.services.command.sprint.uc001.UC001Input;
import com.example.portsandadapters.application.port.in.command.CommandHandler;
import com.example.portsandadapters.application.port.in.command.CommandInput;
import com.example.portsandadapters.application.port.in.command.impl.RuntimeExceptionDecorator;
import com.example.portsandadapters.application.port.out.persistence.PersistenceAbstraction;
import com.example.portsandadapters.domain.model.aggregate.sprint.BacklogItem;
import com.example.portsandadapters.domain.model.aggregate.sprint.Sprint;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@RequiredArgsConstructor
public class TestBean {

    private final PersistenceAbstraction<Sprint, Long> sprintPersistenceAbstraction;

    public void test() {

        Sprint backlog = Sprint.builder()
                               .name("Backlog")
                               .build();

        Sprint sprint1 = Sprint.builder()
                               .name("Testsprint 01")
                               .build();

        Sprint sprint2 = Sprint.builder()
                               .name("Testsprint 02")
                               .build();

        Sprint sprint3 = Sprint.builder()
                               .name("Testsprint 03")
                               .build();

        BacklogItem bli1 = BacklogItem.builder()
                                      .name("bli 1")
                                      .remainingStorypoints(1.1)
                                      .build();

        BacklogItem bli2 = BacklogItem.builder()
                                      .name("bli 1")
                                      .remainingStorypoints(2.2)
                                      .build();

        BacklogItem bli3 = BacklogItem.builder()
                                      .name("bli 1")
                                      .remainingStorypoints(3.3)
                                      .build();

        backlog.addBacklogItem(bli1);
        backlog.addBacklogItem(bli2);
        backlog.addBacklogItem(bli3);

        sprintPersistenceAbstraction.save(backlog);
        sprintPersistenceAbstraction.save(sprint1);
        sprintPersistenceAbstraction.save(sprint2);
        sprintPersistenceAbstraction.save(sprint3);

        CommandHandler commandHandler =
                new RuntimeExceptionDecorator(new UC001Service(sprintPersistenceAbstraction));
        CommandInput command = UC001Input.builder()
                                         .name("abc")
                                         .build();

        log.info("start processing");

        commandHandler.process(command);


    }

}
