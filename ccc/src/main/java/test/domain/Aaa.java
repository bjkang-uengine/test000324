package test.domain;

import java.util.*;
import lombok.*;
import test.domain.*;
import test.infra.AbstractEvent;

@Data
@ToString
public class Aaa extends AbstractEvent {

    private Long id;
    private String name;
}
