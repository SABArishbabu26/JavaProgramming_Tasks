public class GameSolution {
    int count = 1;
    public String findTheWinner(String colors){
        String winner = null;

        StringBuilder stringBuilder = new StringBuilder(colors);
        while(stringBuilder.toString().contains("www") || stringBuilder.toString().contains("bbb")) {
            if (checkTurn(count).equalsIgnoreCase("wendy")) {
                if (stringBuilder.toString().contains("www")) {
                    for (int i = 1; i < stringBuilder.length(); i++) {
                        if (stringBuilder.charAt(i) == 'w' && i < stringBuilder.length()-1 && stringBuilder.charAt(i - 1) == 'w' && stringBuilder.charAt(i + 1) == 'w') {
                            stringBuilder.deleteCharAt(i);
                            winner = "wendy";
                            break;
                        }
                    }
                }
            }

            if (checkTurn(count).equalsIgnoreCase("bob")) {
                if (stringBuilder.toString().contains("bbb")) {
                    for (int i = 1; i < stringBuilder.length(); i++) {
                        if (stringBuilder.charAt(i) == 'b' && i < stringBuilder.length()-1 && stringBuilder.charAt(i - 1) == 'b' && stringBuilder.charAt(i + 1) == 'b') {
                            stringBuilder.deleteCharAt(i);
                            winner = "bob";
                            break;
                        }
                    }
                }
            }
        }
        return winner;
    }

    private String checkTurn(int tmpCount) {
        String output;
        if(tmpCount%2 == 0){
            output = "bob";
        } else {
            output = "wendy";
        }
        count++;
        return output;
    }

    public static void main(String[] args) {
        GameSolution gameSolution = new GameSolution();
        System.out.println(gameSolution.findTheWinner("wwwbbbbwww"));
    }
}
