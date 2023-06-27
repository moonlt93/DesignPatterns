package StrategyPatterns;

import StrategyPatterns.InterfaceImpl.ChangeEmotion.Happy;
import StrategyPatterns.InterfaceImpl.ChangeEmotion.Sad;
import StrategyPatterns.InterfaceImpl.ChangeMove.Running;
import StrategyPatterns.InterfaceImpl.ChangeMove.Walking;
import StrategyPatterns.RobotImpl.Atom;
import StrategyPatterns.RobotImpl.TaekwonV;

public class Client {
    public static void main(String[] args) {
        Robot robot1 = new TaekwonV("태권브이");
        Robot robot2 = new Atom("아톰");

        robot1.changeMoveStrategy(new Running());
        robot2.changeMoveStrategy(new Walking());

        robot1.changeEmotionStrategy(new Happy());
        robot2.changeEmotionStrategy(new Sad());


        System.out.println("My name is "+ robot1.getName());

        robot1.robotExplain();
        System.out.println("My name is "+ robot2.getName());

        robot2.robotExplain();
    }
}
