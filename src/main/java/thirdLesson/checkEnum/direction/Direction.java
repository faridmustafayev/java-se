package thirdLesson.checkEnum.direction;

public enum Direction {

    LEFT{
        public void print() {
            System.out.println("left");
        }
    },
    RIGHT {
        public void print() {
            System.out.println("right");
        }
    },
    UP {
        public void print() {
            System.out.println("up");
        }
    },
    DOWN {
        public void print() {
            System.out.println("down");
        }
    };

    public void test() {
        System.out.println("instance");
    }

    public static void testStatic() {
        System.out.println("static");
    }


    public abstract void print();

}