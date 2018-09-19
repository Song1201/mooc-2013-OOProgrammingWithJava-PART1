/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author lison
 */
public class GradeDistribution {
    private Scanner reader;
    private final int NUM_LEVELS = 6;
    private int[] numGrades;
    private final int ACCEPPT_THRESH = 1;
    
    public GradeDistribution(Scanner reader) {
        this.reader = reader;
        this.numGrades = new int[this.NUM_LEVELS];
    }

    public void read() {
        System.out.println("Type exam scores, -1 completes:");
        while(true) {
            int grade = this.reader.nextInt();
            
            if(grade==-1) {
                break;
            }
            
            if(grade<0 || grade>60) {
                continue;
            }
            
            if(grade<=29) {
                this.numGrades[0]++;
            } else if(grade>=50) {
                this.numGrades[5]++;
            } else {
                this.numGrades[(grade-30)/5+1]++;
            }           
        }
    }
    
    public void printOneLevel(int level) {
        System.out.print(level+": ");
        for(int i=0;i<this.numGrades[level];i++) {
            System.out.print("*");
        }
        System.out.println("");
    } 
        
    public void printAll() {
        System.out.println("Grade Distribution:");
        for(int level=this.NUM_LEVELS-1;level>=0;level--) {
            this.printOneLevel(level);
        }
        System.out.println("Acceptence percentage: "+acceptancePercentage());
    }
    
    public double acceptancePercentage() {
        int totalNumGrades = 0;
        for(int number:this.numGrades) {
            totalNumGrades += number;
        }
        if(totalNumGrades==0) {
            return 0;
        }
        return (double)(totalNumGrades-this.numGrades[this.ACCEPPT_THRESH-1])/
        totalNumGrades*100;
    }
    
    
}
