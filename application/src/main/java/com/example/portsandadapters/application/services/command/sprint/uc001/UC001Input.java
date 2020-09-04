package com.example.portsandadapters.application.services.command.sprint.uc001;

import com.example.portsandadapters.ports.inbound.command.CommandInput;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;

@Getter
@Setter(AccessLevel.PUBLIC)
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UC001Input implements CommandInput {

    @NonNull private int number;

}
