/**
 * Класс для отрисовки Ast дерева
 */
public class AstDrawer {

    public void draw(SimpleNode node) {
        draw(node, "");
    }

    public void draw(SimpleNode node, String prefix) {
        System.out.println(String.format("%s%s", node.toString(prefix),
                node.jjtGetValue() != null ?
                        String.format(": %s", node.jjtGetValue().toString())
                        : ""));
        if (node.jjtGetNumChildren() > 0) {
            for (int i = 0; i < node.jjtGetNumChildren(); ++i) {
                SimpleNode n = (SimpleNode) node.jjtGetChild(i);
                if (n != null) {
                    draw(n, String.format("%s%s", prefix, " "));
                }
            }
        }
    }
}
