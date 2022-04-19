public class Main {
    public static void main(String[] args) {
    
        // saved in stack
        int number = 1;

        // the reference is saved in stack, while the object itself is in the Heap
        var objectNumber = new Number(2);

    }
    static class Number {
        private int num;
        public Number(int num){
            this.num = num;
        }

        public int getNum() {
            return num;
        }

        public void setNum(int num) {
            this.num = num;
        }

        @Override
        public String toString() {
            return "Number: " + num;
        }
    }
}
