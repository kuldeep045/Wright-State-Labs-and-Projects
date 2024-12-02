public class Treasure {

    public static void main(String[] args) {

        // char [][] Arr = new char[10][10];
        char[][] Arr = {

                { '-', '-', '-', '-', '-', '-', '-', '-', '-', '-' },
                { '-', '-', '-', '-', '+', '-', '-', '-', '-', '-' },
                { '-', '-', '-', '-', '-', '-', '-', '-', '-', '-' },
                { '-', '-', '-', '-', '-', '-', '-', '-', '-', '-' },
                { '-', '-', '-', '-', '-', '-', '-', '-', '-', '-' },
                { '-', '-', '-', '-', '-', '-', '-', '-', '-', '-' },
                { '-', '-', '-', '-', '-', '-', '-', '-', '-', '-' },
                { '-', '-', '-', '-', '-', '-', '-', '-', '-', '-' },
                { '-', '-', '-', '-', '-', '-', '-', '-', '-', '-' }
        };

        getCoordinates(Arr);
        digTreasue(Arr);
        //getCoordinates(Arr);

    }

    /**
     * Prints the row and column of the '+' sign given a 2D character array
     * 
     * @param map a 2d array having co-ordinate of map in + or - form
     */
    public static void getCoordinates(char[][] map) {

        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                if (map[i][j] == '+') {
                    System.out.println("start digging in row " + i + " and column " + j);
                    return;
                }
            }
        }
        System.out.println("no treasure found");
    }

    /**
     * Removes the '+' sign from the 2D character array
     * 
     * @param map a 2d array containing the co-ordinate of the treasure i + and - form
     */
    public static void digTreasue(char[][] map) {

        

        for (int i = 0; i < map.length; i++) {

            for (int j = 0; j < map[i].length; j++) {
                if (map[i][j] == '+') {
                    
                    System.out.println("started digging at row, " + i + " and column " + j);
                    map[i][j] = '-';
                    System.out.println("The treasure was gone");
                    return;
                }
            }

        }
        
    }
}