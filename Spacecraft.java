import java.util.Scanner;


public class Spacecraft {
    private int x;
    private int y;
    private int z;
    private String direction;

    public Spacecraft(int x, int y, int z, String direction) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.direction = direction;
    }

    public void move(char command) {
        if (command == 'f') {
            if ("N".equals(direction)) {
                y++;
            } else if ("S".equals(direction)) {
                y--;
            } else if ("E".equals(direction)) {
                x++;
            } else if ("W".equals(direction)) {
                x--;
            } else if ("Up".equals(direction)) {
                z++;
            } else if ("Down".equals(direction)) {
                z--;
            }
        } else if (command == 'b') {
            if ("N".equals(direction)) {
                y--;
            } else if ("S".equals(direction)) {
                y++;
            } else if ("E".equals(direction)) {
                x--;
            } else if ("W".equals(direction)) {
                x++;
            } else if ("Up".equals(direction)) {
                z--;
            } else if ("Down".equals(direction)) {
                z++;
            }
        }
    }

    public void rotate(char command) {
        if (command == 'l') {
            if ("N".equals(direction)) {
                direction = "W";
            } else if ("S".equals(direction)) {
                direction = "E";
            } else if ("E".equals(direction)) {
                direction = "N";
            } else if ("W".equals(direction)) {
                direction = "S";
            }
            //
            else if ("Up".equals(direction)) {
                direction = "N";
            }
            else if ("Down".equals(direction)) {
                direction = "W";
            }
            //
            
        } else if (command == 'r') {
            if ("N".equals(direction)) {
                direction = "E";
            } else if ("S".equals(direction)) {
                direction = "W";
            } else if ("E".equals(direction)) {
                direction = "S";
            } else if ("W".equals(direction)) {
                direction = "N";
            }
            //
            else if ("Up".equals(direction)) {
                direction = "S";
            }
            else if ("Down".equals(direction)) {
                direction = "E";
            }
            //
        }
    }

    public void tilt(char command) {
        if (command == 'u') {
            if ("Up".equals(direction)) {
                direction = "N";
            } else if ("N".equals(direction)) {
                direction = "Down";
            } else if ("Down".equals(direction)) {
                direction = "S";
            } else if ("S".equals(direction)) {
                direction = "Up";
            }
            //
            else if ("E".equals(direction)) {
                direction = "Up";
            }
            else if ("W".equals(direction)) {
                direction = "Down";
            }

        } else if (command == 'd') {
            if ("Up".equals(direction)) {
                direction = "S";
            } else if ("S".equals(direction)) {
                direction = "Down";
            } else if ("Down".equals(direction)) {
                direction = "N";
            } else if ("N".equals(direction)) {
                direction = "Up";
            }
            //
            else if ("N".equals(direction)) {
                direction = "Up";
            }
            else if ("S".equals(direction)) {
                direction = "Down";
            }
            
        }
    }

    public String getDirection() {
        return direction;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getZ() {
        return z;
    }

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter initial X coordinate: ");
        int initialX = scanner.nextInt();

        System.out.print("Enter initial Y coordinate: ");
        int initialY = scanner.nextInt();

        System.out.print("Enter initial Z coordinate: ");
        int initialZ = scanner.nextInt();

        System.out.print("Enter initial direction (N/S/E/W/Up/Down): ");
        String initialDirection = scanner.next();

        System.out.print("Enter commands (e.g., frfblrud): ");
        String commandString = scanner.next();
        char[] commands = commandString.toCharArray();

        Spacecraft spacecraft = new Spacecraft(initialX, initialY, initialZ, initialDirection);

        for (char command : commands) {
            if (command == 'f' || command == 'b') {
                spacecraft.move(command);
            } else if (command == 'l' || command == 'r') {
                spacecraft.rotate(command);
            } else if (command == 'u' || command == 'd') {
                spacecraft.tilt(command);
            }
        }

        System.out.println("Final Position: (" + spacecraft.getX() + ", " + spacecraft.getY() + ", " + spacecraft.getZ() + ")");
        System.out.println("Final Direction: " + spacecraft.getDirection());

        scanner.close();
    }
}