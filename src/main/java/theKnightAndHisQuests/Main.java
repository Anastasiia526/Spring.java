package theKnightAndHisQuests;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import theKnightAndHisQuests.model.Knight;
import theKnightAndHisQuests.realization.EscortQuest;
import theKnightAndHisQuests.realization.KillTheDragonQuest;
import theKnightAndHisQuests.realization.SaveThePrincessQuest;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("contextQuest.xml");

        Knight knight = context.getBean("knight",Knight.class);
        KillTheDragonQuest kdrQuest = context.getBean("killTheDragonQuest",KillTheDragonQuest.class);
        System.out.println(kdrQuest.getTitle());
        System.out.println(kdrQuest.canStart(knight));
        System.out.println(kdrQuest.execute(knight));
        System.out.println("----------------------");
        EscortQuest escortQuest = context.getBean("escortQuest", EscortQuest.class);
        System.out.println(escortQuest.getTitle());
        System.out.println(escortQuest.canStart(knight));
        System.out.println(escortQuest.execute(knight));
        System.out.println("----------------------");
        SaveThePrincessQuest saveQuest = context.getBean("saveThePrincessQuest", SaveThePrincessQuest.class);
        System.out.println(saveQuest.getTitle());
        System.out.println(saveQuest.canStart(knight));
        System.out.println(saveQuest.execute(knight));

    }
}
