/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Q2;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class TaxReportingMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        TaxPayer tp = new TaxPayer("Ali", "SG001212", "Individual", "20 March 2022");
        
        System.out.println("**INCOME**");
        System.out.print("Employment Salary: RM");
        tp.getIncome().setEmploymentSalary(input.nextDouble());
        System.out.print("Rental income: RM");
        tp.getIncome().setRentalIncome(input.nextDouble());
        System.out.print("Others income: RM");
        tp.getIncome().setOthersIncome(input.nextDouble());
        
        System.out.println("\n\n**EXEMPTION**");
        System.out.print("Donation: RM");
        tp.getExemption().setDonation(input.nextDouble());
        System.out.print("Monthly Tax Deduction: RM");
        tp.getExemption().setMonthly_tax_deduction(input.nextDouble());
        System.out.print("Takaful/Insurance: RM");
        tp.getExemption().setInsurance(input.nextDouble());
        System.out.print("EPF: : RM");
        tp.getExemption().setEpf(input.nextDouble());
        System.out.print("Zakat/Fitrah: RM");
        tp.setTaxRebate(input.nextDouble()); 
        
        System.out.println("\n\n**TAX SUMMARY**");
        System.out.print("\nTax payer name: " + tp.getName());
        System.out.print("\nTax Number: " + tp.getTaxNo());
        System.out.print("\nTax Submission Date: " + tp.getSubmitionDate());
        System.out.print("\nTotal annual income: RM" + tp.calculateTotalIncome());
        System.out.print("\nTax annual exemption: RM" + tp.calculateTotalExemption());
        System.out.print("\nTaxable amount: RM" + tp.calculateTaxableIncome());
        System.out.print("\nIncome tax amount: RM" + tp.calculateIncomeTaxAmount());
        System.out.print("\nAmount of tax charged: RM" + tp.amountOfTaxCharged());
        System.out.print("\nAmount of (tax to be paid) or (refund with '-' symbol: RM" + tp.taxToBePaid());
        
        
    }
    
}
