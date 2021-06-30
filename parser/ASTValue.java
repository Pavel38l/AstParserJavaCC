/**
 *  Класс для представления литералов в Ast дереве
 *  Хранит значение
 */
public class ASTValue extends SimpleNode {
    private String value;

    /**
     * Constructor.
     * @param id the id
     */
    public ASTValue(int id) {
        super(id);
    }


    /**
     * Set the name.
     * @param n the name
     */
    public void setValue(String v) {
        value = v;
    }

    /**
     * {@inheritDoc}
     * @see org.javacc.examples.jjtree.eg2.SimpleNode#toString()
     */
    public String toString() {
        return String.format("Value: %s", value);
    }

}