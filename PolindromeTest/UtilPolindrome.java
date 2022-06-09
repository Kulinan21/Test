package PolindromeTest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class UtilPolindrome {
    public String isPolindrome(String Line) {
        int stringLength = Line.length();
        String result = "";
        for (int i = 0; i < stringLength; i++) {
            result = Line.charAt(i) + result;
        }
        return result;
    }

    @Test
    void isPolindrome(){
        //GIVEN
        String Line = "OKKO";

        //WHEN
        String actualResult = UtilPolindrome.this.isPolindrome(Line);

        //THEN
        Assertions.assertEquals(Line, actualResult);

    }
}
