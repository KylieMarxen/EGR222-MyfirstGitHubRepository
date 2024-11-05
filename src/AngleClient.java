public class AngleClient {
        public static void main(String[] args) {
            // Create a few Angle objects
            Angle angle1 = new Angle(10, 30);   // 10 degrees 30 minutes
            Angle angle2 = new Angle(12, 45);   // 12 degrees 45 minutes
            Angle angle3 = new Angle(10, 30);   // 10 degrees 30 minutes (same as angle1)
            Angle angle4 = new Angle(5, 75);    // 5 degrees 75 minutes -> should normalize to 6 degrees 15 minutes

            // Print the angles
            System.out.println("Angle 1: " + angle1);  // Should print 10d 30m
            System.out.println("Angle 2: " + angle2);  // Should print 12d 45m
            System.out.println("Angle 3: " + angle3);  // Should print 10d 30m
            System.out.println("Angle 4: " + angle4);  // Should print 6d 15m

            // Compare the angles
            System.out.println("Comparison of angle1 and angle2: " + angle1.compareTo(angle2));  // Should be negative
            System.out.println("Comparison of angle1 and angle3: " + angle1.compareTo(angle3));  // Should be 0 (equal)
            System.out.println("Comparison of angle2 and angle4: " + angle2.compareTo(angle4));  // Should be positive

            // Check for equality
            System.out.println("Is angle1 equal to angle3? " + angle1.equals(angle3));  // Should be true
            System.out.println("Is angle1 equal to angle4? " + angle1.equals(angle4));  // Should be false
        }
    }

