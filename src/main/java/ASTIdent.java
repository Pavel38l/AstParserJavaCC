/**
 * Узел для представления идентификатора
 * Хранит Ident name
 */
public class ASTIdent extends SimpleNode {
    private String name;

    /**
     * Constructor.
     * @param id the id
     */
    public ASTIdent(int id) {
        super(id);
    }


    /**
     * Set the name.
     * @param n the name
     */
    public void setName(String n) {
        name = n;
    }

    /**
     * {@inheritDoc}
     * @see org.javacc.examples.jjtree.eg2.SimpleNode#toString()
     */
    public String toString() {
        return String.format("Ident: %s", name);
    }

}