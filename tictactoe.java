package summer;

import java.util.Scanner;

public class tictactoe {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String numOne = " ";
        String numTwo = " ";
        String numThree = " ";
        String numFour = " ";
        String numFive = " ";
        String numSix = " ";
        String numSeven = " ";
        String numEight = " ";
        String numNine = " ";
        int counter = 0;
        for (int i = 0; i <= 9; i++) {
            counter += 1;
            if (!" ".equals(numOne) && numFive.equals(numOne) && numNine.equals(numOne) || !numSeven.equals(" ") && numFive.equals(numSeven) && numThree.equals(numSeven) || !numOne.equals(" ") && numTwo.equals(numOne) && numThree.equals(numOne)
            || !numOne.equals(" ") && numFour.equals(numOne) && numSeven.equals(numOne) || !numThree.equals(" ") && numSix.equals(numThree) && numNine.equals(numThree) || !numFour.equals(" ") && numFive.equals(numFour) && numSix.equals(numFour)
            || !numSeven.equals(" ") && numEight.equals(numSeven) && numNine.equals(numSeven) || !numTwo.equals(" ") && numFive.equals(numTwo) && numEight.equals(numTwo)) {
                System.out.println("congratulations, you've won!");
                break;}
            String firstLine = numOne + "|" + numTwo + "|" + numThree;
            String secondLine = "-" + "+" + "-" + "+" + "-";
            String thirdLine = numFour + "|" + numFive + "|" + numSix;
            String forthLine = "-" + "+" + "-" + "+" + "-";
            String fifthLine = numSeven + "|" + numEight + "|" + numNine;
            System.out.println("Please type in your placement from 1-9!");
            System.out.print(firstLine);
            System.out.println("");
            System.out.print(secondLine);
            System.out.println("");
            System.out.print(thirdLine);
            System.out.println("");
            System.out.print(forthLine);
            System.out.println("");
            System.out.print(fifthLine);
            int placement = Integer.parseInt(scan.nextLine());
            if (placement == 1 && counter % 2 != 0) {
                numOne = "x";
            } else if (placement == 1) {
                numOne = "o";
            }
            if (placement == 2 && counter % 2 != 0) {
                numTwo = "x";
            } else if (placement == 2) {
                numTwo = "o";
            } if (placement == 3 && counter % 2 != 0) {
                numThree = "x";
            } else if (placement == 3) {
                numThree = "o";
            }
            if (placement == 4 && counter % 2 != 0) {
                numFour = "x";
            } else if (placement == 4) {
                numFour = "o";
            }
            if (placement == 5 && counter % 2 != 0) {
                numFive = "x";
            } else if (placement == 5) {
                numFive = "o";
            }
            if (placement == 6 && counter % 2 != 0) {
                numSix = "x";
            } else if (placement == 6) {
                numSix = "o";}
                if (placement == 7 && counter % 2 != 0) {
                    numSeven = "x";
                } else if (placement == 7) {
                    numSeven = "o"; }
                    if (placement == 8 && counter % 2 != 0) {
                    numEight = "x";} else if (placement == 8) {
                        numEight = "o"; }
                 if (placement == 9 && counter % 2 != 0) {
                    numNine = "x";
                } else if (placement == 9) {
                     numNine = "o"; }


            }

        }

    }


