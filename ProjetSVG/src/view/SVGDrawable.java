package view;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FontMetrics;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.apache.batik.svggen.SVGGeneratorContext;
import org.apache.batik.svggen.SVGGraphics2D;
import org.w3c.dom.DOMImplementation;
import org.w3c.dom.Document;

/**
 * Based on https://xmlgraphics.apache.org/batik/using/svg-generator.html (with
 * minor modifications).
 *
 */
public class SVGDrawable {

	public static void main(String[] args) throws Exception {
		SVGDrawable test = new SVGDrawable();
		test.CreateBook("Thibaud", "FirstBook", 400, 200, 100, 1);
		//test.CreateBook("Thibaud", "FirstBook", 400, 200, 100, 2);
	}

	public void CreateBook(String author, String title, int height , int width, int thickness , int position ) throws IOException, ParserConfigurationException {
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		DocumentBuilder db = dbf.newDocumentBuilder();

		// Get a DOMImplementation.
		DOMImplementation domImpl = db.getDOMImplementation();

		// Create an instance of org.w3c.dom.Document.
		String svgNS = "http://www.w3.org/2000/svg";
		Document document = domImpl.createDocument(svgNS, "svg", null);

		// Create an instance of the SVG Generator.
		SVGGeneratorContext ctx = SVGGeneratorContext.createDefault(document);
		ctx.setEmbeddedFontsOn(true);
		SVGGraphics2D g = new SVGGraphics2D(ctx, false);

		// To positionate our Title and Author
		FontMetrics metrics = g.getFontMetrics();
		author="By " + author;
		int xT = (int)( width - metrics.stringWidth(title)) / 2;
		int yT = (int)(( height - metrics.getHeight()) / 2) + metrics.getAscent();
		int xA = (int)( width - metrics.stringWidth(author)) / 2;
		int yA = (int)(( height- metrics.getHeight())/1.5) + metrics.getAscent();
		System.out.println(yA);
		// Ask the test to render into the SVG Graphics2D implementation.
		g.setPaint(Color.black);
	

		// Creation whether the position is 1 : face view
		if(position == 1){
			g.drawString(title,xT , yT);
			g.drawString(author, xA, yA);
			g.setSVGCanvasSize(new Dimension(width, height));
		}

		// Creation whether the position is 2 : profile view  
		else if(position == 2){
			g.drawString(title,xT , yT);
			g.drawString(author, xA, yA);
			g.setSVGCanvasSize(new Dimension(width, height));
		}

		// Creation whether the position is 3 : profile view lying down
		else{
			g.drawString(title,xT , yT);
			g.drawString(author, xA, yA);
			g.setSVGCanvasSize(new Dimension(width, height));

		}


		// Finally, stream out SVG using UTF-8 encoding.
		boolean useCSS = true; // we want to use CSS style attributes
		try (Writer out = new OutputStreamWriter(new FileOutputStream(title + ".svg"), "UTF-8")) {
			g.stream(out, useCSS);
		}
	}
}