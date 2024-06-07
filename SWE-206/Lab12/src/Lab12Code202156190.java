public class Library {
    private static final double FINE_PER_DAY = 5.00;
    private static final double MAX_FINE = 500.00;
    private static final double CS_FINE_INCREASE = 0.20;
    private static final double PHYSICS_FINE_DECREASE = 0.20;
    private static final int allowedLoanPeriod = 14;

    public static double calculateFine(int loanPeriod, String subject) {
        double fine = 0.00;

        if (loanPeriod > allowedLoanPeriod) {
            fine = (loanPeriod - allowedLoanPeriod) * FINE_PER_DAY;
            if (subject.equals("CS")) {
                fine += fine * CS_FINE_INCREASE;
            } else if (subject.equals("Physics")) {
                fine -= fine * PHYSICS_FINE_DECREASE;
            }
        }

        return Math.min(fine, MAX_FINE);
    }
}
