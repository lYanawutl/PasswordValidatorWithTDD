package lib;

public class PasswordValidator {

    /**
     * คุณจะต้องเขียน Javadoc ที่สมบูรณ์ที่นี่ในอนาคต
     * เพื่ออธิบายกฎการทำงานของเมธอด
     * @param password 
     * @return ความแข็งแกร่งของpassword
     */
    // TODO: แก้ไข return type ของเมธอดนี้ให้ถูกต้อง
    public static PasswordStrength validate(String password) { 
        int minLength = 8 ;// TODO: มีอะไรขาดหายไปที่บรรทัดนี้?
            if (password == null || password.length()<=8) {
                return PasswordStrength.INVALID ;
            }
        boolean digit = false ;
        boolean lower = false ;
        boolean upper = false ;
        boolean special = false ;

        for(char c : password.toCharArray()) {
            if (Character.isDigit(c)) {
                digit = true ;
            } else if (Character.isUpperCase(c)) {
                lower = true ;
            } else if (Character.isLowerCase(c)) {
                upper = true ;
            } else if (!Character.isLetterOrDigit(c)) {
                special = true ;
            }
        }

        if(digit && lower && upper && special) {
            return PasswordStrength.STRONG ;
        } else if ((digit && lower && upper)  || (lower && upper && special)){
            return PasswordStrength.MEDIUM ;
        } else if (!digit || !lower || !upper || !special) {
            return PasswordStrength.WEAK ;
        } else {
            return PasswordStrength.INVALID ; // TODO: การคืนค่านี้ถูกต้องหรือไม่?
        }
        
    }   
}