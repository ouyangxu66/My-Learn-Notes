package com.learn.a_xml;

import org.w3c.dom.Document;
import org.w3c.dom.Node;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.io.InputStream;

public class Demo01XML {
    public static void main(String[] args) {

        File xmlFile = new File("/book.xml");
            // 1. 获取XML文件输入流
        try (InputStream input = Demo01XML.class.getClassLoader().getResourceAsStream(xmlFile.getName());){
            if (input == null) {
                System.out.println("No bookstore file");
            }
            //2.创建DOM解析工厂
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            // 3. 创建DOM解析器
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            // 4. 解析XML文档
            Document doc = dBuilder.parse(input);
            printNode(doc,0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }


    }

    private static void printNode(Node n,int indent) {
        for (int i = 0; i < indent; i++) {
            System.out.print(' ');
        }
        switch (n.getNodeType()) {
            case Node.DOCUMENT_NODE: // Document节点
                System.out.println("Document: " + n.getNodeName());
                break;
            case Node.ELEMENT_NODE: // 元素节点
                System.out.println("Element: " + n.getNodeName());
                break;
            case Node.TEXT_NODE: // 文本
                System.out.println("Text: " + n.getNodeName() + " = " + n.getNodeValue());
                break;
            case Node.ATTRIBUTE_NODE: // 属性
                System.out.println("Attr: " + n.getNodeName() + " = " + n.getNodeValue());
                break;
            default: // 其他
                System.out.println("NodeType: " + n.getNodeType() + ", NodeName: " + n.getNodeName());
        }
        for (Node child = n.getFirstChild(); child != null; child = child.getNextSibling()) {
            printNode(child, indent + 1);
        }
    }

}
