class Solution {
    public String solution(String[] id_pw, String[][] db) {
        String answer = "fail";
        for (String[] db_id_pw : db) {
            if (id_pw[0].equals(db_id_pw[0]) && id_pw[1].equals(db_id_pw[1])) {
                answer = "login";
                break;
            }
            if (id_pw[0].equals(db_id_pw[0])) {
                answer = "wrong pw";
            }
        }
        return answer;
    }
}