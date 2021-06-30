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

    
    public void setOperation(String op) {
        operation = op;
    }

    /**
     * {@inheritDoc}
     * 
     */
    public String toString() {
        return String.format("Operator: %s", operation);
    }

}