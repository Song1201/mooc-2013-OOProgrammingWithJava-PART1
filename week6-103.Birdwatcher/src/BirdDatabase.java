/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author lison
 */
public class BirdDatabase {
    private ArrayList<String> birdNames;
    private ArrayList<String> latinNames;
    private ArrayList<Integer> birdNums;
    
    public BirdDatabase() {
        this.birdNames = new ArrayList<String>();
        this.latinNames = new ArrayList<String>();
        this.birdNums = new ArrayList<Integer>();
    }
    
    public void add(Scanner keyboard) {
        System.out.print("Name: ");
        this.birdNames.add(keyboard.nextLine());
        System.out.print("Latin Name: ");
        this.latinNames.add(keyboard.nextLine());
        this.birdNums.add(0);
    }
    
    public void observe(Scanner keyboard) {
        int bird = this.birdNames.indexOf(keyboard.nextLine());
        if(bird==-1) {
            System.out.println("Is not a bird!");
        } else {
            this.birdNums.set(bird, this.birdNums.get(bird)+1);
        }
    }
    
    public void statistics() {
        for(int i=0;i<this.birdNames.size();i++) {
            System.out.println(this.birdNames.get(i)+" ("+this.latinNames.get(i)
                    +"): "+this.birdNums.get(i)+" observations");
        }
    }
    
    public void show(Scanner keyboard) {
        System.out.print("What? ");
        int bird = this.birdNames.indexOf(keyboard.nextLine());
        if(bird==-1) {
            System.out.println("Is not a bird!");
        } else {
            System.out.println(this.birdNames.get(bird)+" ("+
                    this.latinNames.get(bird) + "): "+this.birdNums.get(bird)+
                    " observations");
        }
    } 
}
