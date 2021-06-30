/**
 * Класс для предстваления оператора
 * Хранит символ операции
 */
public class ASTOperator extends SimpleNode {
    private String operation;

    /**
     * Constructor.
     * @param id the id
     */
    public ASTOperator(int id) {
        super(id);
    }


    /**
     * Set the name.
     * @param n the name
     */
    public void setOperation(String op) {
        operation = op;
    }

    /**
     * {@inheritDoc}
     * @see org.javacc.examples.jjtree.eg2.SimpleNode#toString()
     */
    public String toString() {
        return String.format("Operator: %s", operation);
    }

}