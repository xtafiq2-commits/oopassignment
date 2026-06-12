// Expense.java
// Models a single expense transaction.
// Category is stored as a plain String (no separate Category class needed).

public class Expense {
    private int    expenseId;
    private double amount;
    private String description;
    private String category;   // e.g. "Food", "Transport", "Other"
    private String date;       // "YYYY-MM-DD"

    public Expense(int expenseId, double amount, String description,
                   String category, String date) {
        this.expenseId   = expenseId;
        this.amount      = amount;
        this.description = description;
        this.category    = category;
        this.date        = date;
    }

    public int    getExpenseId()   { return expenseId; }
    public double getAmount()      { return amount; }
    public String getDescription() { return description; }
    public String getCategory()    { return category; }
    public String getDate()        { return date; }

    public void setAmount(double amount)           { this.amount = amount; }
    public void setDescription(String description) { this.description = description; }
    public void setCategory(String category)       { this.category = category; }
    public void setDate(String date)               { this.date = date; }

    // CSV format: id,amount,description,category,date
    @Override
    public String toString() {
        return expenseId + "," + amount + "," + description + "," + category + "," + date;
    }
}
