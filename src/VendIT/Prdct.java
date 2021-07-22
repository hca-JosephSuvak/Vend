package vendIT;

public enum Prdct {

    SPRITE(1,100), COKE(2,50), WATER(3,30), DR_PEPPER(4,150), VITAMIN_WATER(12,75), Empty(0,0);

    public static final vendIT.Prdct EMPTY = Empty;
    public int selectNum;
    private int price;

    Prdct(int selectNum, int price){
        this.selectNum = selectNum;
        this.price = price;
    }

    public int getSelectNum(){
        return selectNum;
    }

    public int getPrice(){
        return this.price;
    }

    public static Prdct valueOf(int numberSelection){
        for(Prdct product: Prdct.values()){
            if(numberSelection == product.getSelectNum()){
                return product;
            }
        }
        return EMPTY;
    }
}