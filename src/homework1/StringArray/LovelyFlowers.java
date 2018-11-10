package homework1.StringArray;

import java.awt.*;
public class LovelyFlowers {

        private String name;
        private Color color;
        private boolean smellsGood;

        public LovelyFlowers(String name, Color color, boolean smellsGood)
        {
            super();
            this.name = name;
            this.color = color;
            this.smellsGood = smellsGood;
        }

        public String getName()
        {
            return name;
        }

        public void setName(String name)
        {
            this.name = name;
        }

        public Color getColor()
        {
            return color;
        }

        public boolean isSmellsGood()
        {
            return smellsGood;
        }


        public String toString()
        {
            if(this.smellsGood)
                return "Name: " + name + ", Color: " + color.toString() + ", Smells Good!";
            else
                return "Name: " + name + ", Color: " + color.toString() + ", Smells Bad!";
        }




}
