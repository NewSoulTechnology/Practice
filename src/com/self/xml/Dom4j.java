package com.self.xml;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.List;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;

public class Dom4j {

	public static void writeXml(String pathname) {
		Document document = DocumentHelper.createDocument();
		Element element = document.addElement("ha");
		element.addAttribute("id", "01");
		element.addAttribute("value", "你是真傻");
		OutputFormat format = OutputFormat.createPrettyPrint();
		format.setEncoding("utf-8");
		format.setSuppressDeclaration(true);
		try {
			XMLWriter xWriter = new XMLWriter(new FileOutputStream(pathname, true), format);
			xWriter.write(document);
		} catch (UnsupportedEncodingException | FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void readXml(String pathname) {
		SAXReader saxReader = new SAXReader();
		try {
			Document document = saxReader.read(new FileInputStream(pathname));
			// 找到根节点
			Element element = document.getRootElement();
			getNodes(element);

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (DocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void getNodes(Element node) {
		//文本内容和属性
		String value="";//value对应的属性的文本
		if(node.attribute("value")!=null){
			value=node.attributeValue("value").toString().trim();
		}
		String text=node.getTextTrim();//文本
		//文本不为空
		if(value.length()!=0){
			System.out.println(node.getName()+":"+value);
		}
		if (text.length()!=0) {
			System.out.println(node.getName()+":"+text);
		}
		// 递归遍历当前节点所有的子节点
		List<Element> listElement = node.elements();// 所有一级子节点的list
		for (Element e : listElement) {// 遍历所有一级子节点
			getNodes(e);// 递归
		}
	}

	public static void main(String[] args) {
		String pathname = "src/example.xml";
		// Dom4j.writeXml(pathname);
		Dom4j.readXml("src/example.xml");
	}
}
