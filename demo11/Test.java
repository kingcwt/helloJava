package demo11;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.File;
import java.util.Iterator;
import java.util.List;

public class Test {
    public static void main(String[] args) throws DocumentException {
        // 读取xml
        // 1 创建 xml解析对象
        SAXReader sr = new SAXReader();
        // 2  读取xml文件 返回document对象
        Document dom = sr.read(new File("students.xml"));
        // 3 获取根节点
        Element studentsEle = dom.getRootElement();

        // 4 获取根节点下的多个子节点
        Iterator<Element> it1 = studentsEle.elementIterator();
        System.out.println("it1:"+it1);

        while (it1.hasNext()){
            // 4.1 获取子节点
            Element studentEle = it1.next();
            // 4.2 获取子节点的属性
            List<Attribute> atts = studentEle.attributes();
            for (Attribute attribute : atts) {
                // 4.2.1 获取属性的名字
                String name = attribute.getName();
                // 4.2.2 获取属性的值
                String value = attribute.getValue();
                System.out.println(name + " " + value);
            }
            // 4.3 获取到子节点的子节点
            Iterator<Element> it2 = studentEle.elementIterator();
            while (it2.hasNext()){
                Element el = it2.next();
                System.out.println("节点："+el.getName() + " " + el.getText());
            }
            // 5 每组输入后加一个换行
            System.out.println();
        }
    }
}
