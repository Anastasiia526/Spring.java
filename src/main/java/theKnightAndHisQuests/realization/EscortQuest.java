package theKnightAndHisQuests.realization;

import lombok.AllArgsConstructor;
import lombok.Getter;
import theKnightAndHisQuests.interfaces.Quest;
import theKnightAndHisQuests.model.EscortType;
import theKnightAndHisQuests.model.Knight;
import theKnightAndHisQuests.model.QuestResult;

@AllArgsConstructor
@Getter
public class EscortQuest implements Quest {
    private EscortType escortType;


    @Override
    public String getTitle() {
        return "Escort the " + escortType;
    }

    @Override
    public boolean canStart(Knight knight) {
        if(knight.getHonor() >= 100 && knight.getStrength() >= 100) {
            return true;
        }
        return false;
    }

    @Override
    public QuestResult execute(Knight knight) {
        knight.setHonor(knight.getHonor() + 30);
        knight.setStrength(knight.getStrength() + 100);
        knight.setGold(knight.getGold() + 50);
        return new QuestResult(true, knight.getName() +  " successfully escorted the " + escortType + "!");
    }
}
