public class Main {
    public static void main(String[] args) {
        // Library example
        Library library = new Library();
        library.addBook(new Book("Book A", "Author A", 2001));
        library.addBook(new Book("Book B", "Author B", 2005));
        System.out.println("Books count: " + library.countBooks());

        // Bank example
        Bank bank = new Bank();
        bank.createAccount("123", 1000);
        bank.createAccount("456", 2000);
        bank.transfer("123", "456", 500);

        // Add employees
        Company company = new Company();
        company.addEmployee(new Employee("Alice", 50000, "HR"));
        company.addEmployee(new Employee("Bob", 70000, "Engineering"));
        company.addEmployee(new Employee("Charlie", 60000, "Finance"));

        // Calculate and display salaries
        System.out.println("Total Salary: " + company.calculateTotalSalary());
        System.out.println("Average Salary: " + company.calculateAverageSalary());

        // Remove an employee
        company.removeEmployee("Alice");
        System.out.println("Total Salary after removal: " + company.calculateTotalSalary());
    }
}