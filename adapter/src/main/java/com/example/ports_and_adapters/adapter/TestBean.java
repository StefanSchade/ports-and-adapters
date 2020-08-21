package com.example.ports_and_adapters.adapter;

import com.example.ports_and_adapters.application.port.in.command.Command;
import com.example.ports_and_adapters.application.port.in.command.Handler;
import com.example.ports_and_adapters.application.port.in.command.com_sprint_commit_backlogitem.Command_sprint_commit_backlogitem;
import com.example.ports_and_adapters.application.port.in.command.com_sprint_commit_backlogitem.Handler_sprint_commit_backlogitem;
import com.example.ports_and_adapters.application.port.out.persistence.PersistenceAbstraction;
import com.example.ports_and_adapters.domain.model.aggregate.Sprint.BacklogItem;
import com.example.ports_and_adapters.domain.model.aggregate.Sprint.Sprint;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class TestBean {

    private final PersistenceAbstraction<Sprint, Long> sprintPersistenceAbstraction;

    private final PersistenceAbstraction<BacklogItem, Long> backlogItemPersistenceAbstraction;

    public void testcrudservices() {
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
                                      .id(1L)
                                      .remainingStorypoints(1.1)
                                      .build();

        BacklogItem bli2 = BacklogItem.builder()
                                      .name("bli 1")
                                      .id(2L)
                                      .remainingStorypoints(2.2)
                                      .build();

        BacklogItem bli3 = BacklogItem.builder()
                                      .name("bli 1")
                                      .id(3L)
                                      .remainingStorypoints(3.3)
                                      .build();

        sprintPersistenceAbstraction.save(sprint1.getId(), sprint1);
        sprintPersistenceAbstraction.save(sprint2.getId(), sprint2);
        sprintPersistenceAbstraction.save(sprint3.getId(), sprint3);

        backlogItemPersistenceAbstraction.save(bli1.getId(), bli1);
        backlogItemPersistenceAbstraction.save(bli2.getId(), bli2);
        backlogItemPersistenceAbstraction.save(bli3.getId(), bli3);

        Handler handler = new Handler_sprint_commit_backlogitem();
        Command command = Command_sprint_commit_backlogitem.builder()
                                                           .backlogItemid(1L)
                                                           .sprintId(1L)
                                                           .backlogitemRepo(backlogItemPersistenceAbstraction)
                                                           .sprintRepo(sprintPersistenceAbstraction)
                                                           .build();

        System.out.println("wert 1: " + sprintPersistenceAbstraction.findByID(1L)
                                                                      .getRemainingStoryPointsCommited());
        handler.handle(command);

        System.out.println("wert 2: " + sprintPersistenceAbstraction.findByID(1L)
                                                                                .getRemainingStoryPointsCommited());

    }

}
