package theKnightAndHisQuests.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Setter
@Getter
public class Knight {
    private String name;
    private Integer strength;
    private Integer honor;
    private Integer gold;
}
