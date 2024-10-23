public class CategoryII implements Category {

    private double payment;

    /**
     * Default constructor for Category II, sets the initial payment to 1000.
     */
    public CategoryII() {
        this.payment = 1000.0;  // Default payment value
    }

    /**
     *  constructor to set a custom payment for Category II.
     * This allows for flexibility in changing the payment dynamically.
     */
    public CategoryII(double payment) {
        this.payment = payment;
    }

    /**
     * Returns the name of the category, which is "Category II".
     */
    @Override
    public String getCategoryName() {
        return "Category II";
    }

    /**
     * Returns the current payment amount for Category II.
     * The default is 1000, but this can be changed via the constructor or setter method.
     */
    @Override
    public double getPayment() {
        return this.payment;
    }

    /**
     * Allows setting a new payment amount for Category II.
     */
    public void setPayment(double payment) {
        this.payment = payment;
    }
}
