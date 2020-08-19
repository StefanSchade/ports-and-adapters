package com.example.portsAndAdapters.adapter.out.persistence.map;

import com.example.portsAndAdapters.domain.model.aggregate.BacklogItem;
import org.springframework.stereotype.Service;

@Service
public class MapRepoBacklogItem extends GenericMapRepo<BacklogItem, Long> {

}
