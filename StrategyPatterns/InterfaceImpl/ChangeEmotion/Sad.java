package StrategyPatterns.InterfaceImpl.ChangeEmotion;

import StrategyPatterns.EmotionStrategy;

public class Sad implements EmotionStrategy {


    @Override
    public void emotion() {
        System.out.println("I'm Sad");
    }

}
