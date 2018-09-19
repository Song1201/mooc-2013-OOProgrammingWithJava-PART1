/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Random;
/**
 *
 * @author lison
 */
public class NightSky {
    private double density;
    private int width;
    private int height;
    private int numStars;
    
    public NightSky(double density) {
        this.density = density;
        this.width = 20;
        this.height = 10;
    }
    
    public NightSky(int width, int height) {
        this.width = width;
        this.height = height;
        this.density = 0.1;
    }
    
    public NightSky(double density, int width, int height) {
        this.density = density;
        this.width = width;
        this.height = height;
    }
    
    public void printLine() {
        Random randomizer = new Random();
        for(int i=0;i<this.width;i++) {
            if(randomizer.nextDouble()<=this.density) {
                System.out.print("*");
                this.numStars++;
            } else {
                System.out.print(" ");
            }
        }
        System.out.println("");
    }
    
    public void print() {
        this.numStars = 0;
        for(int row=0;row<this.height;row++) {
            this.printLine();
        }
    }
    
    public int starsInLastPrint() {
        return this.numStars;
    }
}
