/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NewDrawingSys;

import com.mycompany.oldDrawingSys.*;

/**
 *
 * @author justi
 */
public class Shape {
    
    Circle circle;
    Rectangle rectangle;
    
    public Shape(Circle circle) {
        this.circle = circle;
    }
    
    public Shape(Rectangle rectangle) {
        this.rectangle = rectangle;
    }
    
    public void draw(int x1, int y1, int x2, int y2) {
        if (circle != null) {
            int radius = (int) Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
            circle.draw(x1, y1, radius);
            return;
        }
        if (rectangle != null) {
            int width = Math.abs(x2 - x1);
            int height = Math.abs(y2 - y1);
            rectangle.draw(x1, y1, width, height);
            return;
        }
    }
}
