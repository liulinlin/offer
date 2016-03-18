package com.liu.practice;

/**
 * Created by 刘林林 on 2016/3/13.
 */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * The TreeNode class is used to construct tree in page.
 */
public class TreeNode {
    private String id;

    private String href;

    private String text;

    private TreeNode parent;

    private List<TreeNode> children = new ArrayList<TreeNode>();

    public TreeNode() {

    }

    public TreeNode(String id, String text) {
        this.id = id;
        this.text = text;
    }

    public TreeNode(String id, String text, String href) {
        this.id = id;
        this.text = text;
        this.href = href;
    }

    /**
     * @return the href
     */
    public String getHref() {
        return href;
    }

    /**
     * @param href the href to set
     */
    public void setHref(String href) {
        this.href = href;
    }

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the parent
     */
    public TreeNode getParent() {
        return parent;
    }

    /**
     * @param parent the parent to set
     */
    public void setParent(TreeNode parent) {
        this.parent = parent;
    }

    /**
     * @return the text
     */
    public String getText() {
        return text;
    }

    /**
     * @param text the text to set
     */
    public void setText(String text) {
        this.text = text;
    }

    public void addChild(TreeNode node) {
        children.add(node);
    }

    public boolean isLeaf() {
        return children.size() == 0;
    }

    public Iterator<TreeNode> iterator() {
        return children.iterator();
    }

    public static String getTree(TreeNode node) {
        StringBuffer tree = new StringBuffer();
        int index = 0;

        if (node.isLeaf()) {
            tree.append("{");
            tree.append("id: '" + node.getId());
            tree.append("', text: '"
                    + (node.getText() == null ? "" : node.getText()));
            tree.append("', href: '"
                    + (node.getHref() == null ? "" : node.getHref()));
            tree.append("', leaf: " + node.isLeaf());
            tree.append("}");
        } else {
            Iterator<TreeNode> it = node.iterator();

            tree.append("{");
            tree.append("id: '" + node.getId());
            tree.append("', text: '" + node.getText());
            tree.append("', leaf: " + node.isLeaf());
            tree.append(", children: [");

            while (it.hasNext()) {
                if (index > 0) {
                    tree.append(", ");
                }

                TreeNode child = it.next();
                tree.append(getTree(child));
                index++;
            }

            tree.append("]");
            tree.append("}");
        }

        return tree.toString();
    }

    public static void main(String[] args) {
        TreeNode data = new TreeNode("data", "data");
        TreeNode dataImport = new TreeNode("dataImport", "dataImport");
        TreeNode dataExport = new TreeNode("dataExport", "dataExport");
        TreeNode dataEdit = new TreeNode("dataEdit", "dataEdit");
        data.addChild(dataImport);
        data.addChild(dataExport);
        data.addChild(dataEdit);
        System.err.println(getTree(data));
    }
}


