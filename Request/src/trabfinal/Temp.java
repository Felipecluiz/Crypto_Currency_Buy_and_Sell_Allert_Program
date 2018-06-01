/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabfinal;

import java.util.Timer;
import java.util.TimerTask;
/**
 *

 */
public class Temp {

Timer timer;

    public Temp(int seconds) {
        
        
        
         int delay = seconds;   // delay de 5 seg.
         int interval = 1000;  // intervalo de 1 seg.
         Timer timer = new Timer();
            
        timer.scheduleAtFixedRate(new TimerTask() {
            int i = 0;
            public void run() {
                
                System.out.println("Task scheduled."+i);
                i++;
                // colocar tarefas aqui ...
                GuiTrabFinal use = new GuiTrabFinal();
                if(use.getjRadioButton4().getActionCommand().equals("Boiller")){
                	 System.out.println("mmovel");
                }
                    
                
                if (use.getjRadioButton5().isSelected()){
                    System.out.println("mmovel");
                }
                
                //System.out.println(use.getButtonGroup2().getSelection().getActionCommand());
                
                
            }
        }, delay, interval);
   
    }




}
/**
 * Simple demo that uses java.util.Timer to schedule a task 
 * to execute once 5 seconds have passed.
 */


