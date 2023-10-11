import java.io.File;
import java.util.Scanner;

import javax.imageio.ImageIO;

import java.awt.image.BufferedImage;

public class Map {
    private Scene[] scenes;
    private int currentRow;
    private int currentCol;
    private Scene currentScene;

    public Map(String filename){
       // create the Scanner to read from the file
       Scanner input = null;
       // try to open the file in the scanner
       try{
            input = new Scanner(new File(filename));
       }catch(Exception e){
            // if there are errors, print them
            e.printStackTrace();
       }
       // read the number of rows and columns
       int numRows = input.nextInt();
       // move to the nextLine
       input.nextLine();
       int numCols = input.nextInt();
       input.nextLine();
       // make our scene array
       int numScenes = numRows * numCols;
       this.scenes = new Scene[numScenes];
       // read in the starting position
       this.currentRow = input.nextInt();
       input.nextLine();
       this.currentCol = input.nextInt();
       input.nextLine();

       // read in all of the scene information
       for(int i = 0; i < numScenes; i++){
        // grab the image name
        String imageName = input.next();
        // load the image
        BufferedImage image = null;
        try{
            image = ImageIO.read(new File("images//" + imageName));
        }catch(Exception e){
            e.printStackTrace();
        }
        // remove the .png from the end
        imageName = imageName.replace(".png","");
        String[] sceneData = imageName.split("-");
        // getting the row and column out of the picture name
        int row = Integer.parseInt(sceneData[1]);
        int col = Integer.parseInt(sceneData[3]);

        // grab the directional data
        boolean moveNorth = input.nextBoolean();
        boolean moveEast = input.nextBoolean();
        boolean moveSouth = input.nextBoolean();
        boolean moveWest = input.nextBoolean();

        // get the description and move to the next row
        String description = input.nextLine();

        // make the scene and store it in the array
        Scene s = new Scene(row, col, image, moveNorth, 
                    moveEast, moveSouth, moveWest, 
                    description );
        this.scenes[i] = s;
       }

    }

    public Scene findScene(int row, int col){
        
    }

    public void moveNorth(){
       
    }

    public void moveEast(){
        
    }

    public void moveSouth(){
       
    }

    public void moveWest(){
       
    }

    public BufferedImage getImage(){
       
    }

    public String getDescription(){
        
    }

}
