
package javaapplication93;
class TrailerCost {
    private int days;
    private int kilometersTravelled;
    private double tarrifPerKm;

    public TrailerCost(int days, int kilometersTravelled, double tarrifPerKm) {
        this.days = days;
        this.kilometersTravelled = kilometersTravelled;
        this.tarrifPerKm = tarrifPerKm;
    }

    public int getDays() {
        return days;
    }

    public int getKilometersTravelled() {
        return kilometersTravelled;
    }

    public double getTarrifPerKm() {
        return tarrifPerKm;
    }
    public double calcBasicCost(){
    double basicCost=200;
        basicCost += days;
        return basicCost;
    
    }
    public int calcTotalCost(){
        double totalCost = 0;
        final double VAT = 0.15;
        totalCost = (int) (totalCost +(totalCost*VAT));
        
        return (int) totalCost;
    
    }


    
    
}
