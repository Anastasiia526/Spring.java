package theKnightAndHisQuests.realization;

import lombok.AllArgsConstructor;
import lombok.Getter;
import theKnightAndHisQuests.interfaces.Quest;
import theKnightAndHisQuests.model.EscortType;
import theKnightAndHisQuests.model.Knight;
import theKnightAndHisQuests.model.QuestResult;


public class SaveThePrincessQuest implements Quest {


    @Override
    public String getTitle() {
        return "Save the " + EscortType.PRINCESS.name();
    }

    @Override
    public boolean canStart(Knight knight) {
        if(knight.getStrength() >= 100 && knight.getHonor() > 100){
            return true;
        }
        return false;
    }

    @Override
    public QuestResult execute(Knight knight) {
        knight.setStrength(knight.getStrength() + 200);
        knight.setHonor(knight.getHonor() + 300);
        knight.setGold(knight.getGold() + 300);
        return new QuestResult(true, knight.getName() + " saved the " + EscortType.PRINCESS.name());
    }
}
