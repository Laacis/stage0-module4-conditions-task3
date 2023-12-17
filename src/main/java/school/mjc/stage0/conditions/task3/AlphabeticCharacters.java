package school.mjc.stage0.conditions.task3;

public class AlphabeticCharacters {
    public void vowelDeterminer(char character) {
        boolean isEnglish = (character > 64 && character < 91) || (character > 96 && character < 123);
        boolean isVowel = ((character == 'a' || character == 'A')
                        || (character == 'e' || character =='E')
                        || (character == 'o' || character == 'O')
                        || (character == 'u' || character == 'U')
                        || (character == 'y' || character == 'Y')
        );

        if(isEnglish && isVowel){
            System.out.println("Vowel");
        } else if (isEnglish) {
            System.out.println("Consonant");
        }else {
            System.out.println("wrong alphabet!");
        }
    }
}
