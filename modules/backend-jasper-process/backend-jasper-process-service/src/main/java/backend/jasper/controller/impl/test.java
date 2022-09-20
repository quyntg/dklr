package backend.jasper.controller.impl;

import java.io.StringReader;
import java.io.StringWriter;
import java.nio.charset.StandardCharsets;
import java.util.Base64;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.xml.sax.InputSource;

public class test {
    private static String convertDocumentToString(Document doc) {
        TransformerFactory tf = TransformerFactory.newInstance();
        Transformer transformer;
        try {
            transformer = tf.newTransformer();
            // below code to remove XML declaration
            // transformer.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, "yes");
            StringWriter writer = new StringWriter();
            transformer.transform(new DOMSource(doc), new StreamResult(writer));
            String output = writer.getBuffer().toString();
            return output;
        } catch (TransformerException e) {
            e.printStackTrace();
        }

        return null;
    }

    private static Document convertStringToDocument(String xmlStr) {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder;
        try
        {
            builder = factory.newDocumentBuilder();
            Document doc = builder.parse( new InputSource( new StringReader( xmlStr ) ) );
            return doc;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    public static void main(String[] args) {
        String a = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
                "<!-- Created with Jaspersoft Studio version 6.2.2.final using JasperReports Library version 6.2.2  -->\n" +
                "<!-- 2020-12-25T10:03:41 -->\n" +
                "<jasperReport\n" +
                "    xmlns=\"http://jasperreports.sourceforge.net/jasperreports\"\n" +
                "    xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:schemaLocation=\"http://jasperreports.sourceforge.net/jasperreports http://jasperreports.sourceforge.net/xsd/jasperreport.xsd\" name=\"openCPSGenJasper\" pageWidth=\"595\" pageHeight=\"842\" columnWidth=\"555\" leftMargin=\"20\" rightMargin=\"20\" topMargin=\"20\" bottomMargin=\"20\" whenResourceMissingType=\"Empty\" uuid=\"c80d748d-4d7e-4bff-ab12-ed8f6c94334c\">\n" +
                "    <property name=\"ireport.zoom\" value=\"1.4641000000000006\"/>\n" +
                "    <property name=\"ireport.x\" value=\"0\"/>\n" +
                "    <property name=\"ireport.y\" value=\"288\"/>\n" +
                "    <property name=\"com.jaspersoft.studio.data.defaultdataadapter\" value=\"One Empty Record\"/>\n" +
                "    <property name=\"net.sf.jasperreports.awt.ignore.missing.font\" value=\"true\"/>\n" +
                "    <property name=\"net.sf.jasperreports.json.date.pattern\" value=\"yyyy-MM-dd\"/>\n" +
                "    <property name=\"net.sf.jasperreports.json.number.pattern\" value=\"#,##0.##\"/>\n" +
                "    <property name=\"ireport.background.image.properties\" value=\"false,true,0.25,0,0,0,0,0,0\"/>\n" +
                "    <style name=\"Sans_Normal\" isDefault=\"true\" fontName=\"DejaVu Sans\" fontSize=\"12\" isBold=\"false\" isItalic=\"false\" isUnderline=\"false\" isStrikeThrough=\"false\"/>\n" +
                "    <style name=\"Sans_Bold\" fontName=\"DejaVu Sans\" fontSize=\"12\" isBold=\"true\" isItalic=\"false\" isUnderline=\"false\" isStrikeThrough=\"false\"/>\n" +
                "    <style name=\"Sans_Italic\" fontName=\"DejaVu Sans\" fontSize=\"12\" isBold=\"false\" isItalic=\"true\" isUnderline=\"false\" isStrikeThrough=\"false\"/>\n" +
                "    <queryString language=\"json\">\n" +
                "        <![CDATA[opencps]]>\n" +
                "    </queryString>\n" +
                "    <detail>\n" +
                "        <band height=\"50\">\n" +
                "            <property name=\"com.jaspersoft.studio.unit.height\" value=\"pixel\"/>\n" +
                "            <textField isStretchWithOverflow=\"true\" isBlankWhenNull=\"false\">\n" +
                "                <reportElement positionType=\"Float\" stretchType=\"RelativeToBandHeight\" isPrintRepeatedValues=\"false\" x=\"10\" y=\"0\" width=\"220\" height=\"34\" isPrintWhenDetailOverflows=\"true\" uuid=\"0c2b95dd-329a-450a-ba17-521212d9ff36\">\n" +
                "                    <property name=\"com.jaspersoft.studio.unit.height\" value=\"pixel\"/>\n" +
                "                </reportElement>\n" +
                "                <textElement textAlignment=\"Center\" verticalAlignment=\"Middle\" markup=\"html\">\n" +
                "                    <font fontName=\"DejaVu Sans\" size=\"12\"/>\n" +
                "                    <paragraph lineSpacing=\"Single\" leftIndent=\"0\" rightIndent=\"0\" tabStopWidth=\"0\"/>\n" +
                "                </textElement>\n" +
                "                <textFieldExpression>\n" +
                "                    <![CDATA[\"BỘ GIAO THÔNG VẬN TẢI<br><span style='font-weight: bold;'>CỤC ĐĂNG KIỂM VIỆT NAM</span>\"]]>\n" +
                "                </textFieldExpression>\n" +
                "            </textField>\n" +
                "            <textField isStretchWithOverflow=\"true\" isBlankWhenNull=\"true\">\n" +
                "                <reportElement stretchType=\"RelativeToBandHeight\" isPrintRepeatedValues=\"false\" x=\"332\" y=\"34\" width=\"110\" height=\"10\" isPrintWhenDetailOverflows=\"true\" uuid=\"37d61476-8cdc-4f44-9c18-a3050310408a\">\n" +
                "                    <property name=\"com.jaspersoft.studio.unit.height\" value=\"pixel\"/>\n" +
                "                </reportElement>\n" +
                "                <box>\n" +
                "                    <topPen lineWidth=\"1.0\"/>\n" +
                "                    <bottomPen lineWidth=\"0.0\"/>\n" +
                "                </box>\n" +
                "                <textElement textAlignment=\"Center\" verticalAlignment=\"Top\" markup=\"html\">\n" +
                "                    <font fontName=\"DejaVu Sans\" size=\"14\"/>\n" +
                "                    <paragraph lineSpacing=\"Single\" leftIndent=\"0\" rightIndent=\"0\" tabStopWidth=\"0\"/>\n" +
                "                </textElement>\n" +
                "            </textField>\n" +
                "            <textField isStretchWithOverflow=\"true\" isBlankWhenNull=\"false\">\n" +
                "                <reportElement positionType=\"Float\" stretchType=\"RelativeToBandHeight\" isPrintRepeatedValues=\"false\" x=\"230\" y=\"0\" width=\"325\" height=\"34\" isPrintWhenDetailOverflows=\"true\" uuid=\"89828d57-74d9-4d8f-ac04-7b28e0a4149d\">\n" +
                "                    <property name=\"com.jaspersoft.studio.unit.height\" value=\"pixel\"/>\n" +
                "                </reportElement>\n" +
                "                <textElement textAlignment=\"Center\" verticalAlignment=\"Middle\" markup=\"html\">\n" +
                "                    <font fontName=\"DejaVu Sans\" size=\"12\" isBold=\"true\"/>\n" +
                "                    <paragraph lineSpacing=\"Single\" leftIndent=\"0\" rightIndent=\"0\" tabStopWidth=\"0\"/>\n" +
                "                </textElement>\n" +
                "                <textFieldExpression>\n" +
                "                    <![CDATA[\"CỘNG HÒA XÃ HỘI CHỦ NGHĨA VIỆT NAM<br>Độc lập - Tự do - Hạnh phúc\"]]>\n" +
                "                </textFieldExpression>\n" +
                "            </textField>\n" +
                "        </band>\n" +
                "        <band height=\"54\">\n" +
                "            <textField isStretchWithOverflow=\"true\" isBlankWhenNull=\"false\">\n" +
                "                <reportElement positionType=\"Float\" stretchType=\"RelativeToBandHeight\" isPrintRepeatedValues=\"false\" x=\"10\" y=\"0\" width=\"545\" height=\"54\" isPrintWhenDetailOverflows=\"true\" uuid=\"c9a7d784-b157-41d3-ac68-df24bcb11dd6\">\n" +
                "                    <property name=\"com.jaspersoft.studio.unit.height\" value=\"pixel\"/>\n" +
                "                </reportElement>\n" +
                "                <textElement textAlignment=\"Center\" verticalAlignment=\"Middle\" markup=\"html\">\n" +
                "                    <font fontName=\"DejaVu Sans\" size=\"19\" isBold=\"true\" isItalic=\"true\"/>\n" +
                "                    <paragraph lineSpacing=\"Single\" leftIndent=\"0\" rightIndent=\"0\" tabStopWidth=\"0\"/>\n" +
                "                </textElement>\n" +
                "                <textFieldExpression>\n" +
                "                    <![CDATA[\"TEST\"]]>\n" +
                "                </textFieldExpression>\n" +
                "            </textField>\n" +
                "        </band>\n" +
                "        <band height=\"21\">\n" +
                "            <textField isStretchWithOverflow=\"true\">\n" +
                "                <reportElement positionType=\"Float\" x=\"0\" y=\"0\" width=\"554\" height=\"21\" uuid=\"d515f4d0-20a4-4cf5-abf8-bb47672f5cf3\">\n" +
                "                    <property name=\"com.jaspersoft.studio.unit.height\" value=\"pixel\"/>\n" +
                "                    <property name=\"com.jaspersoft.studio.unit.width\" value=\"pixel\"/>\n" +
                "                </reportElement>\n" +
                "                <textElement textAlignment=\"Justified\" markup=\"html\">\n" +
                "                    <font fontName=\"Times New Roman\" size=\"12\" isBold=\"false\"/>\n" +
                "                    <paragraph lineSpacing=\"1_1_2\" firstLineIndent=\"0\"/>\n" +
                "                </textElement>\n" +
                "                <textFieldExpression>\n" +
                "                    <![CDATA[\"Tên cơ sở sản xuất (Name of manufacturer): \" + ($F{applicantName} != null ? $F{applicantName} : \"\")]]>\n" +
                "                </textFieldExpression>\n" +
                "            </textField>\n" +
                "        </band>\n" +
                "        <band height=\"21\">\n" +
                "            <textField isStretchWithOverflow=\"true\">\n" +
                "                <reportElement positionType=\"Float\" x=\"0\" y=\"0\" width=\"554\" height=\"21\" uuid=\"3300cc4c-647c-4ebe-9b6c-472a3d5acdb7\">\n" +
                "                    <property name=\"com.jaspersoft.studio.unit.height\" value=\"pixel\"/>\n" +
                "                    <property name=\"com.jaspersoft.studio.unit.width\" value=\"pixel\"/>\n" +
                "                </reportElement>\n" +
                "                <textElement textAlignment=\"Justified\" markup=\"html\">\n" +
                "                    <font fontName=\"Times New Roman\" size=\"12\" isBold=\"false\"/>\n" +
                "                    <paragraph lineSpacing=\"1_1_2\" firstLineIndent=\"0\"/>\n" +
                "                </textElement>\n" +
                "                <textFieldExpression>\n" +
                "                    <![CDATA[\"Địa chỉ (Address): \" + ($F{applicantAddress} != null ? $F{applicantAddress} : \"\")]]>\n" +
                "                </textFieldExpression>\n" +
                "            </textField>\n" +
                "        </band>\n" +
                "    </detail>\n" +
                "    <summary>\n" +
                "        <band height=\"42\"/>\n" +
                "    </summary>\n" +
                "</jasperReport>\n";

        Document document = convertStringToDocument(a);
        String str = convertDocumentToString(document);

        String encodeToString = Base64.getEncoder().encodeToString(str.getBytes());

        String xml = new String(Base64.getMimeDecoder().decode(encodeToString),StandardCharsets.UTF_8);

        System.out.println("encodeToString "+ encodeToString);
        System.out.println("xml: " + xml);
    }
}
