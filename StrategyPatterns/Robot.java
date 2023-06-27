package StrategyPatterns;

public abstract class Robot {
    private String name;
    private MoveStrategy  moveStrategy;
    private EmotionStrategy emotionStrategy;
    public void move() {
        moveStrategy.move();
    }
    public void emotion(){
        emotionStrategy.emotion();
    }
    public String getName(){
        return this.name;
    }

    public Robot(String name){
        this.name = name;
    }

    public Robot(String name,MoveStrategy moveStrategy, EmotionStrategy  emotionStrategy){
        this.name= name;
        this.moveStrategy = moveStrategy;
        this.emotionStrategy = emotionStrategy;
    }

    public void robotExplain(){
        moveStrategy.move();
        emotionStrategy.emotion();
        System.out.println("name is"+ this.name);
    }

    public void changeMoveStrategy(MoveStrategy moveStrategy){
        this.moveStrategy= moveStrategy;
    }

    public void changeEmotionStrategy(EmotionStrategy emotionStrategy){
        this.emotionStrategy = emotionStrategy;
    }

}

