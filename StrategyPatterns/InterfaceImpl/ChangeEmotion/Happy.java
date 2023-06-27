package StrategyPatterns.InterfaceImpl.ChangeEmotion;

import StrategyPatterns.EmotionStrategy;

public class Happy implements EmotionStrategy {


    @Override
    public void emotion() {
        System.out.println("I'm happy");
    }

}
