package Olga.lesson7;

import java.util.Scanner;

public class Computer {
    private String processor;
    private int memory;
    private String hardDisk;
    private int cycles;

    private int limit;
    private String condition = "off";

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }


    Computer(String processor, int memory, String hardDisk, int cycles){
        this.cycles = cycles;
        this.hardDisk = hardDisk;
        this.memory = memory;
        this.processor = processor;
        this.limit = cycles * 2;
    }

    public void description(){
        System.out.println("Processor: " + processor + ",\nMemory: " + memory + ",\nHard Disk: " + hardDisk +
                ",\nCycles amount: " + cycles + ".");
    }

    public void startComputer(){
        if (this.condition.equals("off") && this.limit != 0) {
            int num = (int) (Math.random() * 2);
            System.out.println("Enter a number! ");
            Scanner scanner = new Scanner(System.in);
            int a = scanner.nextInt();
            if (a == num) {
                this.setCondition("on");
                this.setLimit(limit - 1);
                System.out.println("The computer has started");
            } else {
                this.setLimit(0);
                System.out.println("You haven't guessed the number. The computer burned down");
            }
        } else if (this.condition.equals("on") && this.limit != 0){
            System.out.println("Computer has already been working");
        } else {
            System.out.println(" The computer burned down. It can be working");
        }
    }
    public void turnDownComputer(){
        if (this.condition.equals("on") && this.limit != 0) {
            int num = (int) (Math.random() * 2);
            System.out.println("Enter a number! ");
            Scanner scanner = new Scanner(System.in);
            int a = scanner.nextInt();
            if (a == num) {
                this.setCondition("off");
                this.setLimit(limit - 1);
                System.out.println("The computer has been turned off");
            } else {
                this.setLimit(0);
                System.out.println("You haven't guessed the number. The computer burned down");
            }
        } else if (this.condition.equals("off") && this.limit != 0){
            System.out.println("Computer is turned off. You can't start it");
        } else {
            System.out.println(" The computer burned down. It can be working");
        }
    }

}
