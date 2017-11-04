import java.util.Scanner;

public abstract class Expression {
    /**
     * Calculates the expression result
     * Abstract. Should be overriden in extend class
     * @return calculated result
     */
    public abstract double calculate();

    /**
     * Overrides Object's equals() method
     * @param other expression
     * @return true if their calculate() are equal
     */
    public boolean equals(Expression other) {
        return this.calculate() == other.calculate();
    }

    /*
    @Override
    public String toString() {
        return ...;
    }
    */
}
