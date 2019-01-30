/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise4;

/**
 *
 * @author sadiq
 */
public class Exercise4 {

    /**
     * @param args the command line arguments
     * added a comment
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        calc(new HourlyWorker("sadiq",14.0,40));
        calc(new SalariedWorker("SalSadiq",14.0,50));

    }
    public static void calc(Worker obj){
        double x = obj.CalculatePay();
        System.out.println("The salary of "+ obj.getEmpName()+" is "+x);
    }
}
