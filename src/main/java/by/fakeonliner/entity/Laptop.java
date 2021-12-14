package by.fakeonliner.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class Laptop extends Product{

    private String type;
    private String videoCard;
    private String processor;
    private String operationSystem;
    private double displaySize;
    private double frequency;
    private int ram;
    private int rom;
}
