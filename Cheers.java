//feedback

/*
Great work boaz!
*/


// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
            String cheer = args[0];
	    int num = Integer.parseInt (args [1]);
            String bigCheer = cheer.toUpperCase();
            String aOrAn = "";
            for (int i = 0; i<bigCheer.length(); i++) {
                switch (bigCheer.charAt(i)) {
                    case 'A':
                        aOrAn = "an";
                        break;
                    case 'E':
                        aOrAn = "an";
                        break;
                    case 'F':
                        aOrAn = "an";
                        break;
                    case 'H':
                        aOrAn = "an";
                        break;
                    case 'I':
                        aOrAn = "an";
                        break;
                    case 'L':
                        aOrAn = "an";
                        break;
                    case 'M':
                        aOrAn = "an";
                        break;
                    case 'N':
                        aOrAn = "an";
                        break;
                    case 'O':
                        aOrAn = "an";
                        break;
                    case 'R':
                        aOrAn = "an";
                        break;
                    case 'S':
                        aOrAn = "an";
                        break;
                    case 'X':
                        aOrAn = "an";
                        break;
                    default:
                        aOrAn = "a ";
                }
                System.out.println("Give me " + aOrAn +" "+ bigCheer.charAt(i) + ": " + bigCheer.charAt(i) + 
                                   "!");
            }
            System.out.println("What does that spell?");
            for (int i = 1; i<=num; i++) {
                System.out.println(bigCheer + "!!!");
            }

        }
}
