package A01;

import java.awt.Toolkit;



public class RekursiveDreiecke {

	/**
	 * Zeichnet ein schwarzes Dreieck in den angegebenen Viewport
	 * @param vp Der ViewPort in den gezeichnet werden soll. 
	 * @param x1 x-Koordinate des 1. Punkts.
	 * @param y1 y-Koordinate des 1. Punkts.
	 * @param x2 x-Koordinate des 2. Punkts.
	 * @param y2 y-Koordinate des 2. Punkts.
	 * @param x3 x-Koordinate des 3. Punkts.
	 * @param y3 y-Koordinate des 3. Punkts.
	 */
    private static void drawTriangle(ViewPort vp, int x1, int y1, int x2, int y2, int x3, int y3) {
    	vp.line(x1, y1, x2, y2, 0, 0, 0);
    	vp.line(x1, y1, x3, y3, 0, 0, 0);
    	vp.line(x2, y2, x3, y3, 0, 0, 0);    	
    }
    
    
    /**
     * Berechnet die Distanz zwischen zwei gegebenen Punkten.
     * @param x1 x-Koordinate des 1. Punkts.
     * @param y1 y-Koordinate des 1. Punkts.
     * @param x2 x-Koordinate des 2. Punkts.
     * @param y2 y-Koordinate des 2. Punkts.
     * @return
     */
    private static double distance(double x1, double y1, double x2, double y2) {
    	double dx = x2 - x1;
    	double dy = y2 - y1;
    	return Math.sqrt(dx * dx + dy * dy);
    }
    
    public static void drawRekTangles(ViewPort vp, int x1, int y1, int x2, int y2, int x3, int y3){
    	if (distance(x1,y1,x2,y2)>=3){
    		drawTriangle(vp, x1, y1, (x1+x2)/2, (y1+y2)/2, (x1+x3)/2, (y1+y3)/2);
    		drawRekTangles(vp, x1, y1, (x1+x2)/2, (y1+y2)/2, (x1+x3)/2, (y1+y3)/2);
    		drawTriangle(vp, (x1+x2)/2, (y1+y2)/2, x2, y2, (x2+x3)/2, (y2+y3)/2);
    		drawRekTangles(vp, (x1+x2)/2, (y1+y2)/2, x2, y2, (x2+x3)/2, (y2+y3)/2);
    		drawTriangle(vp, (x1+x3)/2, (y1+y3)/2, (x2+x3)/2, (y2+y3)/2, x3, y3);
    		drawRekTangles(vp, (x1+x3)/2, (y1+y3)/2, (x2+x3)/2, (y2+y3)/2, x3, y3);
    	}
    }
    // Für die Lösung der Aufgabe benötigen Sie mindestens eine weitere
    // Methode, und zwar eine rekursive! 
    
    
    public static void drawFunnyTriangles() {
    	int width = Toolkit.getDefaultToolkit().getScreenSize().width;
    	int height = Toolkit.getDefaultToolkit().getScreenSize().height;
    	ViewPort vp = new ViewPort("Dreiecke", width, height);
    	drawRekTangles(vp, width/2,  0,  width-100,  height,  100, height);
    	// Hier bitte Code einfüllen
    	
    }
    
    
    public static void main(String[] a) {
    	drawFunnyTriangles();
    }
	
	
	
}