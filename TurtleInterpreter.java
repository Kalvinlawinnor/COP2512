import edu.support.AnimatedTurtle;
import edu.support.EndWorld;

import javax.swing.*;
import java.awt.*;

public class TurtleInterpreter {
    /**
     * Draw given the specified commands.
     * @param commands the String of turtle commands a combination of (F, f, +, -)
     * @param turtle the turtle to use to draw with
     * @param forwardPixels the pixels to move forward for an F or f.
     * @param degrees the number of degrees to turn for + or -
*
* NOTE: You may NOT change the parameter list, and you must use the
     * @return
     */
    public static String interpret(String commands, AnimatedTurtle turtle, int forwardPixels, int degrees) {
        // TODO: your code here

                        /** condition */
        for (int i = 0; i <= commands.length(); i++) {
            if (commands.charAt(i) == 'F') {
                turtle.penDown();
                turtle.forward(forwardPixels);
            }
             else if (commands.charAt(i) == 'f') {
                turtle.penUp();
                turtle.forward(forwardPixels);
            }
             else if (commands.charAt(i) == '+') {
                turtle.turnLeft(-degrees);
            }
             else if (commands.charAt(i) == '-') {
                turtle.turn(+degrees);
            }
        }

        return commands;
    } // end interpret

    public static void main(String[] args) {
        // TODO: your code here

        EndWorld world = new EndWorld();
        AnimatedTurtle turtle = new AnimatedTurtle(world);

                            /* SET COLOR*/
        Color turtle_rgb = new Color(29,111, 20 );
        turtle.setColor(turtle_rgb);

        Color pen_rgb = new Color(81,50, 181 );
        turtle.setPenColor(pen_rgb);


                            /* Get input */
        String commands = JOptionPane.showInputDialog("Enter command string: ");
        String pixel = JOptionPane.showInputDialog("Enter pixels: ");
        String degrees = JOptionPane.showInputDialog("Enter degrees: ");

                            /*Extra*/
        if (commands == null) {
            JOptionPane.showMessageDialog(null, "Invalid  \nPlease Enter Command!");
        }
        if (pixel == null) {
            JOptionPane.showMessageDialog(null, "Invalid  \nPlease Enter Pixel!");
        }
        if (degrees == null) {
            JOptionPane.showMessageDialog(null, "Invalid  \nPlease Enter Degrees!");
        }

        // change string pixel to integer
        int pixels = Integer.parseInt(pixel);
        int degree = Integer.parseInt(degrees);

        //draw using helper method
        interpret(commands, turtle, pixels, degree);


    } // end main

} // end class TurtleInterpreter
