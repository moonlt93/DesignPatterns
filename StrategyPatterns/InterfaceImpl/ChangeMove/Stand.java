package StrategyPatterns.InterfaceImpl.ChangeMove;

import StrategyPatterns.MoveStrategy;

public class Stand implements MoveStrategy {


    @Override
    public void move() {
        System.out.println("서있는");
    }
}
