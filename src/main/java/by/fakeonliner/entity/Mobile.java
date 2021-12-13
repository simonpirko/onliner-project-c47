package by.fakeonliner.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class Mobile extends Product {
    private String operationSystem;
    private String displaySize;
    private String processor;
    private String frequency;
    private String displayType;
    private String flashMemory;
    private String color;
    private String mobileType;

}
