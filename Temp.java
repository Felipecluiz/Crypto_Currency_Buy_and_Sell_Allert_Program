/*


 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Timer;
import java.util.TimerTask;
/**
 *
 *
 */

public class Temp {

Timer timer;
    
    public Temp(){
}
    public Temp(int seconds) {
        
        
        
         int delay = seconds;   // delay de 5 seg.
         int interval = 60000;  // intervalo de 1 seg.
         Timer timer = new Timer();
           

           
         
         
        timer.scheduleAtFixedRate(new TimerTask() {
            int i = 0;
            public void run() {
            	int recETH=0;
            	int recSIA=0;
                System.out.println("Task scheduled."+i);
                
                // colocar tarefas aqui ...
                Calc callCalc = new Calc();
               // if((i==0) || (i%60==0)) {
                try{
                	recETH=callCalc.calcMMETH();
                	recSIA=callCalc.calcMMSIA();
                }
                
                catch(IllegalAccessException l) {
                	System.out.println("deu pau");
                }
                catch(NumberFormatException l ) {
                	System.out.println("cagou no float");
                } catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
                
               // }
                i++;
                
                //if ( recETH > 0 && ) {
                  //  timer.cancel();
                   // timer.purge();
                    //   return;
                     //}

         
                
            }
        }, delay, interval);
          
        }
       
 
   //  timer.cancel();



}
/**
 * Simple demo that uses java.util.Timer to schedule a task 
 * to execute once 5 seconds have passed.
 */


