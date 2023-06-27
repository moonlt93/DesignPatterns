package StrategyPatterns.InterfaceImpl.ChangeMove;

import StrategyPatterns.MoveStrategy;

public class Walking implements MoveStrategy {


    @Override
    public void move() {
        System.out.println("걷고있는");
    }
}
