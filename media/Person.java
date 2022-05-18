public class Person {
    /**
     * All data fields are private in order to prevent code outside of this class 
     * to access them directly.
     */
    private int _bDay;   // birth day
    private int _bMonth; // birth month; for example, 3 means March.
    private int _bYear;  // birth year
    
    /**
     * Constructor: a special code used to initialize the fields of the class.
     * The only way to instantiate a Person object is to call new on the constructor.
     * For example: new Person(28, 2, 1945) will create a Person object with 
     * birth date February 28, 1945.
     */
    public Person(int day, int month, int year) {
        _bDay = day;
        _bMonth = month;
        _bYear = year;
    }
    
    /**
     * Uses "modulo" arithmetic to compute the number of months till the next 
     * birth day given the current month.
     * @param currentMonth an int representing the current month.
     */
    public int nMonthTillBD(int currentMonth) {
        return (_bMonth - currentMonth + 12) % 12;
    }
}