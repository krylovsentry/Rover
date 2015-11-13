import java.util.Random;

/**
 * Created by Антон on 03.11.2015.
 */
public class Ground  {

    private GroundCell landscape [][];
    private int length;
    private int width;
    private Random random;



    public GroundCell getCell(int x, int y){

        return landscape[x][y];

    }
    public Ground(int length,int width){

        this.length = length;
        this.width = width;
        landscape = new GroundCell[length-1][width-1];
        random = new Random();

        for (int i = 0 ; i < landscape.length; i ++){
            for (int j = 0; j < landscape[i].length; j ++){

                if (random.nextInt(10)==7){
                    landscape[i][j] = new GroundCell(i,j,CellState.OCCUPIED);

                }


              landscape[i][j] = new GroundCell(i,j,CellState.FREE);
            }


        }
    }

    public int getLength(){

        return length;
    }

    public int getWidth(){

        return width;
    }




}