package edu.kis.powp.jobs2d.drivers.adapter;

import edu.kis.legacy.drawer.panel.DrawPanelController;
import edu.kis.legacy.drawer.shape.ILine;
import edu.kis.legacy.drawer.shape.LineFactory;
import edu.kis.powp.jobs2d.Job2dDriver;
import edu.kis.powp.jobs2d.features.DrawerFeature;

public class LineDrawerAdapter  extends DrawPanelController implements Job2dDriver {

    private int startX = 0, startY = 0;
    private ILine line;

    public LineDrawerAdapter() {
        super();
    }

    public void useBasicLine(){
        line = LineFactory.getBasicLine();
    }

    public void useDottedLine(){
        line = LineFactory.getDottedLine();
    }

    public void useSpecialLine(){
        line = LineFactory.getSpecialLine();
    }

    @Override
    public void setPosition(int x, int y) {
        this.startX = x;
        this.startY = y;
    }

    @Override
    public void operateTo(int x, int y) {
        line.setStartCoordinates(this.startX, this.startY);
        line.setEndCoordinates(x, y);
        this.startX = x;
        this.startY = y;

        DrawerFeature.getDrawerController().drawLine(line);
    }

    @Override
    public String toString() {
        return "Job2d driver";
    }
}