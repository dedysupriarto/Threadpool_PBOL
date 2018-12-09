/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threadpool_pbol;

/**
 *
 * @author Dedy-PC
 */
public class proses implements Runnable{
    private int id;
    
    public proses(int id){
        this.id=id;
    
}
    @Override
    public void run() {
        
        try{
                Thread.sleep(5000);
                }catch(InterruptedException e){
                    e.printStackTrace();
                } 
    } 
}
