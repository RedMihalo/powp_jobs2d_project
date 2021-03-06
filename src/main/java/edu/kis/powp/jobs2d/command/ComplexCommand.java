package edu.kis.powp.jobs2d.command;

import edu.kis.powp.jobs2d.Job2dDriver;

import java.util.ArrayList;
import java.util.List;

public class ComplexCommand implements DriverCommand {

    public List<DriverCommand> commands;

    public ComplexCommand() {
        this.commands = new ArrayList<>();
    }

    @Override
    public void execute(Job2dDriver driver) {

        for (DriverCommand command:commands) {
            command.execute(driver);
        }
    }
}
