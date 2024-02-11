/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mohamed Mostafa
 */
public class Timer {
    
    private ClockHand seconds;
    private ClockHand hundredths;

    @Override
    public String toString() {
        return seconds+":"+ hundredths;
    }
    public void advance(){
        
         this.hundredths.advance();

        if (this.hundredths.value() == 0) {
             
           
            this.seconds.advance();
           

           
        }
        
        
        
    }
    
    
    
    /**
     * Get the value of seconds
     *
     * @return the value of seconds
     */
    public ClockHand getSeconds() {
        return seconds;
    }

  

    public Timer() {
        seconds=new ClockHand(60);
        hundredths= new ClockHand(100);
        
    }

   
    
}
