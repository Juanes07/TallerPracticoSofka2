/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package filter;

/**
 *
 * @author JUANES
 */
public class UnmannedSpacecraft extends Spaceships {

    public UnmannedSpacecraft() {
        this.efficient = true;
        this.weight = 100;
        this.interplanetary = true;
    }



    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public long getWeight() {
        return weight;
    }

    public void setWeight(long weight) {
        this.weight = weight;
    }

    public boolean isEfficient() {
        return efficient;
    }

    public void setEfficient(boolean efficient) {
        this.efficient = efficient;
    }

    public boolean isInterplanetary() {
        return interplanetary;
    }

    public void setInterplanetary(boolean interplanetary) {
        this.interplanetary = interplanetary;
    }

    
    
    @Override
    public void infoGeneral() {
        
    }
    
}
