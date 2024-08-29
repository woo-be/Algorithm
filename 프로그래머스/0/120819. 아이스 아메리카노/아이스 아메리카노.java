class Solution {
    public int[] solution(int money) {
        IceAmericano iceAme = new IceAmericano();
        int[] answer = {iceAme.iceAmeCnt(money), iceAme.extraMoney(money)};
        return answer;
    }
}

class IceAmericano {
    
    int price = 5500;
    
    public int iceAmeCnt(int money) {
        return money / price;
    }
    
    public int extraMoney(int money) {
        return money % price;
    }
}