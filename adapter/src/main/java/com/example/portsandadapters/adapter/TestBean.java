package com.example.portsandadapters.adapter;

import com.example.portsandadapters.application.domainstories.command.sprint.commitbacklogitem.CommandSprintCommitBacklogItem;
import com.example.portsandadapters.application.domainstories.command.sprint.commitbacklogitem.HandlerSprintCommitBacklogItem;
import com.example.portsandadapters.application.port.in.command.CommandAbstraction;
import com.example.portsandadapters.application.port.in.command.HandlerAbstraction;
import com.example.portsandadapters.application.port.out.persistence.PersistenceAbstraction;
import com.example.portsandadapters.domain.model.aggregate.sprint.BacklogItem;
import com.example.portsandadapters.domain.model.aggregate.sprint.Sprint;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeoutException;

@Slf4j
@Component
@RequiredArgsConstructor
public class TestBean {

    private final PersistenceAbstraction<Sprint, Long> sprintPersistenceAbstraction;

    public void test()  {

        Sprint backlog = Sprint.builder()
                               .name("Backlog")
                               .id(0L)
                               .build();

        Sprint sprint1 = Sprint.builder()
                               .name("Testsprint 01")
                               .id(1L)
                               .build();

        Sprint sprint2 = Sprint.builder()
                               .name("Testsprint 02")
                               .id(2L)
                               .build();

        Sprint sprint3 = Sprint.builder()
                               .name("Testsprint 03")
                               .id(3L)
                               .build();

        BacklogItem bli1 = BacklogItem.builder()
                                      .name("bli 1")
                                      .remainingStorypoints(1.1)
                                      .id(1L)
                                      .build();

        BacklogItem bli2 = BacklogItem.builder()
                                      .name("bli 1")
                                      .remainingStorypoints(2.2)
                                      .id(2L)
                                      .build();

        BacklogItem bli3 = BacklogItem.builder()
                                      .name("bli 1")
                                      .remainingStorypoints(3.3)
                                      .id(3L)
                                      .build();

        backlog.addBacklogItem(bli1);
        backlog.addBacklogItem(bli2);
        backlog.addBacklogItem(bli3);


        sprintPersistenceAbstraction.save(0L,backlog);
        sprintPersistenceAbstraction.save(1L,sprint1);
        sprintPersistenceAbstraction.save(2L,sprint2);
        sprintPersistenceAbstraction.save(3L,sprint3);


        HandlerAbstraction handlerAbstraction = new HandlerSprintCommitBacklogItem(sprintPersistenceAbstraction);

        CommandAbstraction command = CommandSprintCommitBacklogItem.builder()
                                                                   .backlogItemid(1L)
                                                                   .sprintId(1L)
                                                                   .build();


        System.out.println("wert 1: " + sprintPersistenceAbstraction.findByID(1L)
                                                                      .getRemainingStoryPointsCommited());


        log.info("got here");
        try {
            handlerAbstraction.handle(command);
        } catch (TimeoutException e) {
            e.printStackTrace();
        }

        System.out.println("wert 2: " + sprintPersistenceAbstraction.findByID(1L)
                                                                                .getRemainingStoryPointsCommited());

    }

}
