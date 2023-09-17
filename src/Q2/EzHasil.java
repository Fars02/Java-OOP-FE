/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Q2;

/**
 *
 * @author user
 */
public interface EzHasil {
    public double INDIVIDUAL_EXEMPTION = 9000.0;
    
    abstract public double calculateTotalIncome();
    abstract public double calculateTotalExemption();
    abstract public double calculateTaxableIncome();
    
}
