package starHomeWork;

class Star {
    public void firstFigure() {

        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                if (j == 6) {
                    System.out.println("*");
                } else {
                    System.out.print("*  ");
                }
            }
        }
    }

    public void secondFigure() {

        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                if (j > 0 && i < 6 && i != 0 && j != 6) {
                    System.out.print("   ");
                } else {
                    System.out.print("*  ");
                }
            }
            System.out.println();
        }
    }

    public void thirdFigure() {

        for (int i = 6; i >= 0; i--) {
            for (int j = 0; j < i; j++) {

                if (j > 0 && j <= 6 && i < 6) {
                    System.out.print("   ");

                } else {
                    System.out.print("*  ");
                }

            }
            System.out.println("*  ");
        }
    }


    public void fourthFigure() {
        for (int i = 0; i <= 6; i++) {

            for (int j = 0; j < i; j++) {
                if (j > 0 && i < 6) {
                    System.out.print("   ");

                } else {
                    System.out.print("*  ");
                }
            }
            System.out.println("*  ");
        }
    }

    public void fifthFigure() {
        for (int i = 6; i >= 0; i--) {
            for (int j = 0; j < 6; j++) {
                if (i > 0 && j != i) {
                    System.out.print("   ");
                } else {
                    System.out.print("*  ");
                }
            }
            System.out.println("* ");
        }

    }

    public void sixthFigure() {
        for (int i = 7; i > 0; i--) {
            for (int j = 7; j > 0; j--) {
                if (j > 1 && i < 7 && j != i) {
                    System.out.print("   ");
                } else {
                    System.out.print("*  ");
                }
            }
            System.out.println(" ");
        }

    }


    public void seventhFigure() {
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                if (j == i || j == 6 && i == 0
                        || j == 5 && i == 1
                        || j == 4 && i == 2
                        || j == 2 && i == 4
                        || j == 1 && i == 5
                        || j == 0 && i == 6) {
                    System.out.print("*  ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }

    public void eighthFigure() {
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                if (j == i && i < 4 || i == 0
                        || i == 1 && j == 5
                        || i == 2 && j == 4) {
                    System.out.print("*  ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }

    public void ninthFigure() {
        for (int i = 7; i > 0; i--) {
            for (int j = 7; j > 0; j--) {
                if (j == i && j < 5 || i == 1
                        || i == 3 && j == 5
                        || i == 2 && j == 6) {
                    System.out.print("*  ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
}



