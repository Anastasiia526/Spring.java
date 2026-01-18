package theKnightAndHisQuests.realization;

import lombok.*;
import theKnightAndHisQuests.interfaces.Quest;
import theKnightAndHisQuests.model.Knight;
import theKnightAndHisQuests.model.QuestResult;


@AllArgsConstructor
@Getter
@Setter
public class KillTheDragonQuest implements Quest {
private String dragon;
private String weapon;
private Integer strength;


    @Override
    public String getTitle() {
        return "Kill " + dragon;
    }

    @Override
    public boolean canStart(Knight knight) {
        if(knight.getStrength() >= strength){
            return true;
        }
        return false;
    }

    @Override
    public QuestResult execute(Knight knight) {
        knight.setGold(knight.getGold() + 500);
        knight.setStrength(knight.getStrength() + 50);
        return new QuestResult(true, knight.getName() + " killed the dragon!");
    }
}
