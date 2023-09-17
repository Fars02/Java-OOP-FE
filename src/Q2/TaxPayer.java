/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q2;

/**
 *
 * @author user
 */
public class TaxPayer extends EFilling{
    private String name;
    private String taxNo;
    private Income income;
    private Exemption exemption;
    private double taxRebate;
    
    public TaxPayer(String name, String taxNo, String assessmentType, String submitionDate)
    {
        this.name = name;
        this.taxNo = taxNo;
        this.assessmentType = assessmentType;
        this.submitionDate = submitionDate;
        //taxRebate = 0;
        
        income = new Income();
        exemption = new Exemption();
    }

    @Override
    public double calculateTotalIncome() {
       double total = income.getEmploymentSalary() + income.getRentalIncome() + income.getOthersIncome();
                
        return total;
    }

    @Override
    public double calculateTotalExemption() {
        double totalExmption = exemption.getDonation() + exemption.getInsurance() + exemption.getEpf();
        
        return totalExmption;
    }

    @Override
    public double calculateTaxableIncome() {
        double taxable = calculateTotalIncome() - (calculateTotalExemption() + INDIVIDUAL_EXEMPTION);
        
        return taxable; 
    }
    
    public double calculateIncomeTaxAmount(){
        double taxRate = 0;
        int baseTax = 0;
        int chargeIncome = 0;
        double totalAmount = 0;
        
        if(calculateTaxableIncome() < 5000)
        {
            taxRate = 0;
            baseTax = 0;
            chargeIncome = 0;
            
        }
        if(calculateTaxableIncome() > 5000 && calculateTaxableIncome() < 20000)
        {
            taxRate = 0.01;
            baseTax = 0;
            chargeIncome = 5000;
            
        }
        if(calculateTaxableIncome() > 20000 && calculateTaxableIncome() < 35000)
        {
            taxRate = 0.03;
            baseTax = 150;
            chargeIncome = 20000;
            
        }
        if(calculateTaxableIncome() > 35000 && calculateTaxableIncome() < 50000)
        {
            taxRate = 0.05;
            baseTax = 600;
            chargeIncome = 35000;
            
        }
        
        totalAmount = baseTax + ((calculateTaxableIncome() - chargeIncome) * taxRate);
        
        return totalAmount;
    }
    
    public double amountOfTaxCharged(){
        double charged = calculateIncomeTaxAmount() - taxRebate;
        
        if(charged > 0){
            return charged; 
        }else{
            return 0;
        }
        
    }
    
    public double taxToBePaid(){
        double toBePaid = amountOfTaxCharged() - exemption.getMonthly_tax_deduction();
        
        return toBePaid;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @return the taxNo
     */
    public String getTaxNo() {
        return taxNo;
    }

    /**
     * @return the income
     */
    public Income getIncome() {
        return income;
    }

    /**
     * @return the exemption
     */
    public Exemption getExemption() {
        return exemption;
    }

    /**
     * @param taxRebate the taxRebate to set
     */
    public void setTaxRebate(double taxRebate) {
        this.taxRebate = taxRebate;
    }
    
    
    
}
