# XML与JSON

XML是可扩展标记语言（eXtensible Markup Language）的缩写，它是一种数据表示格式，可以描述非常复杂的数据结构，常用于传输和存储数据。

### XML文档示例：

```xml
<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE note SYSTEM "book.dtd">
<!-- This is a annotation -->
<bookstore>
	<book id="1">
		<name>水浒传</name>
		<author>施耐庵</author>
		<price>35</price>
	</book>
	<book id="2">
		<name>红楼梦</name>
		<author>曹雪芹</author>
		<price>45</price>
	</book>
</bookstore>
```

### XML文档结构：

首行必定是<? xml ?>格式，首行意为表明XML文档的版本和解码方式，解码方式一般为UTF-8万国码；紧接着<!DOCTYPE note SYSTEM "book.dtd">声明的是文档定义类型（DTD：Document Type Definition），DTD为可选选项,DTD文档可以指定一系列XML文档的规则。

接下来是文档的内容，XML文档为树形结构，由根元素和子元素组成，有且仅有一个根元素如示例中的<bookstore></bookstore>,根元素可以包含任意个子元素如实例中的<book></book>,元素中又可以包含属性如<book id="1">中的id,属性内容必须用单引号(' ')或者双引号(" "),且元素必须正确的嵌套。

如果是空元素可以使用<tag/>表示,还有其他的特殊字符如<、>、&等符号,需要使用到转义字符,常用的转义字符如下:

```xml
字符	  	表示			含义
&lt;		<			less than
&gt;		>			greater than
&amp;		&			ampersand
&apos;		'			apostrophe
&quot;		"			quotation mark
```

### XML文档的正确性:

格式正确的XML（Well Formed）是指XML的格式是正确的，可以被解析器正常读取。而合法的XML是指，不但XML格式正确，而且它的数据结构可以被DTD或者XSD验证。

如何验证XML文件的正确性呢？最简单的方式是通过浏览器验证。可以直接把XML文件拖拽到浏览器窗口，如果格式错误，浏览器会报错。XML要求严格的格式,任何没有正确的嵌套的标签都会导致错误。

### XML文档的解析API:

DOM -->一次性读取XML，并在内存中表示为树形结构

DOM是Document Object Model(文档对象模型)的缩写，DOM模型就是把XML结构作为一个树形结构处理，从根节点开始，每个节点都可以包含任意个子节点。

DOM提供了以下的对象来表示XML的内容:

```
Document：代表整个XML文档；

Element：代表一个XML元素；

Attribute：代表一个元素的某个属性。
```

使用DOM API解析一个XML文档:

```java
package com.learn.a_xml;

import org.w3c.dom.Document;
import org.w3c.dom.Node;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.io.InputStream;

public class Demo01XML {
    public static void main(String[] args) {

        //创建文件对象,使用绝对路径,以防输入流找不到文档
        File xmlFile 
            = new File("C:\\Users\\xu\\Desktop\\My Learn Notes\\re-learn\\module26\\src\\bookstore.xml");
            // 1. 获取XML文件输入流
        try (InputStream input = Demo01XML.class.getClassLoader().getResourceAsStream(xmlFile.getName());){
            //判断是否加载到内存
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
        //子元素嵌套
        for (Node child = n.getFirstChild(); child != null; child = child.getNextSibling()) {
            printNode(child, indent + 1);
        }
    }

}
```

SAX-->以流的形式读取XML，使用事件回调。

SAX是Simple API for XML的缩写，它是一种基于流的解析方式，边读取XML边解析，并以事件回调的方式让调用者获取数据。因为是一边读一边解析，所以无论XML有多大，占用的内存都很小

```java

public class Demo02XML {
    public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
        InputStream input = Demo02XML.class.getResourceAsStream("/book.xml");
        SAXParserFactory spf = SAXParserFactory.newInstance();
        SAXParser saxParser = spf.newSAXParser();
        saxParser.parse(input, new MyHandler());
    }
}

```

```java
package com.learn.a_xml;

import org.xml.sax.Attributes;
import org.xml.sax.HandlerBase;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;
import org.xml.sax.helpers.DefaultHandler;

class MyHandler extends DefaultHandler {
    public void startDocument() throws SAXException {
        print("start document");
    }

    public void endDocument() throws SAXException {
        print("end document");
    }

    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        print("start element:", localName, qName);
    }

    public void endElement(String uri, String localName, String qName) throws SAXException {
        print("end element:", localName, qName);
    }

    public void characters(char[] ch, int start, int length) throws SAXException {
        print("characters:", new String(ch, start, length));
    }

    public void error(SAXParseException e) throws SAXException {
        print("error:", e);
    }

    void print(Object... objs) {
        for (Object obj : objs) {
            System.out.print(obj);
            System.out.print(" ");
        }
        System.out.println();
    }
}

```

