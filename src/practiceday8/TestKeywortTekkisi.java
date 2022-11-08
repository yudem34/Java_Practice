package practiceday8;

public class TestKeywortTekkisi {
    public static void main(String[] args) {

        char[] answers = {'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'};
        char[] keys    = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};

        int count = 0;

        for (int i = 0; i < answers.length; i++) {
                if (answers[i] == keys[i]) {
                    count++;
                }
            }
            System.out.println("Dogru Cevap Sayisi : " + count);
        }
    }


