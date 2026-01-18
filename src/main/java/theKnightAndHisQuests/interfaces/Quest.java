package theKnightAndHisQuests.interfaces;

import theKnightAndHisQuests.model.Knight;
import theKnightAndHisQuests.model.QuestResult;

public interface Quest {
    String getTitle();
    boolean canStart(Knight knight);
    QuestResult execute(Knight knight);
}
