package hu.nive.ujratervezes.kepesitovizsga.addigits;

public class AddDigits {

    public int addDigits(String input){
        int numbersSum = 0;
        if(input == null || "".equals(input.trim())){
            numbersSum = -1;
        } else {
            for(Character c: input.toCharArray()){
                if(Character.isDigit(c)){
                    numbersSum += Character.getNumericValue(c);
                }
            }
        }

        return numbersSum;
    }
}
