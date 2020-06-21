import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class LevelOne extends LevelOutline
{

    public LevelOne(Stage stage) 
    {
        super(stage);
    }

    public void playSceneOne() {
        // Questions and answers
        String question = "What materials do you need?";
        String[] answers = { "Needle, needle holder, sutures, local nerve block, disinfectant",
                "Needle, needle holder, sutures, heavy sedative",
                    "Needle, needle holder, sutures, scalpel, rubbing alcohol, vaseline", "Bare hands" };
        String[] responses = { "Nurse recommends anesthetic so you grab that as well " };

            // Creates Scene 2 and sets it on the primary Stage
        SceneOne s1 = new SceneOne(question, answers, responses, primaryStage, this);
        s1.setScene();
        

    }

    public void sceneOneResultAndSwitch(int score) 
    {
        scores.add(score);
        currentScene++;
        playSceneTwo();
    }

    public void playSceneTwo() 
    {
        String question = "What order do you perform the procedure?";
        String[] answers = { "Give anesthetic, disinfect the wound, place needle in needle holder",
                "Disinfect the wound, give anesthetic, place needle in needle holder, perform",
                    "Disinfect the wound, place needle in needle holder", "Place needle in needle holder" };
        String[] responses = {""};

        // Creates Scene 1 and sets it on the primary Stage
        SceneTwo s2 = new SceneTwo(question, answers, responses, primaryStage, this);
        s2.setScene();
        
    }

    public void sceneTwoResultAndSwitch(int score) 
    {
        scores.add(score);
        currentScene++;
        playSceneThree();
    }

    public void playSceneThree() 
    {
        String question = "What order will you perform the last steps?";
        String[] answers = { "Loop the suture around the needle holder, grasp the suture end with needle holder, pull the needle holder towards you and lay the final knot",
                "Loop the suture around the needle holder, grasp the suture end with needle holder, pull the needle holder towards you and lay the final knot, trim the suture ends",
                    "Loop the suture around the needle holder, grasp the suture end with needle holder, trim the suture ends", 
                    "Tie single knot like tying a shoelace over the wound" };
        String[] responses = {""};

        // Creates Scene 1 and sets it on the primary Stage
        SceneThree s3 = new SceneThree(question, answers, responses, primaryStage, this);
        s3.setScene();
    }

    public void sceneThreeResultAndSwitch(int score)
    {
        scores.add(score);
        currentScene++;
        getConclusionScreen();
    }

    public void getConclusionScreen()
    {
        Label labe = new Label("TESTSTSTSTST");
        Pane pane23 = new Pane(labe);
        Scene test = new Scene(pane23, 258, 320);
        primaryStage.setScene(test);
    }

    

    
}