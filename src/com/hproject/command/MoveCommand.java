package com.hproject.command;

import com.hproject.Moveable;
import com.hproject.command.RoverCommand;

/**
 * Created by Антон on 27.11.2015.
 */
public class MoveCommand implements RoverCommand {

    private Moveable moveable;



    @Override
    public void execute() {

        moveable.move();

    }

     public  MoveCommand(Moveable moveable){


         this.moveable = moveable;

     }


}