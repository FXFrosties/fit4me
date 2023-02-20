package ch.fit4me.springbootfit4me.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class Exercise {
    private String name; 
    private String description;
    private Long maxWeight = 20L;
}
