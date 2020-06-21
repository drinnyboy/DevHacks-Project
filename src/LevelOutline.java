import java.util.ArrayList;

import javafx.stage.Stage;

public abstract class LevelOutline 
{
    protected static ArrayList<Integer> scores;
    protected int currentScene;
    protected Stage primaryStage;

    public LevelOutline(Stage stage)
    {
        primaryStage = stage;
        scores = new ArrayList<Integer>();
        playSceneOne();
        currentScene = 0;
    }

    public abstract void playSceneOne();

    public abstract void playSceneTwo();

    public abstract void playSceneThree();

    public void sceneOneResultAndSwitch(int score)
    {
        scores.add(score);
        currentScene++;
        playSceneTwo();
    }

    public void sceneTwoResultAndSwitch(int score)
    {
        scores.add(score);
        currentScene++;
        playSceneThree();
    }

    public void sceneThreeResultAndSwitch(int score)
    {
        scores.add(score);
        currentScene++;
        getConclusionScreen();
    }

    public int getPreviousSceneScore()
    {
        return scores.get(currentScene - 1);
    }

    public abstract void getConclusionScreen();
}