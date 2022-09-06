class Nishanth {
    public static void main(String[] args){
       int x = 0;
       int y = 0;

       for (int i = 0; i<=20; i++) {
        x++;
        switch (x){
            case 4, 6, 8:
                System.out.println("goteem");
                break;
        }
        if(x < 12 && x > 3) {
            y = y+5;
            System.out.println(y);
        }
    }
}
}