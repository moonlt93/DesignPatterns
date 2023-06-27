package StrategyPatterns.InterfaceImpl.ChangeMove;

import StrategyPatterns.MoveStrategy;

public class Running implements MoveStrategy {


    @Override
    public void move() {
        System.out.println("뛰고 있는");
    }
}
