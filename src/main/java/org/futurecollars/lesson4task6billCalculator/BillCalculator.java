package org.futurecollars.lesson4task6billCalculator;

public class BillCalculator {

    double calculate(double bill, float paymentForService){
        return  bill + paymentForService;
    }
    double calculate(double bill, float paymentForService, double discount){
        return  bill * discount + paymentForService;
    }
    double calculate(double bill, float paymentForService, short paymentPackaging){
        return  bill + paymentForService + paymentPackaging;
    }
}
