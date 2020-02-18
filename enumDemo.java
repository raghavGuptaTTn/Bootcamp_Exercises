public class enumDemo {

    enum House{
        BUNGLOW(25000),
        VILLA(20000),
        MANSION(15000),
        APARTMENT(10000);

        private int value;
        House(int value){
            this.value = value;
        }

        public int getPrice(){
            return value;
        }
    }

    public static void main(String[] args) {
        for(House h : House.values()){
            System.out.println(h + " - price is $" + h.getPrice());
        }
    }
}
