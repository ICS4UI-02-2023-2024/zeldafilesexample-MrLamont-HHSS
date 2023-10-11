import java.awt.image.BufferedImage;

public class Controller {
    
    private MainScreen screen;
    private Map map;

    public Controller(MainScreen screen, String mapFilename){
        this.screen = screen;
        this.map = new Map(mapFilename);
        this.updateScreen();
    }

    private void updateScreen(){
        // update the display
        this.screen.setImage(this.map.getImage());
        this.screen.setDescription(this.map.getDescription());
    }

    public void moveNorth(){
        this.map.moveNorth();
        this.updateScreen();
    }

    public void moveEast(){
        this.map.moveEast();
        this.updateScreen();
    }

    public void moveSouth(){
        this.map.moveSouth();
        this.updateScreen();
    }

    public void moveWest(){
        this.map.moveWest();
        this.updateScreen();
    }

    
}
