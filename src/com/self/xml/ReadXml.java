package com.self.xml;

import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class ReadXml {
         public static void main(String[] args) {
			DocumentBuilderFactory dFactory=DocumentBuilderFactory.newInstance();
			try {
				DocumentBuilder builderFactory=dFactory.newDocumentBuilder();
				 Document document= builderFactory.parse("src/example.xml");
				 NodeList nodelist=document.getElementsByTagName("class");
				 Node firstnode=nodelist.item(0).getFirstChild();
				 NodeList nodes = firstnode.getNextSibling().getChildNodes();
				 for(int i=0;i<nodes.getLength();i++){
					 System.out.println(nodes.item(i).getTextContent().trim());
				 }
				 Node firstnode2=nodelist.item(0).getFirstChild().getNextSibling().getNextSibling();
				 NodeList nodes2 = firstnode2.getNextSibling().getChildNodes();
				 for(int i=0;i<nodes2.getLength();i++){
					 System.out.println(nodes2.item(i).getTextContent().trim());
				 }
			} catch (ParserConfigurationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SAXException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
}
