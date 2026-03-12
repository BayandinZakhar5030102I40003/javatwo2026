class InfiniteWhile {
    public static void main(String[] args) {

        int cont = 1;
        while (cont > 0) {
            System.out.println(cont++);
        }

        boolean flag = true;
        do {
            System.out.println(flag);
        }while(flag);
    }
}