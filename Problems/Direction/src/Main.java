class Main {
    public static void main(String[] args) {
        int var1 = 100;
        int var2 = 0;
        switch (var1) {
            case 100:
                var2 += var1;
            case 200:
                var2 += var1 / 4;
                break;
            case 300:
                var2 += var1 / 10;
                break;
        }
        System.out.println(var2);
    }
}