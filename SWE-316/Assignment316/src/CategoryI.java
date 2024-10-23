public class CategoryI implements Category {

    // Attribute to store the payment, initially set to 500
    private double payment;

    public CategoryI() {
        this.payment = 500.0;  // Default payment value
    }

    /**
     *  constructor to set a custom payment for Category I.
     * This allows for flexibility in changing the payment dynamically.
     * 
     */
    public CategoryI(double payment) {
        this.payment = payment;
    }

    @Override
    public String getCategoryName() {
        return "Category I";
    }

    /**
     * Returns the current payment amount for Category I.
     * The default is 500, but this can be changed via the constructor or setter method.
     */
    @Override
    public double getPayment() {
        return this.payment;
    }

    /**
     * Allows setting a new payment amount for Category I.
     */
    public void setPayment(double payment) {
        this.payment = payment;
    }
}
