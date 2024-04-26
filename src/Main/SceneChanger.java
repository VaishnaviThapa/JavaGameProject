package Main;

public class SceneChanger {
    GameManager gm;

    public SceneChanger(GameManager gm) {

        this.gm = gm;
    }

    public void showSceen1() {

        gm.ui.bgPanel[1].setVisible(true);
        gm.ui.bgPanel[2].setVisible(false);
        gm.ui.messageText.setText("Let's defeat the Demon Lord and save the world!");
    }

    public void showSceen2() {

        gm.ui.bgPanel[1].setVisible(false);
        gm.ui.bgPanel[2].setVisible(true);
        gm.ui.messageText.setText("");
    }
    public void showSceen3() {


        gm.ui.bgPanel[2].setVisible(false);
        gm.ui.bgPanel[3].setVisible(true);
        gm.ui.messageText.setText("You enter the cave. What is waiting for you inside...\n\n"
                + "*** This is the end of the demo. Thank you for playing!!! ***");
    }
    public void showGameOverScreen(int currentBgNum) {

        gm.ui.bgPanel[currentBgNum].setVisible(false);
        gm.ui.titleLabel.setVisible(true);
        gm.ui.titleLabel.setText("YOU DIED");
        gm.ui.restartButton.setVisible(true);
        gm.ui.restartButton.setText("Click here to restart");


    }
    public void existGameOverScreen() {

        gm.ui.titleLabel.setVisible(false);
        gm.ui.restartButton.setVisible(false);
        gm.player.setPlayerDefaultStatus();
    }
}