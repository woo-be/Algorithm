class Solution {
    public int solution(int hp) {
        Ant ant = new Ant();
        return ant.cal(hp);
    }
}

class Ant {
    int armyAtk = 5;
    int soldierAtk = 3;
    int workerAtk = 1;
    
    public int cal(int hp) {
        int armyCnt = 0, soldierCnt = 0, workerCnt = 0;
        armyCnt = hp / armyAtk;
        if (hp % armyAtk != 0) {
            soldierCnt = (hp - armyCnt * armyAtk) / soldierAtk;
        }
        if ((hp - armyCnt * armyAtk) % soldierAtk != 0) {
            workerCnt = hp - armyCnt * armyAtk - soldierCnt * soldierAtk;
        }
        return armyCnt + soldierCnt + workerCnt;
    }
}