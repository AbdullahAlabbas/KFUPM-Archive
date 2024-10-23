/**
 * The Category interface is used to define the structure for different student categories and
 * Each category has a name and a payment method which follows the Interface
 * Segregation Principle so different categories will implement this interface
 *
 * This interface ensures that all student categories provide an implementation for calculating 
 * payment and retrieving the category name hence supporting polymorphism where different 
 * categories can be treated diffrently.
 */


public interface Category {

   /**
    * takes the name of the category (e.g., Category I, Category II).
    * This ensures that every category has a name, following the abstraction 
    * principle by generalizing the concept of a category.
    * 
    */

   public String getCategoryName();

   /**
    * This method enforces that each category defines how payments are calculated 
    * following the Open-Closed Principle
    * by simply need to implement this interface without changing existing code.
    *
    * return the payment amount as a double.
    */
   public double getPayment();


   public void setPayment(double payment);
}
