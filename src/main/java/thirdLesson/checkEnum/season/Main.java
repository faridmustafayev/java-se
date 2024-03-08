package thirdLesson.checkEnum.season;

import thirdLesson.checkEnum.direction.Direction;

public class Main {
    public static void main(String[] args) {


        Season winter = Season.WINTER;

        System.out.println(winter.name());
        System.out.println(winter);
        System.out.println(Season.WINTER.name());
        System.out.println(Season.WINTER);

        System.out.println("------------------");


        System.out.println(Season.WINTER.ordinal());
        System.out.println(Season.FALL.ordinal());

        System.out.println("------------------");


        for (Season season : Season.values()) {  // Season[]
            System.out.println(season);
        }

        System.out.println("------------------");
        System.out.println("------------------");


        Direction direction = Direction.UP;

        switch (direction) {
            case  UP:
                System.out.println("go to up");break;
            case DOWN:
                System.out.println("down");break;
            case RIGHT:
                System.out.println("right");break;
            case LEFT:
                System.out.println("left");break;
            default:
                System.out.println("undefined director");break;
        }

        System.out.println("--------------");

        Direction direction1 = Direction.UP;
        direction1.test();

        System.out.println("----------");

        Direction.testStatic();

        System.out.println("----------");
        System.out.println("----------");


        Season[] seasons = Season.values();

        for (int i = 0; i < seasons.length; i++) {
            System.out.println(seasons[i] );
        }

        System.out.println("------------------");
        System.out.println("------------------");

        String[] strings = new String[]{"a", "b", "d"};
        for (String s : strings) {
            System.out.print(s + " ");
        }
        System.out.println();

        System.out.println("------------------");
        System.out.println("------------------");

        System.out.println(Season.WINTER.getHours());



    }

    public enum Season {
        WINTER {
            public String getHours() { return "10am-3pm"; }
        },
        SUMMER {
            public String getHours() { return "9am-7pm"; }
        },
        SPRING, FALL;

        public String getHours() { return "9am-5pm"; }
    }

}
