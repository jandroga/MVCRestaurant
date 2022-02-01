package restaurant.view;

import java.awt.*;

public class Viewer extends Canvas implements Runnable{

    public Viewer(){
        setSize(300,300);
        setVisible(true);
    }

    public void paint(Graphics g){

    }

    @Override
    public void run() {
        while(true){
            if(this.getGraphics() != null){
                paint(this.getGraphics());
                try{
                    Thread.sleep(10);
                } catch (Exception e){
                    System.out.println(e);
                }
            }
        }
    }
}
