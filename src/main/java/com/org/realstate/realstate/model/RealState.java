package com.org.realstate.realstate.model;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection="RealState")
public class RealState {
    private String buildingName;
    private Integer floors;
    private String Location;
    private Integer distance;
}
