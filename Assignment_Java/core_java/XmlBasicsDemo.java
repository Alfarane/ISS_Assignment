//package com.corejava.xml;

public class XmlBasicsDemo {

    public static void main(String[] args) {

        /*
         * XML (eXtensible Markup Language) is a markup language
         * used to store and transport data.
         * It is both human-readable and machine-readable.
         */

        // Simple XML element
        String simpleXml =
                "<student>" +
                "   <id>1</id>" +
                "   <name>Alpha</name>" +
                "</student>";

        System.out.println("Simple XML:");
        System.out.println(simpleXml);

        // XML with attributes
        String xmlWithAttributes =
                "<student id=\"1\">" +
                "   <name>Alpha</name>" +
                "   <active>true</active>" +
                "</student>";

        System.out.println("\nXML with Attributes:");
        System.out.println(xmlWithAttributes);

        // XML representing a list (multiple elements)
        String xmlList =
                "<students>" +
                "   <student>" +
                "       <id>1</id>" +
                "       <name>Alpha</name>" +
                "   </student>" +
                "   <student>" +
                "       <id>2</id>" +
                "       <name>Beta</name>" +
                "   </student>" +
                "</students>";

        System.out.println("\nXML List:");
        System.out.println(xmlList);

        // Nested XML structure
        String nestedXml =
                "<result>" +
                "   <student>" +
                "       <id>1</id>" +
                "       <name>Alpha</name>" +
                "   </student>" +
                "   <marks>" +
                "       <mark>85</mark>" +
                "       <mark>90</mark>" +
                "       <mark>88</mark>" +
                "   </marks>" +
                "</result>";

        System.out.println("\nNested XML:");
        System.out.println(nestedXml);

        /*
         * XML Rules:
         * - Tags must have opening and closing tags
         * - Tags are case-sensitive
         * - Proper nesting is mandatory
         * - Attribute values must be in quotes
         */

        /*
         * XML is commonly used in:
         * - Configuration files (web.xml, pom.xml)
         * - SOAP web services
         * - Data exchange between systems
         */

        // Example of XML used as API response
        String apiResponseXml =
                "<response>" +
                "   <status>success</status>" +
                "   <data>" +
                "       <id>1</id>" +
                "       <name>Alpha</name>" +
                "   </data>" +
                "</response>";

        System.out.println("\nSample API Response XML:");
        System.out.println(apiResponseXml);
    }
}
